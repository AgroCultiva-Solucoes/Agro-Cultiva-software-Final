package telas;

import javax.swing.JOptionPane;
import Classes.Usuario;
import dao.DAOusuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TelaCadFunc extends javax.swing.JFrame {
    
    public TelaCadFunc() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icon_LogoAgro.jpg")).getImage());
        lblUsuarioLogado.setText(System.getProperty("usuario"));
        
        try {
            listarUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void cadastrarUsuario() {
    try {
        String nome = txtNome.getText().trim();
        String txtusuario = txtUsuario.getText().trim();
        String email = txtEmail.getText().trim();
        String cpf = txtCpf.getText().trim();
        String senha = new String(txtSenha.getPassword()).trim();

        if (nome.isEmpty() || txtusuario.isEmpty() || email.isEmpty() || cpf.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setUsuario(txtusuario);
        usuario.setEmail(email);
        usuario.setCpf(cpf);
        usuario.setSenha(senha);
        usuario.setAdm(ckAdm.isSelected());

        Usuario.cadastrarUsuario(usuario);

        listarUsuarios();

        JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao cadastrar usuário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void listarUsuarios() throws Exception {
        DefaultTableModel modeloTabela = (DefaultTableModel) tbFunc.getModel();
        modeloTabela.setRowCount(0);
        try {
            List<Usuario> usuarios = Usuario.listarUsuarios();
            for (Usuario usuario : usuarios) {
                Object[] rowData = {
                        usuario.getId(),
                        usuario.getUsuario(),
                        usuario.getNome(),
                        usuario.getEmail(),
                        usuario.getCpf(),
                        usuario.isAdm()
                };
                modeloTabela.addRow(rowData);
            }
        } catch (Exception e) {
            throw new Exception("Erro ao listar usuários: " + e.getMessage());
        }
    }
    
    private void alterarUsuario() {
    DefaultTableModel modeloTabela = (DefaultTableModel) tbFunc.getModel();
    try {
        int linhaSelecionada = tbFunc.getSelectedRow();
        if (linhaSelecionada >= 0) {
            String nome = txtNome.getText().trim();
            String txtusuario = txtUsuario.getText().trim();
            String email = txtEmail.getText().trim();
            String cpf = txtCpf.getText().trim();
            String senha = new String(txtSenha.getPassword()).trim();
            String confirmarSenha = new String(txtConfSenha.getPassword()).trim();

            if (nome.isEmpty() || txtusuario.isEmpty() || email.isEmpty() || cpf.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
                return; // Interrompe a alteração se algum campo obrigatório estiver vazio
            }

            // Verificar se as senhas batem
            if (!senha.equals(confirmarSenha)) {
                JOptionPane.showMessageDialog(this, "As senhas não coincidem. Por favor, digite novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                return; // Interrompe a alteração se as senhas não coincidirem
            }

            int idUsuario = (int) modeloTabela.getValueAt(linhaSelecionada, 0);

            Usuario usuario = new Usuario();
            usuario.setId(idUsuario);
            usuario.setNome(nome);
            usuario.setUsuario(txtusuario);
            usuario.setEmail(email);
            usuario.setCpf(cpf);
            usuario.setSenha(senha);
            usuario.setAdm(ckAdm.isSelected());

            Usuario.atualizarUsuario(usuario);

            listarUsuarios();

            JOptionPane.showMessageDialog(this, "Usuário atualizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um usuário para alterar.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao alterar usuário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        container = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        menuSaf = new javax.swing.JLabel();
        menuEst = new javax.swing.JLabel();
        quadroInfoSessao = new javax.swing.JPanel();
        lblUsuarioLogado = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JPanel();
        lblVoltar = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        lblConfSenha = new javax.swing.JLabel();
        txtConfSenha = new javax.swing.JPasswordField();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        ckSenha = new javax.swing.JCheckBox();
        ckAdm = new javax.swing.JCheckBox();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFunc = new javax.swing.JTable();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionario");
        setMaximumSize(new java.awt.Dimension(860, 532));
        setMinimumSize(new java.awt.Dimension(860, 532));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        container.setBackground(new java.awt.Color(212, 212, 234));
        container.setMaximumSize(new java.awt.Dimension(860, 532));
        container.setMinimumSize(new java.awt.Dimension(860, 532));
        container.setPreferredSize(new java.awt.Dimension(860, 532));

        navbar.setBackground(new java.awt.Color(142, 172, 198));
        navbar.setMaximumSize(new java.awt.Dimension(835, 50));
        navbar.setMinimumSize(new java.awt.Dimension(835, 50));
        navbar.setName(""); // NOI18N

        menuSaf.setBackground(new java.awt.Color(153, 153, 153));
        menuSaf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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

        menuEst.setBackground(new java.awt.Color(153, 153, 153));
        menuEst.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuEst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_Caixa.png"))); // NOI18N
        menuEst.setText("Estoque");
        menuEst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuEst.setMaximumSize(new java.awt.Dimension(110, 50));
        menuEst.setMinimumSize(new java.awt.Dimension(110, 50));
        menuEst.setName(""); // NOI18N
        menuEst.setPreferredSize(new java.awt.Dimension(110, 50));
        menuEst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEstMouseClicked(evt);
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

        lblVoltar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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
                .addComponent(lblVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addComponent(quadroInfoSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuSaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(menuEst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuSaf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(navbarLayout.createSequentialGroup()
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quadroInfoSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblUsuario.setText("Usuario");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        lblNome.setText("Nome");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblEmail.setText("Email");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblSenha.setText("Senha");

        txtSenha.setActionCommand("");
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        lblConfSenha.setText("Confirmar senha");

        lblCpf.setText("CPF");

        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        ckSenha.setText("Exibir senha");
        ckSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ckSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckSenhaActionPerformed(evt);
            }
        });

        ckAdm.setText("Adminintrador");
        ckAdm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ckAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckAdmActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
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

        btnAtualizar.setText("Atualizar");
        btnAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        tbFunc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuario", "Nome", "email", "CPF", "Administrador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFuncMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbFunc);

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(ckSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(ckAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCpf)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblUsuario)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCpf))
                        .addGap(0, 0, 0)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckSenha)
                    .addComponent(ckAdm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnCadastrar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 836, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(852, 540));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Usuario validarPermanencia = new Usuario();
        
        if(!validarPermanencia.validarPermanencia()){
            this.dispose();
            new Index().setVisible(true);
        }
    }//GEN-LAST:event_formWindowActivated

    private void tbFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFuncMouseClicked
        DefaultTableModel modeloTabela = (DefaultTableModel) tbFunc.getModel();
        int linhaSelecionada = tbFunc.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int idUsuario = (int) modeloTabela.getValueAt(linhaSelecionada, 0);
            String nome = (String) modeloTabela.getValueAt(linhaSelecionada, 2);
            String usuario = (String) modeloTabela.getValueAt(linhaSelecionada, 1);
            String email = (String) modeloTabela.getValueAt(linhaSelecionada, 3);
            String cpf = (String) modeloTabela.getValueAt(linhaSelecionada, 4);
            boolean adm = (boolean) modeloTabela.getValueAt(linhaSelecionada, 5);

            txtNome.setText(nome);
            txtUsuario.setText(usuario);
            txtEmail.setText(email);
            txtCpf.setText(cpf);
            ckAdm.setSelected(adm);
        }
    }//GEN-LAST:event_tbFuncMouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {
            listarUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        DefaultTableModel modeloTabela = (DefaultTableModel) tbFunc.getModel();
        int linhaSelecionada = tbFunc.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int idUsuario = (int) modeloTabela.getValueAt(linhaSelecionada, 0);
            int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir este usuário?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
            if (confirmacao == JOptionPane.YES_OPTION) {
                try {
                    DAOusuario.deletarUsuario(idUsuario);
                    JOptionPane.showMessageDialog(this, "Usuário excluído com sucesso!");
                    listarUsuarios();
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir usuário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um usuário para excluir.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked

    }//GEN-LAST:event_btnExcluirMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterarUsuario();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastrarUsuario();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void ckAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckAdmActionPerformed

    }//GEN-LAST:event_ckAdmActionPerformed

    private void ckSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckSenhaActionPerformed
        if (ckSenha.isSelected()) {
            txtSenha.setEchoChar((char) 0);
            txtConfSenha.setEchoChar((char) 0);
        } else {
            txtSenha.setEchoChar('*');
            txtConfSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_ckSenhaActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed

    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        dispose();

        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void menuEstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEstMouseClicked
        dispose();
        new TelaEstoque().setVisible(true);
    }//GEN-LAST:event_menuEstMouseClicked

    private void menuSafMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSafMouseClicked
        dispose();
        new Safra().setVisible(true);
    }//GEN-LAST:event_menuSafMouseClicked

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
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadFunc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JPanel btnVoltar;
    private javax.swing.JCheckBox ckAdm;
    private javax.swing.JCheckBox ckSenha;
    private javax.swing.JPanel container;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConfSenha;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JLabel lblVoltar;
    private javax.swing.JLabel menuEst;
    private javax.swing.JLabel menuSaf;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel quadroInfoSessao;
    private javax.swing.JTable tbFunc;
    private javax.swing.JPasswordField txtConfSenha;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
