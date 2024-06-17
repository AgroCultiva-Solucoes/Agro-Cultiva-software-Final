package dialogos;

import Classes.Fertilizante;
import dao.DAOfertilizante;
import java.sql.SQLException;
import javax.swing.*;

public class InserirFertilizanteDialog extends JDialog {

    private JTextField txtNome;
    private JTextField txtTipo;
    private JTextArea txtDescricao;
    private JButton btnInserir;

    public InserirFertilizanteDialog(JFrame parent) {
        super(parent, "Inserir Fertilizante", true);

        txtNome = new JTextField(20);
        txtTipo = new JTextField(20);
        txtDescricao = new JTextArea(5, 20);
        btnInserir = new JButton("Inserir");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Nome:"));
        panel.add(txtNome);
        panel.add(new JLabel("Tipo:"));
        panel.add(txtTipo);
        panel.add(new JLabel("Descrição:"));
        panel.add(new JScrollPane(txtDescricao));
        panel.add(btnInserir);

        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(parent);

        btnInserir.addActionListener(e -> {
            if (camposPreenchidos()) {
                inserirFertilizante();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos antes de inserir.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private boolean camposPreenchidos() {
        String nome = txtNome.getText().trim();
        String tipo = txtTipo.getText().trim();
        return !nome.isEmpty() && !tipo.isEmpty();
    }

    private void inserirFertilizante() {
        String nome = txtNome.getText().trim();
        String tipo = txtTipo.getText().trim();
        String descricao = txtDescricao.getText().trim();

        try {
            if (camposPreenchidos()) {
                Fertilizante fertilizante = new Fertilizante(nome, tipo, descricao);
                DAOfertilizante.inserirFertilizante(fertilizante);
                JOptionPane.showMessageDialog(this, "Fertilizante inserido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos antes de inserir.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao inserir fertilizante: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
