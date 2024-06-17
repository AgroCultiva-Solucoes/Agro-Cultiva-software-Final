package dialogos;

import Classes.Climas;
import dao.DAOclima;
import dao.DAOsafra;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import javax.swing.*;

public class InserirClimaDialog extends JDialog {

    private int idSafra;
    private JTextField txtClima;
    private JTextField txtData;
    private JTextField txtHora;
    private JTextField txtTemperatura;
    private JTextField txtDescricao;
    private JButton btnInserir;

    public InserirClimaDialog(JFrame parent, String safra) {
        super(parent, "Inserir Clima", true);
        try {
            this.idSafra = DAOsafra.obterIdSafraPorNome(safra);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao obter ID da safra: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            dispose();
        }

        txtClima = new JTextField(20);
        txtData = new JTextField(10);
        txtHora = new JTextField(10);
        txtTemperatura = new JTextField(10);
        txtDescricao = new JTextField(20); // Adicionando campo para descrição
        btnInserir = new JButton("Inserir");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Clima:"), gbc);
        gbc.gridy++;
        panel.add(new JLabel("Data (yyyy-MM-dd):"), gbc);
        gbc.gridy++;
        panel.add(new JLabel("Hora (HH:mm:ss):"), gbc);
        gbc.gridy++;
        panel.add(new JLabel("Temperatura (ºC):"), gbc);
        gbc.gridy++;
        panel.add(new JLabel("Descrição:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(txtClima, gbc);
        gbc.gridy++;
        panel.add(txtData, gbc);
        gbc.gridy++;
        panel.add(txtHora, gbc);
        gbc.gridy++;
        panel.add(txtTemperatura, gbc);
        gbc.gridy++;
        panel.add(txtDescricao, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        panel.add(btnInserir, gbc);

        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(parent);

        btnInserir.addActionListener(e -> {
            if (camposPreenchidos()) {
                inserirClima();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos antes de inserir.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private boolean camposPreenchidos() {
        String clima = txtClima.getText().trim();
        String data = txtData.getText().trim();
        String hora = txtHora.getText().trim();
        String temperatura = txtTemperatura.getText().trim();
        String descricao = txtDescricao.getText().trim(); // Obtendo descrição

        return !clima.isEmpty() && !data.isEmpty() && !hora.isEmpty() && !temperatura.isEmpty() && !descricao.isEmpty();
    }

    private void inserirClima() {
        String clima = txtClima.getText().trim();
        String data = txtData.getText().trim();
        String hora = txtHora.getText().trim();
        float temperatura = Float.parseFloat(txtTemperatura.getText().trim());
        String descricao = txtDescricao.getText().trim(); // Obtendo descrição

        try {
            LocalDate localDate = LocalDate.parse(data);
            LocalTime localTime = LocalTime.parse(hora);

            Climas novoClima = new Climas();
            novoClima.setIdSafra(idSafra);
            novoClima.setClima(clima);
            novoClima.setData(localDate);
            novoClima.setHora(localTime);
            novoClima.setTemperatura(temperatura);
            novoClima.setDescricao(descricao); // Definindo a descrição

            DAOclima.inserirClima(novoClima);
            JOptionPane.showMessageDialog(this, "Clima inserido com sucesso!");

        } catch (NumberFormatException | DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Erro ao inserir clima: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
