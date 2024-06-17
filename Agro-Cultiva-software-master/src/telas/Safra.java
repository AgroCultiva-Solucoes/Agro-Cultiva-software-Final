package telas;

import Classes.Usuario;
import javax.swing.JOptionPane;

public class Safra extends javax.swing.JFrame {

    public Safra() {
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icon_LogoAgro.jpg")).getImage()); 
        initComponents();
        lblUsuarioLogado.setText(System.getProperty("usuario"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navBar = new javax.swing.JMenuBar();
        menuFuncionarios = new javax.swing.JMenu();
        mItemVerFuncionarios = new javax.swing.JMenuItem();
        menuEstoque = new javax.swing.JMenu();
        mItemVerEstoque = new javax.swing.JMenuItem();
        menuSafras = new javax.swing.JMenu();
        mItemHistoricoSafras = new javax.swing.JMenuItem();
        menuLogout = new javax.swing.JMenu();
        jSlider1 = new javax.swing.JSlider();
        jSeparator1 = new javax.swing.JSeparator();
        container = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        menuEst1 = new javax.swing.JLabel();
        quadroInfoSessao = new javax.swing.JPanel();
        lblUsuarioLogado = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JPanel();
        lblVoltar = new javax.swing.JLabel();
        menuUsu1 = new javax.swing.JLabel();
        pArroz = new javax.swing.JPanel();
        imgArroz = new javax.swing.JLabel();
        lbArrozN = new javax.swing.JLabel();
        pTrigo = new javax.swing.JPanel();
        imgTrigo = new javax.swing.JLabel();
        lbTrigoN = new javax.swing.JLabel();
        pSoja = new javax.swing.JPanel();
        imgSoja = new javax.swing.JLabel();
        lbSojaN = new javax.swing.JLabel();

        navBar.setBackground(new java.awt.Color(252, 233, 204));

        menuFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_Usuario.png"))); // NOI18N
        menuFuncionarios.setText("Funcionarios");
        menuFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionariosActionPerformed(evt);
            }
        });

        mItemVerFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/folder_user.png"))); // NOI18N
        mItemVerFuncionarios.setText("Cadastrar");
        mItemVerFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemVerFuncionariosActionPerformed(evt);
            }
        });
        menuFuncionarios.add(mItemVerFuncionarios);

        navBar.add(menuFuncionarios);

        menuEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_cesta.png"))); // NOI18N
        menuEstoque.setText("Estoque");

        mItemVerEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zoom.png"))); // NOI18N
        mItemVerEstoque.setText("Ver Estoque");
        mItemVerEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemVerEstoqueActionPerformed(evt);
            }
        });
        menuEstoque.add(mItemVerEstoque);

        navBar.add(menuEstoque);

        menuSafras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/page_white_paste.png"))); // NOI18N
        menuSafras.setText("Safras");

        mItemHistoricoSafras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/page_white_magnify.png"))); // NOI18N
        mItemHistoricoSafras.setText("Historico");
        mItemHistoricoSafras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemHistoricoSafrasActionPerformed(evt);
            }
        });
        menuSafras.add(mItemHistoricoSafras);

        navBar.add(menuSafras);

        menuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_sair.png"))); // NOI18N
        menuLogout.setText("Sair");
        menuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLogoutMouseClicked(evt);
            }
        });
        navBar.add(menuLogout);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(835, 532));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        container.setBackground(new java.awt.Color(212, 212, 234));
        container.setMaximumSize(new java.awt.Dimension(835, 532));
        container.setMinimumSize(new java.awt.Dimension(835, 532));
        container.setPreferredSize(new java.awt.Dimension(835, 532));

        navbar.setBackground(new java.awt.Color(142, 172, 198));
        navbar.setMaximumSize(new java.awt.Dimension(835, 50));
        navbar.setMinimumSize(new java.awt.Dimension(835, 50));
        navbar.setName(""); // NOI18N

        menuEst1.setBackground(new java.awt.Color(153, 153, 153));
        menuEst1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuEst1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuEst1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_Caixa.png"))); // NOI18N
        menuEst1.setText("Estoque");
        menuEst1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuEst1.setMaximumSize(new java.awt.Dimension(110, 50));
        menuEst1.setMinimumSize(new java.awt.Dimension(110, 50));
        menuEst1.setName(""); // NOI18N
        menuEst1.setPreferredSize(new java.awt.Dimension(110, 50));
        menuEst1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEst1MouseClicked(evt);
            }
        });

        quadroInfoSessao.setBackground(new java.awt.Color(142, 172, 198));
        quadroInfoSessao.setPreferredSize(new java.awt.Dimension(200, 50));

        lblUsuarioLogado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUsuarioLogado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarioLogado.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout quadroInfoSessaoLayout = new javax.swing.GroupLayout(quadroInfoSessao);
        quadroInfoSessao.setLayout(quadroInfoSessaoLayout);
        quadroInfoSessaoLayout.setHorizontalGroup(
            quadroInfoSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadroInfoSessaoLayout.createSequentialGroup()
                .addComponent(lblUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

        lblVoltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblVoltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVoltar.setText(">");
        lblVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVoltar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout btnVoltarLayout = new javax.swing.GroupLayout(btnVoltar);
        btnVoltar.setLayout(btnVoltarLayout);
        btnVoltarLayout.setHorizontalGroup(
            btnVoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVoltarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnVoltarLayout.setVerticalGroup(
            btnVoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVoltarLayout.createSequentialGroup()
                .addComponent(lblVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuUsu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuUsu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_Funcionarios.png"))); // NOI18N
        menuUsu1.setText("Funcionarios");
        menuUsu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuUsu1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addComponent(quadroInfoSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(menuUsu1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(menuEst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quadroInfoSessao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(menuEst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(menuUsu1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        pArroz.setBackground(new java.awt.Color(142, 172, 198));
        pArroz.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        pArroz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pArrozMouseClicked(evt);
            }
        });

        imgArroz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rice (1).png"))); // NOI18N
        imgArroz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgArrozMouseClicked(evt);
            }
        });

        lbArrozN.setText("ARROZ");
        lbArrozN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbArrozNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pArrozLayout = new javax.swing.GroupLayout(pArroz);
        pArroz.setLayout(pArrozLayout);
        pArrozLayout.setHorizontalGroup(
            pArrozLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pArrozLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(imgArroz)
                .addGap(23, 23, 23))
            .addGroup(pArrozLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lbArrozN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pArrozLayout.setVerticalGroup(
            pArrozLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pArrozLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(imgArroz, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbArrozN)
                .addContainerGap())
        );

        pTrigo.setBackground(new java.awt.Color(142, 172, 198));
        pTrigo.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        pTrigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pTrigoMouseClicked(evt);
            }
        });

        imgTrigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wheat-sack (5).png"))); // NOI18N
        imgTrigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgTrigoMouseClicked(evt);
            }
        });

        lbTrigoN.setText("TRIGO");
        lbTrigoN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTrigoNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pTrigoLayout = new javax.swing.GroupLayout(pTrigo);
        pTrigo.setLayout(pTrigoLayout);
        pTrigoLayout.setHorizontalGroup(
            pTrigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTrigoLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(pTrigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTrigoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lbTrigoN))
                    .addComponent(imgTrigo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        pTrigoLayout.setVerticalGroup(
            pTrigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTrigoLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(imgTrigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbTrigoN)
                .addContainerGap())
        );

        pSoja.setBackground(new java.awt.Color(142, 172, 198));
        pSoja.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        pSoja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pSojaMouseClicked(evt);
            }
        });

        imgSoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/soybean (4) (3).png"))); // NOI18N
        imgSoja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgSojaMouseClicked(evt);
            }
        });

        lbSojaN.setText("SOJA");
        lbSojaN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSojaNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pSojaLayout = new javax.swing.GroupLayout(pSoja);
        pSoja.setLayout(pSojaLayout);
        pSojaLayout.setHorizontalGroup(
            pSojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSojaLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(imgSoja, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(pSojaLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lbSojaN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pSojaLayout.setVerticalGroup(
            pSojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSojaLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(imgSoja, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbSojaN)
                .addContainerGap())
        );

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(pArroz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(pTrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(pSoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pSoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pArroz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pTrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(181, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(851, 540));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mItemVerFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemVerFuncionariosActionPerformed
        if(System.getProperty("adm").equals("true")){
            dispose();
            TelaCadFunc gerenciarFunc = new TelaCadFunc();
            gerenciarFunc.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Você não tem acesso a está aba!", "Não Autorizado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mItemVerFuncionariosActionPerformed

    private void menuFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuFuncionariosActionPerformed

    private void mItemVerEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemVerEstoqueActionPerformed
        dispose();
        new TelaEstoque().setVisible(true);
    }//GEN-LAST:event_mItemVerEstoqueActionPerformed

    private void mItemHistoricoSafrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemHistoricoSafrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mItemHistoricoSafrasActionPerformed

    private void menuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLogoutMouseClicked

    }//GEN-LAST:event_menuLogoutMouseClicked

    private void menuEst1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEst1MouseClicked
        dispose();
        new TelaEstoque().setVisible(true);
    }//GEN-LAST:event_menuEst1MouseClicked

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        dispose();

        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void menuUsu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUsu1MouseClicked
        if(System.getProperty("adm").equals("true")){
            dispose();
            TelaCadFunc gerenciarFunc = new TelaCadFunc();
            gerenciarFunc.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Você não tem acesso a está aba!", "Não Autorizado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menuUsu1MouseClicked

    private void imgArrozMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgArrozMouseClicked
        dispose(); 
        MenuSafra Arroz = new MenuSafra("Arroz");
        Arroz.setVisible(true);    
    }//GEN-LAST:event_imgArrozMouseClicked

    private void lbArrozNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbArrozNMouseClicked
        dispose(); 
        MenuSafra Arroz = new MenuSafra("Arroz");
        Arroz.setVisible(true);
    }//GEN-LAST:event_lbArrozNMouseClicked

    private void pArrozMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pArrozMouseClicked
        dispose(); 
        MenuSafra Arroz = new MenuSafra("Arroz");
        Arroz.setVisible(true);
    }//GEN-LAST:event_pArrozMouseClicked

    private void imgTrigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgTrigoMouseClicked
        dispose(); 
        MenuSafra Trigo = new MenuSafra("Trigo");
        Trigo.setVisible(true);
    }//GEN-LAST:event_imgTrigoMouseClicked

    private void lbTrigoNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTrigoNMouseClicked
        dispose(); 
        MenuSafra Trigo = new MenuSafra("Trigo");
        Trigo.setVisible(true);
    }//GEN-LAST:event_lbTrigoNMouseClicked

    private void pTrigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pTrigoMouseClicked
        dispose(); 
        MenuSafra Trigo = new MenuSafra("Trigo");
        Trigo.setVisible(true);
    }//GEN-LAST:event_pTrigoMouseClicked

    private void imgSojaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgSojaMouseClicked
       dispose(); 
        MenuSafra Soja = new MenuSafra("Soja");
        Soja.setVisible(true);
    }//GEN-LAST:event_imgSojaMouseClicked

    private void lbSojaNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSojaNMouseClicked
        dispose(); 
        MenuSafra Arroz = new MenuSafra("Soja");
        Arroz.setVisible(true);
    }//GEN-LAST:event_lbSojaNMouseClicked

    private void pSojaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pSojaMouseClicked
        dispose(); 
        MenuSafra Soja = new MenuSafra("Soja");
        Soja.setVisible(true);
    }//GEN-LAST:event_pSojaMouseClicked

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
            java.util.logging.Logger.getLogger(Safra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Safra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Safra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Safra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Safra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnVoltar;
    private javax.swing.JPanel container;
    private javax.swing.JLabel imgArroz;
    private javax.swing.JLabel imgSoja;
    private javax.swing.JLabel imgTrigo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lbArrozN;
    private javax.swing.JLabel lbSojaN;
    private javax.swing.JLabel lbTrigoN;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JLabel lblVoltar;
    private javax.swing.JMenuItem mItemHistoricoSafras;
    private javax.swing.JMenuItem mItemVerEstoque;
    private javax.swing.JMenuItem mItemVerFuncionarios;
    private javax.swing.JLabel menuEst1;
    private javax.swing.JMenu menuEstoque;
    private javax.swing.JMenu menuFuncionarios;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JMenu menuSafras;
    private javax.swing.JLabel menuUsu1;
    private javax.swing.JMenuBar navBar;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel pArroz;
    private javax.swing.JPanel pSoja;
    private javax.swing.JPanel pTrigo;
    private javax.swing.JPanel quadroInfoSessao;
    // End of variables declaration//GEN-END:variables
}
