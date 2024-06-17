package telas;

import Classes.Estoque;
import Classes.Usuario;
import dao.DAOestoque;
import dialogos.InserirFertilizanteDialog;
import dialogos.InserirPesticidaDialog;
import dialogos.AlterarEstoqueDialog;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;

public class TelaEstoque extends javax.swing.JFrame {

    public TelaEstoque() {
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icon_LogoAgro.jpg")).getImage());
        initComponents(); 
        lblUsuarioLogado.setText(System.getProperty("usuario"));
        
        try {
            listarEstoques();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void listarEstoques() {
        DefaultTableModel modeloTabela = (DefaultTableModel) tableEstoque.getModel();
        modeloTabela.setRowCount(0);
        try {
            List<Estoque> estoques = DAOestoque.listarEstoques();
            for (Estoque estoque : estoques) {
                Object[] rowData = {
                        estoque.getIdEstoque(),
                        estoque.getNome(),
                        estoque.getQuantidade(),
                        estoque.getPreco(),
                        estoque.getDescricao()
                };
                modeloTabela.addRow(rowData);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao listar estoques: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void abrirDialogoInserirFertilizante() {
        InserirFertilizanteDialog dialog = new InserirFertilizanteDialog(this);
        dialog.setVisible(true);

        try {
                listarEstoques();
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
    
    private void abrirDialogoInserirPesticida() {
        InserirPesticidaDialog dialogo = new InserirPesticidaDialog(this);
        dialogo.setVisible(true);
        try {
            listarEstoques();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfDESCRICAO2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEstoque = new javax.swing.JTable();
        navbar = new javax.swing.JPanel();
        menuSaf = new javax.swing.JLabel();
        quadroInfoSessao = new javax.swing.JPanel();
        lblUsuarioLogado = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JPanel();
        lblVoltar = new javax.swing.JLabel();
        menuUsu1 = new javax.swing.JLabel();
        pFertilizante = new javax.swing.JPanel();
        iconFertilizante = new javax.swing.JLabel();
        lblFertilizante = new javax.swing.JLabel();
        pPesticida = new javax.swing.JPanel();
        iconPesticida = new javax.swing.JLabel();
        lblPesticida = new javax.swing.JLabel();
        btnAtualizar2 = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(835, 532));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(212, 212, 234));
        jPanel2.setMaximumSize(new java.awt.Dimension(835, 532));
        jPanel2.setMinimumSize(new java.awt.Dimension(835, 532));
        jPanel2.setPreferredSize(new java.awt.Dimension(835, 532));

        tableEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Quantidade", "Preço", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableEstoque.setMinimumSize(new java.awt.Dimension(835, 532));
        tableEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEstoqueMouseClicked(evt);
            }
        });
        tableEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableEstoqueKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableEstoque);

        navbar.setBackground(new java.awt.Color(142, 172, 198));
        navbar.setMaximumSize(new java.awt.Dimension(835, 50));
        navbar.setMinimumSize(new java.awt.Dimension(835, 50));
        navbar.setName(""); // NOI18N

        menuSaf.setBackground(new java.awt.Color(153, 153, 153));
        menuSaf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuSaf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_Trigo.png"))); // NOI18N
        menuSaf.setText("Safras");
        menuSaf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuSaf.setMaximumSize(new java.awt.Dimension(110, 50));
        menuSaf.setMinimumSize(new java.awt.Dimension(110, 50));
        menuSaf.setPreferredSize(new java.awt.Dimension(110, 50));
        menuSaf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSafMouseClicked(evt);
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
                .addComponent(lblUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        quadroInfoSessaoLayout.setVerticalGroup(
            quadroInfoSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
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
            .addComponent(lblVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        btnVoltarLayout.setVerticalGroup(
            btnVoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

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
                .addComponent(quadroInfoSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuUsu1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuSaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(menuSaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(menuUsu1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(quadroInfoSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pFertilizante.setBackground(new java.awt.Color(142, 172, 198));
        pFertilizante.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        pFertilizante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pFertilizanteMouseClicked(evt);
            }
        });

        iconFertilizante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_fertilizante.png"))); // NOI18N
        iconFertilizante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconFertilizanteMouseClicked(evt);
            }
        });

        lblFertilizante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFertilizante.setText("Fertilizante");
        lblFertilizante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFertilizanteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pFertilizanteLayout = new javax.swing.GroupLayout(pFertilizante);
        pFertilizante.setLayout(pFertilizanteLayout);
        pFertilizanteLayout.setHorizontalGroup(
            pFertilizanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFertilizanteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pFertilizanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconFertilizante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFertilizante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        pFertilizanteLayout.setVerticalGroup(
            pFertilizanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFertilizanteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(iconFertilizante, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFertilizante, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pPesticida.setBackground(new java.awt.Color(142, 172, 198));
        pPesticida.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        pPesticida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pPesticidaMouseClicked(evt);
            }
        });

        iconPesticida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_pesticida.png"))); // NOI18N
        iconPesticida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconPesticidaMouseClicked(evt);
            }
        });

        lblPesticida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPesticida.setText("Pesticida");
        lblPesticida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPesticidaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pPesticidaLayout = new javax.swing.GroupLayout(pPesticida);
        pPesticida.setLayout(pPesticidaLayout);
        pPesticidaLayout.setHorizontalGroup(
            pPesticidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPesticidaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pPesticidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconPesticida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPesticida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        pPesticidaLayout.setVerticalGroup(
            pPesticidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPesticidaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(iconPesticida, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPesticida, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        btnAtualizar2.setText("Atualizar");
        btnAtualizar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizar2ActionPerformed(evt);
            }
        });

        btnExcluir.setText("Retirar");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
            }
        });
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navbar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(pFertilizante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(195, 195, 195)
                                .addComponent(pPesticida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(333, 333, 333)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAtualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(92, 92, 92)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 38, Short.MAX_VALUE)
                        .addComponent(pFertilizante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pPesticida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar2)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 835, 540);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        dispose();

        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void menuSafMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSafMouseClicked
        dispose();
        new Safra().setVisible(true);
    }//GEN-LAST:event_menuSafMouseClicked

    private void tableEstoqueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableEstoqueKeyReleased

    }//GEN-LAST:event_tableEstoqueKeyReleased

    private void tableEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEstoqueMouseClicked

    }//GEN-LAST:event_tableEstoqueMouseClicked

    private void menuUsu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUsu1MouseClicked
        if(System.getProperty("adm").equals("true")){
            dispose();
            TelaCadFunc gerenciarFunc = new TelaCadFunc();
            gerenciarFunc.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Você não tem acesso a está aba!", "Não Autorizado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menuUsu1MouseClicked

    private void iconFertilizanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconFertilizanteMouseClicked
        abrirDialogoInserirFertilizante();
    }//GEN-LAST:event_iconFertilizanteMouseClicked

    private void lblFertilizanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFertilizanteMouseClicked
        abrirDialogoInserirFertilizante();
    }//GEN-LAST:event_lblFertilizanteMouseClicked

    private void pFertilizanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pFertilizanteMouseClicked
        abrirDialogoInserirFertilizante();
    }//GEN-LAST:event_pFertilizanteMouseClicked

    private void iconPesticidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconPesticidaMouseClicked
        abrirDialogoInserirPesticida();
    }//GEN-LAST:event_iconPesticidaMouseClicked

    private void lblPesticidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPesticidaMouseClicked
        abrirDialogoInserirPesticida();
    }//GEN-LAST:event_lblPesticidaMouseClicked

    private void pPesticidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pPesticidaMouseClicked
        abrirDialogoInserirPesticida();
    }//GEN-LAST:event_pPesticidaMouseClicked

    private void btnAtualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizar2ActionPerformed
        try {
            listarEstoques();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAtualizar2ActionPerformed

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked

    }//GEN-LAST:event_btnExcluirMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        DefaultTableModel modeloTabela = (DefaultTableModel) tableEstoque.getModel();
        int linhaSelecionada = tableEstoque.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idUsuario = (int) modeloTabela.getValueAt(linhaSelecionada, 0);
            int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir este item do estoque?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
            if (confirmacao == JOptionPane.YES_OPTION) {
                try {
                    DAOestoque.deletarEstoque(idUsuario);
                    JOptionPane.showMessageDialog(this, "Item retirado do estoque!");
                    listarEstoques();
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Erro ao retirar item: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um item para retirar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Usuario validarPermanencia = new Usuario();
        
        if(!validarPermanencia.validarPermanencia()){
            this.dispose();
            new Index().setVisible(true);
        }
    }//GEN-LAST:event_formWindowActivated

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linhaSelecionada = tableEstoque.getSelectedRow();
        
        if (linhaSelecionada >= 0) {
            int idEstoque = (int) tableEstoque.getValueAt(linhaSelecionada, 0);
            AlterarEstoqueDialog dialog = new AlterarEstoqueDialog(this, idEstoque);
            dialog.setVisible(true);
            try {
                listarEstoques();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um item para alterar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

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
                new TelaEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAtualizar2;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JPanel btnVoltar;
    private javax.swing.JLabel iconFertilizante;
    private javax.swing.JLabel iconPesticida;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFertilizante;
    private javax.swing.JLabel lblPesticida;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JLabel lblVoltar;
    private javax.swing.JLabel menuSaf;
    private javax.swing.JLabel menuUsu1;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel pFertilizante;
    private javax.swing.JPanel pPesticida;
    private javax.swing.JPanel quadroInfoSessao;
    private javax.swing.JTable tableEstoque;
    private javax.swing.JTextField tfDESCRICAO2;
    // End of variables declaration//GEN-END:variables
}
