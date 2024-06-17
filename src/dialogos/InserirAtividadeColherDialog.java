package dialogos;

import Classes.Atividade;
import dao.DAOatividade;
import dao.DAOsafra;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class InserirAtividadeColherDialog extends JDialog {
    private int idSafra;
    private int idUsuario;
    private JTextField txtQuantidade;
    private JTextArea txtDescricao;
    private JButton btnInserir;

    public InserirAtividadeColherDialog(JFrame parent, String Safra) {
        super(parent, "Inserir Atividade de Colheita", true);
        this.idUsuario = Integer.parseInt(System.getProperty("id"));
        try {
            this.idSafra = DAOsafra.obterIdSafraPorNome(Safra);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao obter ID da safra: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            dispose();
        }

        txtQuantidade = new JTextField(20);
        txtDescricao = new JTextArea(5, 20);
        btnInserir = new JButton("Inserir");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Quantidade:"), gbc);

        gbc.gridy++;
        panel.add(new JLabel("Descrição:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(txtQuantidade, gbc);

        gbc.gridy++;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(new JScrollPane(txtDescricao), gbc);

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

    private void inserirAtividade() {
        try {
            double quantidade = Double.parseDouble(txtQuantidade.getText().trim());
            LocalDateTime agora = LocalDateTime.now();
            String descricao = txtDescricao.getText().trim();
            String tipo = "colheita";
            
            Atividade colher = new Atividade();
            colher.setIdSafra(idSafra);
            colher.setIdUsuario(idUsuario);
            colher.setQtdd(quantidade);
            colher.setDataAtividade(agora.toLocalDate());
            colher.setTipo(tipo);
            colher.setDescricao(descricao);
            
            DAOatividade.InserirAtividade(colher);

            JOptionPane.showMessageDialog(this, "Atividade de colheita inserida com sucesso!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro ao inserir atividade: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InserirAtividadeColherDialog(null, null).setVisible(true));
    }
}