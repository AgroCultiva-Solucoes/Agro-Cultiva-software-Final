package telas;

import Classes.Climas;
import Classes.Usuario;
import dao.DAOatividade;
import dao.DAOclima;
import dialogos.InserirClimaDialog;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuSafra extends javax.swing.JFrame {

    public MenuSafra() {
        initComponents();
    }
    
public MenuSafra(String safra) {
    this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icon_LogoAgro.jpg")).getImage());
    initComponents();
    System.setProperty("safra", safra);
    try {
        ResultSet rs = DAOatividade.contarAtividadesPorTipoSafra(safra);
        if (rs != null && rs.next()) {
            lblSafra.setText("SAFRA: " + safra);

            double plantadors = rs.getDouble("Plantado");
            double colhidors = rs.getDouble("Colhido");
            double usoFertilizante = rs.getDouble("Uso de Fertilizante");
            double usoPesticida = rs.getDouble("Uso de Pesticida");
            
            lblValorPlantado.setText(String.valueOf(plantadors));
            lblValorColhido.setText(String.valueOf(colhidors));
            lblValorFertilizante.setText(String.valueOf(usoFertilizante));
            lblValorPesticida.setText(String.valueOf(usoPesticida));
        } else {
            lblSafra.setText("SAFRA: " + safra);
            double plantadors = 0;
            double colhidors = 0;
            double usoFertilizante = 0;
            double usoPesticida = 0;
            lblValorPlantado.setText(String.valueOf(plantadors));
            lblValorColhido.setText(String.valueOf(colhidors));
            lblValorFertilizante.setText(String.valueOf(usoFertilizante));
            lblValorPesticida.setText(String.valueOf(usoPesticida));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    preencherTabela(safra);
}
    
    
private void preencherTabela(String safra) {
        try {
            List<Climas> climas = DAOclima.listarClimas(safra);
        
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Clima");
            model.addColumn("Data");
            model.addColumn("Hora");
            model.addColumn("Temperatura");
            model.addColumn("Descrição");

            for (Climas clima : climas) {
                model.addRow(new Object[]{
                    clima.getIdClima(),
                    clima.getClima(),
                    clima.getData(),
                    clima.getHora(),
                    clima.getTemperatura(),
                    clima.getDescricao()
                });
            }
        
            tbClimas.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao preencher tabela: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        quadroInfoSessao = new javax.swing.JPanel();
        lblUsuarioLogado = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JPanel();
        lblVoltar = new javax.swing.JLabel();
        lbClima = new javax.swing.JLabel();
        lbAti = new javax.swing.JLabel();
        lblSafra = new javax.swing.JLabel();
        Quadro = new javax.swing.JPanel();
        plantado = new javax.swing.JPanel();
        lblPlantado = new javax.swing.JLabel();
        lblValorPlantado = new javax.swing.JLabel();
        colhido = new javax.swing.JPanel();
        lblColhido = new javax.swing.JLabel();
        lblValorColhido = new javax.swing.JLabel();
        fertilizante = new javax.swing.JPanel();
        lblFertilizante = new javax.swing.JLabel();
        lblValorFertilizante = new javax.swing.JLabel();
        pesticida = new javax.swing.JPanel();
        lblPesticida = new javax.swing.JLabel();
        lblValorPesticida = new javax.swing.JLabel();
        lblClima = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbClimas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        navbar.setBackground(new java.awt.Color(142, 172, 198));
        navbar.setMaximumSize(new java.awt.Dimension(835, 50));
        navbar.setMinimumSize(new java.awt.Dimension(835, 50));
        navbar.setName(""); // NOI18N

        quadroInfoSessao.setBackground(new java.awt.Color(142, 172, 198));
        quadroInfoSessao.setPreferredSize(new java.awt.Dimension(200, 50));

        lblUsuarioLogado.setBackground(new java.awt.Color(142, 172, 198));
        lblUsuarioLogado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUsuarioLogado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarioLogado.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout quadroInfoSessaoLayout = new javax.swing.GroupLayout(quadroInfoSessao);
        quadroInfoSessao.setLayout(quadroInfoSessaoLayout);
        quadroInfoSessaoLayout.setHorizontalGroup(
            quadroInfoSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
        );
        quadroInfoSessaoLayout.setVerticalGroup(
            quadroInfoSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnVoltar.setBackground(new java.awt.Color(142, 172, 198));
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.setMaximumSize(new java.awt.Dimension(39, 32767));
        btnVoltar.setPreferredSize(new java.awt.Dimension(100, 50));
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });

        lblVoltar.setBackground(new java.awt.Color(142, 172, 198));
        lblVoltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblVoltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVoltar.setText(">");
        lblVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVoltar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout btnVoltarLayout = new javax.swing.GroupLayout(btnVoltar);
        btnVoltar.setLayout(btnVoltarLayout);
        btnVoltarLayout.setHorizontalGroup(
            btnVoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        btnVoltarLayout.setVerticalGroup(
            btnVoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lbClima.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbClima.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbClima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sun (1) (1).png"))); // NOI18N
        lbClima.setText("adicionar Clima");
        lbClima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbClimaMouseClicked(evt);
            }
        });

        lbAti.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbAti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clipboard (1).png"))); // NOI18N
        lbAti.setText("Atividades");
        lbAti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAtiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addComponent(quadroInfoSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbClima, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbAti, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbAti, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addComponent(lbClima, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
            .addComponent(quadroInfoSessao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
            .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
        );

        lblSafra.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblSafra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSafra.setText("SAFRA: ");
        lblSafra.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        Quadro.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        Quadro.setRequestFocusEnabled(false);

        lblPlantado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPlantado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlantado.setText("Plantado");

        lblValorPlantado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorPlantado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorPlantado.setText("0");

        javax.swing.GroupLayout plantadoLayout = new javax.swing.GroupLayout(plantado);
        plantado.setLayout(plantadoLayout);
        plantadoLayout.setHorizontalGroup(
            plantadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plantadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plantadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorPlantado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPlantado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addContainerGap())
        );
        plantadoLayout.setVerticalGroup(
            plantadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plantadoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblPlantado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblValorPlantado)
                .addGap(0, 0, 0))
        );

        lblColhido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblColhido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblColhido.setText("Colhido");

        lblValorColhido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorColhido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorColhido.setText("0");

        javax.swing.GroupLayout colhidoLayout = new javax.swing.GroupLayout(colhido);
        colhido.setLayout(colhidoLayout);
        colhidoLayout.setHorizontalGroup(
            colhidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colhidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(colhidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorColhido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblColhido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addContainerGap())
        );
        colhidoLayout.setVerticalGroup(
            colhidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colhidoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblColhido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblValorColhido)
                .addGap(0, 0, 0))
        );

        lblFertilizante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFertilizante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFertilizante.setText("Uso de fertilizante");

        lblValorFertilizante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorFertilizante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorFertilizante.setText("0");

        javax.swing.GroupLayout fertilizanteLayout = new javax.swing.GroupLayout(fertilizante);
        fertilizante.setLayout(fertilizanteLayout);
        fertilizanteLayout.setHorizontalGroup(
            fertilizanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblValorFertilizante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblFertilizante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
        );
        fertilizanteLayout.setVerticalGroup(
            fertilizanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fertilizanteLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblFertilizante, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblValorFertilizante)
                .addGap(0, 0, 0))
        );

        lblPesticida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPesticida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPesticida.setText("Uso de pesticida");

        lblValorPesticida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorPesticida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorPesticida.setText("0");

        javax.swing.GroupLayout pesticidaLayout = new javax.swing.GroupLayout(pesticida);
        pesticida.setLayout(pesticidaLayout);
        pesticidaLayout.setHorizontalGroup(
            pesticidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesticidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pesticidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorPesticida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPesticida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pesticidaLayout.setVerticalGroup(
            pesticidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesticidaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblPesticida, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblValorPesticida)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout QuadroLayout = new javax.swing.GroupLayout(Quadro);
        Quadro.setLayout(QuadroLayout);
        QuadroLayout.setHorizontalGroup(
            QuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuadroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(plantado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(colhido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(fertilizante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pesticida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        QuadroLayout.setVerticalGroup(
            QuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fertilizante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(colhido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pesticida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(plantado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblClima.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblClima.setText("CLIMAS");

        tbClimas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Data", "Clima", "Hora", "Temperatura", "Umidade", "Precipitação", "Vento"
            }
        ));
        jScrollPane4.setViewportView(tbClimas);

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navbar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Quadro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSafra, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClima, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSafra)
                .addGap(12, 12, 12)
                .addComponent(Quadro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblClima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        dispose();
        Safra m = new Safra();
        m.setVisible(true);
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void lbClimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbClimaMouseClicked
        InserirClimaDialog dialog = new InserirClimaDialog(this, System.getProperty("safra"));
            dialog.setVisible(true);
            try {
                preencherTabela(System.getProperty("safra"));
            } catch (Exception e) {
                e.printStackTrace();
            }
    }//GEN-LAST:event_lbClimaMouseClicked

    private void lbAtiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAtiMouseClicked
        dispose();
        Atividades ati = new Atividades();
        ati.setVisible(true);
    }//GEN-LAST:event_lbAtiMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Usuario validarPermanencia = new Usuario();
        
        if(!validarPermanencia.validarPermanencia()){
            this.dispose();
            new Index().setVisible(true);
        }
    }//GEN-LAST:event_formWindowActivated


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                     break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuSafra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Quadro;
    private javax.swing.JPanel btnVoltar;
    private javax.swing.JPanel colhido;
    private javax.swing.JPanel container;
    private javax.swing.JPanel fertilizante;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbAti;
    private javax.swing.JLabel lbClima;
    private javax.swing.JLabel lblClima;
    private javax.swing.JLabel lblColhido;
    private javax.swing.JLabel lblFertilizante;
    private javax.swing.JLabel lblPesticida;
    private javax.swing.JLabel lblPlantado;
    private javax.swing.JLabel lblSafra;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JLabel lblValorColhido;
    private javax.swing.JLabel lblValorFertilizante;
    private javax.swing.JLabel lblValorPesticida;
    private javax.swing.JLabel lblValorPlantado;
    private javax.swing.JLabel lblVoltar;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel pesticida;
    private javax.swing.JPanel plantado;
    private javax.swing.JPanel quadroInfoSessao;
    private javax.swing.JTable tbClimas;
    // End of variables declaration//GEN-END:variables
}
