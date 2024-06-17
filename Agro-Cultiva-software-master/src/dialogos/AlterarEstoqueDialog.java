package dialogos;

import Classes.Estoque;
import dao.DAOestoque;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class AlterarEstoqueDialog extends JDialog {

    private JTextField txtQuantidade;
    private JTextField txtValor;
    private JButton btnAlterar;
    private int idEstoque;

    public AlterarEstoqueDialog(JFrame parent, int idEstoque) {
        super(parent, "Alterar Estoque", true);
        this.idEstoque = idEstoque;

        txtQuantidade = new JTextField(10);
        txtValor = new JTextField(10);
        btnAlterar = new JButton("Alterar");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Quantidade:"));
        panel.add(txtQuantidade);
        panel.add(new JLabel("Valor:"));
        panel.add(txtValor);
        panel.add(btnAlterar);

        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(parent);

        btnAlterar.addActionListener(e -> {
            if (camposPreenchidos()) {
                alterarEstoque();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos antes de alterar.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Monitorar alterações nos campos de texto para ativar/desativar o botão
        txtQuantidade.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkCamposPreenchidos();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkCamposPreenchidos();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkCamposPreenchidos();
            }
        });

        txtValor.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkCamposPreenchidos();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkCamposPreenchidos();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkCamposPreenchidos();
            }
        });

        checkCamposPreenchidos();
        carregarDadosEstoque();
    }

    private void carregarDadosEstoque() {
        try {
            Estoque estoque = DAOestoque.buscarEstoquePorId(idEstoque);
            if (estoque != null) {
                txtQuantidade.setText(String.valueOf(estoque.getQuantidade()));
                txtValor.setText(String.valueOf(estoque.getPreco()));
            } else {
                JOptionPane.showMessageDialog(this, "Estoque não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                dispose();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados do estoque: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            dispose();
        }
    }

    private boolean camposPreenchidos() {
        String quantidade = txtQuantidade.getText().trim();
        String valor = txtValor.getText().trim();
        return !quantidade.isEmpty() && !valor.isEmpty();
    }

    private void checkCamposPreenchidos() {
        btnAlterar.setEnabled(camposPreenchidos());
    }

    private void alterarEstoque() {
        try {
            double novaQuantidade = Double.parseDouble(txtQuantidade.getText().trim());
            double novoValor = Double.parseDouble(txtValor.getText().trim());

            Estoque estoque = new Estoque(idEstoque, novaQuantidade, novoValor);
            DAOestoque.alterarEstoquePorId(estoque);
            JOptionPane.showMessageDialog(this, "Estoque alterado com sucesso!");
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao alterar estoque: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
