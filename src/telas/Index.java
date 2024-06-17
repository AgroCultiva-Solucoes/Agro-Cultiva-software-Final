package telas;

import dao.DAOusuario;
import Classes.Usuario;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Index extends javax.swing.JFrame {

    public Index() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icon_LogoAgro.jpg")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblEmail = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JFormattedTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        BtnPassword = new javax.swing.JButton();
        ckSenha = new javax.swing.JCheckBox();
        img_LogoAgro = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        fundo1 = new javax.swing.JLabel();
        fundo2 = new javax.swing.JLabel();
        fundo3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AgroCultiva Soluções");
        setMinimumSize(new java.awt.Dimension(640, 390));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("E-mail");
        getContentPane().add(lblEmail);
        lblEmail.setBounds(350, 100, 40, 16);

        txtUsuario.setBackground(new java.awt.Color(245, 245, 245));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsuario.setMinimumSize(new java.awt.Dimension(20, 30));
        txtUsuario.setPreferredSize(new java.awt.Dimension(10, 20));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(350, 120, 220, 30);

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(350, 160, 60, 16);

        txtSenha.setBackground(new java.awt.Color(245, 245, 245));
        txtSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(350, 180, 220, 30);

        BtnPassword.setBackground(new java.awt.Color(245, 245, 245));
        BtnPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnPassword.setText("Enviar");
        BtnPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(BtnPassword);
        BtnPassword.setBounds(390, 270, 140, 33);

        ckSenha.setBackground(getForeground());
        ckSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ckSenha.setForeground(new java.awt.Color(242, 242, 242));
        ckSenha.setText("Exibir Senha");
        ckSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckSenhaActionPerformed(evt);
            }
        });
        ckSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ckSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(ckSenha);
        ckSenha.setBounds(350, 230, 100, 20);

        img_LogoAgro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Agrocultiva_Orquídea___1_-removebg-preview.png"))); // NOI18N
        getContentPane().add(img_LogoAgro);
        img_LogoAgro.setBounds(-100, 40, 390, 280);

        lblTitulo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Boas vindas!");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(410, 50, 100, 23);

        fundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ciano degrade.png"))); // NOI18N
        getContentPane().add(fundo1);
        fundo1.setBounds(300, -60, 340, 660);

        fundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/branco neve.png"))); // NOI18N
        getContentPane().add(fundo2);
        fundo2.setBounds(0, 60, 300, 340);

        fundo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/branco neve.png"))); // NOI18N
        getContentPane().add(fundo3);
        fundo3.setBounds(0, 0, 300, 100);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void BtnPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPasswordActionPerformed
       login();
    }

    public void abrirTelaMenu(){
    dispose();

    Menu telaMenu = new Menu();
    telaMenu.setVisible(true);
    }//GEN-LAST:event_BtnPasswordActionPerformed

    private void login() {
    String login = txtUsuario.getText();
    String senha = new String(txtSenha.getPassword());

    try {
        Usuario usuario = DAOusuario.Entrar(login, senha);
        if (usuario != null && usuario.getCpf() != null && !usuario.getCpf().isEmpty()) {
            System.setProperty("id", String.valueOf(usuario.getId()));
            System.setProperty("nome", usuario.getNome());
            System.setProperty("usuario", usuario.getUsuario());
            System.setProperty("email", usuario.getEmail());
            System.setProperty("cpf", usuario.getCpf());
            System.setProperty("adm", String.valueOf(usuario.isAdm()));
            if(System.getProperty("adm").equals("true")){
                JOptionPane.showMessageDialog(null, "Seja bem vindo, Staff " + usuario.getNome() + "!", "Entrando", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Seja bem vindo, Sr(a) " + usuario.getNome() + "!", "Entrando", JOptionPane.INFORMATION_MESSAGE);
            } 
            abrirTelaMenu();
        } else {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } 
    catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, e + "Erro ao tentar logar.", "Erro", JOptionPane.INFORMATION_MESSAGE);
    }
    }
    
    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void ckSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckSenhaActionPerformed
        if (ckSenha.isSelected()){
            txtSenha.setEchoChar((char)0);
        }else{
        txtSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_ckSenhaActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_formKeyPressed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void ckSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ckSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_ckSenhaKeyPressed

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
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPassword;
    private javax.swing.JCheckBox ckSenha;
    private javax.swing.JLabel fundo1;
    private javax.swing.JLabel fundo2;
    private javax.swing.JLabel fundo3;
    private javax.swing.JLabel img_LogoAgro;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JFormattedTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
