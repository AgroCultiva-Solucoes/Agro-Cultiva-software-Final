package dialogos;

import Classes.Atividade;
import dao.DAOatividade;
import dao.DAOsafra;
import dao.DAOpesticida;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

public class InserirAtividadePesticidaDialog extends JDialog {
    private int idSafra;
    private int idUsuario;
    private int idPesticida;
    private JTextField txtQuantidade;
    private JTextArea txtDescricao;
    private JComboBox<String> cmbPesticidas;
    private JButton btnInserir;

    public InserirAtividadePesticidaDialog(JFrame parent, String Safra) {
        super(parent, "Inserir Atividade de Pesticida", true);
        this.idUsuario = Integer.parseInt(System.getProperty("id"));
        try {
            this.idSafra = DAOsafra.obterIdSafraPorNome(Safra);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao obter ID da safra: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            dispose();
            return;
        }

        // Inicialização dos componentes
        txtQuantidade = new JTextField(20);
        txtDescricao = new JTextArea(5, 20);
        cmbPesticidas = new JComboBox<>();
        btnInserir = new JButton("Inserir");

        carregarPesticidas();
                
        // Configuração do layout e adição dos componentes
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 0;
        gbc.gridy = 0;

        // Adiciona o label e o campo para a quantidade
        panel.add(new JLabel("Quantidade:"), gbc);
        gbc.gridx++;
        panel.add(txtQuantidade, gbc);

        // Ajusta para a próxima linha
        gbc.gridx = 0;
        gbc.gridy++;

        // Adiciona o label e o campo para a descrição
        panel.add(new JLabel("Descrição:"), gbc);
        gbc.gridx++;
        gbc.gridwidth = 2; // Faz o campo de texto ocupar duas colunas
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(new JScrollPane(txtDescricao), gbc); // Adiciona o txtDescricao dentro de um JScrollPane

        // Ajusta para a próxima linha
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 1; // Reseta a largura do grid para 1
        gbc.fill = GridBagConstraints.NONE; // Reseta o preenchimento

        // Adiciona o label e o combo box para pesticidas
        panel.add(new JLabel("Pesticida:"), gbc);
        gbc.gridx++;
        gbc.gridwidth = 2; // Faz o combo box ocupar duas colunas
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(cmbPesticidas, gbc);

        // Ajusta para a próxima linha
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 1; // Reseta a largura do grid para 1
        gbc.fill = GridBagConstraints.NONE; // Reseta o preenchimento

        // Adiciona o botão de inserir
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Faz o botão ocupar o restante da linha
        gbc.anchor = GridBagConstraints.CENTER; // Centraliza o botão
        panel.add(btnInserir, gbc);

        // Adiciona o panel ao JDialog
        getContentPane().add(panel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);

        btnInserir.addActionListener((ActionEvent e) -> {
            inserirAtividade(); 
        });
    }

    private void carregarPesticidas() {
        try {
            List<String> pesticidas = DAOpesticida.obterNomesPesticidas();
            for (String pesticida : pesticidas) {
                cmbPesticidas.addItem(pesticida);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar pesticidas: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void inserirAtividade() {
        try {
            double quantidade = Double.parseDouble(txtQuantidade.getText().trim());
            if (quantidade <= 0) {
                JOptionPane.showMessageDialog(this, "Quantidade deve ser maior que zero.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            LocalDateTime agora = LocalDateTime.now();
            String descricao = txtDescricao.getText().trim();
            String tipo = "pesticida";
            String nomePesticida = (String) cmbPesticidas.getSelectedItem();
            idPesticida = DAOpesticida.obterIdPorNome(nomePesticida);

            Atividade pesticida = new Atividade();
            pesticida.setIdSafra(idSafra);
            pesticida.setIdUsuario(idUsuario);
            pesticida.setIdPesticida(idPesticida);
            pesticida.setQtdd(quantidade);
            pesticida.setDataAtividade(agora.toLocalDate());
            pesticida.setTipo(tipo);
            pesticida.setDescricao(descricao);

            DAOatividade.InserirAtividadePest(pesticida);

            JOptionPane.showMessageDialog(this, "Atividade de pesticida inserida com sucesso!");
            dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um número válido para a quantidade.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao inserir atividade: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InserirAtividadePesticidaDialog(null, "NomeDaSafra").setVisible(true));
    }
}