package dialogos;

import Classes.Atividade;
import dao.DAOatividade;
import dao.DAOsafra;
import dao.DAOfertilizante;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

public class InserirAtividadeFertiDialog extends JDialog {
    private int idSafra;
    private int idUsuario;
    private int idFertilizante;
    private JTextField txtQuantidade;
    private JTextArea txtDescricao;
    private JComboBox<String> cmbFertilizantes;
    private JButton btnInserir;

    public InserirAtividadeFertiDialog(JFrame parent, String Safra) {
        super(parent, "Inserir Atividade de Fertilização", true);
        this.idUsuario = Integer.parseInt(System.getProperty("id"));
        try {
            this.idSafra = DAOsafra.obterIdSafraPorNome(Safra);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao obter ID da safra: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            dispose();
        }

        txtQuantidade = new JTextField(20);
        txtDescricao = new JTextArea(5, 20);
        cmbFertilizantes = new JComboBox<>();
        btnInserir = new JButton("Inserir");

        carregarFertilizantes();

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Quantidade:"), gbc);

        gbc.gridy++;
        panel.add(new JLabel("Descrição:"), gbc);

        gbc.gridy++;
        panel.add(new JLabel("Fertilizante:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(txtQuantidade, gbc);

        gbc.gridy++;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(new JScrollPane(txtDescricao), gbc);

        gbc.gridy++;
        panel.add(cmbFertilizantes, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        panel.add(btnInserir, gbc);

        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(parent);

        btnInserir.addActionListener((ActionEvent e) -> {
            inserirAtividade(); 
            dispose();
        });
    }

    private void carregarFertilizantes() {
        try {
            List<String> fertilizantes = DAOfertilizante.obterNomesFertilizantes();
            for (String fertilizante : fertilizantes) {
                cmbFertilizantes.addItem(fertilizante);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar fertilizantes: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void inserirAtividade() {
        try {
            double quantidade = Double.parseDouble(txtQuantidade.getText().trim());
            LocalDateTime agora = LocalDateTime.now();
            String descricao = txtDescricao.getText().trim();
            String tipo = "fertilizante";
            String nomeFertilizante = (String) cmbFertilizantes.getSelectedItem();
            idFertilizante = DAOfertilizante.obterIdPorNome(nomeFertilizante);

            Atividade fertilizacao = new Atividade();
            fertilizacao.setIdSafra(idSafra);
            fertilizacao.setIdUsuario(idUsuario);
            fertilizacao.setIdFertilizante(idFertilizante);
            fertilizacao.setQtdd(quantidade);
            fertilizacao.setDataAtividade(agora.toLocalDate());
            fertilizacao.setTipo(tipo);
            fertilizacao.setDescricao(descricao);

            DAOatividade.InserirAtividadeFert(fertilizacao);

            JOptionPane.showMessageDialog(this, "Atividade de fertilização inserida com sucesso!");
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao inserir atividade: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InserirAtividadeFertiDialog(null, "NomeDaSafra").setVisible(true));
    }
}