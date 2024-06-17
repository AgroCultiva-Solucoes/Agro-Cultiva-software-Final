package telas;

import Classes.Estoque;
import Classes.Usuario;
import dao.DAOestoque;
import java.util.List;
import javax.swing.JOptionPane;
import telas.Index;


public class Menu extends javax.swing.JFrame {

    public Menu() {
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icon_LogoAgro.jpg")).getImage()); 
        initComponents();
        
        lblUsuarioLogado.setText(System.getProperty("usuario"));
        try {
        atualizarDados();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void atualizarDados() throws Exception {
        
        double valorP = 0, valorF = 0;
        
    try{
        List<Estoque> estoques = DAOestoque.listarEstoquesMenu();
        for (Estoque estoque: estoques){
            
            
            if(estoque.getIdFertilizante() != 0){
                valorF += estoque.getQuantidade();
            } else if (estoque.getIdPesticida() != 0){
                valorP += estoque.getQuantidade();
            } else if(estoque.getNome().equals("Trigo")){
                lblvalorTrigo.setText(Double.toString(estoque.getQuantidade()));
            }else if(estoque.getNome().equals("Soja")){
                lblvalorSoja.setText(Double.toString(estoque.getQuantidade()));
            }else if(estoque.getNome().equals("Arroz")){
                lblvalorArroz.setText(Double.toString(estoque.getQuantidade()));
            }
        }
        
        lblvalorPesticida.setText(Double.toString(valorP));
        
        lblvalorFertilizante.setText(Double.toString(valorF));
        
        List<Usuario> usuarios = Usuario.listarUsuarios();
        lblvalorFuncionarios.setText(Integer.toString(usuarios.size()));
        
    }
    catch(Exception e){
        throw new Exception("Erro ao listar usuários: " + e.getMessage());
    
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        menuFunc = new javax.swing.JLabel();
        menuEst = new javax.swing.JLabel();
        quadroInfoSessao = new javax.swing.JPanel();
        lblUsuarioLogado = new javax.swing.JLabel();
        btnSair = new javax.swing.JPanel();
        lblSair = new javax.swing.JLabel();
        menuSaf = new javax.swing.JLabel();
        pArroz = new javax.swing.JPanel();
        lblArroz = new javax.swing.JLabel();
        lblsubArroz = new javax.swing.JLabel();
        lblvalorArroz = new javax.swing.JLabel();
        pFertilizante = new javax.swing.JPanel();
        lblFertilizante = new javax.swing.JLabel();
        lblsubFertilizante = new javax.swing.JLabel();
        lblvalorFertilizante = new javax.swing.JLabel();
        pTrigo = new javax.swing.JPanel();
        lblTrigo = new javax.swing.JLabel();
        lblsubTrigo = new javax.swing.JLabel();
        lblvalorTrigo = new javax.swing.JLabel();
        pPesticida = new javax.swing.JPanel();
        lblPesticidade = new javax.swing.JLabel();
        lblsubPesticida = new javax.swing.JLabel();
        lblvalorPesticida = new javax.swing.JLabel();
        pSoja = new javax.swing.JPanel();
        lblSoja = new javax.swing.JLabel();
        lblsubSoja = new javax.swing.JLabel();
        lblvalorSoja = new javax.swing.JLabel();
        pFuncionario = new javax.swing.JPanel();
        lblFuncionarios = new javax.swing.JLabel();
        lblsubFuncionarios = new javax.swing.JLabel();
        lblvalorFuncionarios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(860, 532));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Container.setBackground(new java.awt.Color(212, 212, 234));

        navbar.setBackground(new java.awt.Color(142, 172, 198));
        navbar.setMaximumSize(new java.awt.Dimension(860, 50));
        navbar.setMinimumSize(new java.awt.Dimension(860, 50));
        navbar.setName(""); // NOI18N
        navbar.setPreferredSize(new java.awt.Dimension(860, 50));

        menuFunc.setBackground(new java.awt.Color(153, 153, 153));
        menuFunc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuFunc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_Funcionarios.png"))); // NOI18N
        menuFunc.setText("Funcionarios");
        menuFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuFunc.setMaximumSize(new java.awt.Dimension(110, 50));
        menuFunc.setMinimumSize(new java.awt.Dimension(110, 50));
        menuFunc.setPreferredSize(new java.awt.Dimension(110, 50));
        menuFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuFuncMouseClicked(evt);
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
                .addComponent(lblUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        quadroInfoSessaoLayout.setVerticalGroup(
            quadroInfoSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadroInfoSessaoLayout.createSequentialGroup()
                .addComponent(lblUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSair.setBackground(new java.awt.Color(142, 172, 198));
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setPreferredSize(new java.awt.Dimension(100, 50));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });

        lblSair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSair.setText("Deslogar");
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout btnSairLayout = new javax.swing.GroupLayout(btnSair);
        btnSair.setLayout(btnSairLayout);
        btnSairLayout.setHorizontalGroup(
            btnSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSairLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSair, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnSairLayout.setVerticalGroup(
            btnSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addComponent(quadroInfoSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuSaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addComponent(quadroInfoSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(navbarLayout.createSequentialGroup()
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(menuFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menuEst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menuSaf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pArroz.setBackground(new java.awt.Color(142, 172, 198));
        pArroz.setPreferredSize(new java.awt.Dimension(170, 170));

        lblArroz.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblArroz.setText("Arroz");

        lblsubArroz.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblsubArroz.setText("Total Colhido");
        lblsubArroz.setToolTipText("");

        lblvalorArroz.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblvalorArroz.setText("70%");

        javax.swing.GroupLayout pArrozLayout = new javax.swing.GroupLayout(pArroz);
        pArroz.setLayout(pArrozLayout);
        pArrozLayout.setHorizontalGroup(
            pArrozLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pArrozLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(pArrozLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblvalorArroz, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblArroz, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsubArroz))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pArrozLayout.setVerticalGroup(
            pArrozLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pArrozLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblArroz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsubArroz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(lblvalorArroz)
                .addGap(65, 65, 65))
        );

        pFertilizante.setBackground(new java.awt.Color(142, 172, 198));
        pFertilizante.setPreferredSize(new java.awt.Dimension(170, 170));

        lblFertilizante.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblFertilizante.setText("Fertilizantes");

        lblsubFertilizante.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblsubFertilizante.setText("Total em Estoque");
        lblsubFertilizante.setToolTipText("");

        lblvalorFertilizante.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblvalorFertilizante.setText("70%");

        javax.swing.GroupLayout pFertilizanteLayout = new javax.swing.GroupLayout(pFertilizante);
        pFertilizante.setLayout(pFertilizanteLayout);
        pFertilizanteLayout.setHorizontalGroup(
            pFertilizanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFertilizanteLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(pFertilizanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFertilizante, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(lblsubFertilizante)
                    .addComponent(lblvalorFertilizante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pFertilizanteLayout.setVerticalGroup(
            pFertilizanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFertilizanteLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lblFertilizante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsubFertilizante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblvalorFertilizante)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pTrigo.setBackground(new java.awt.Color(142, 172, 198));
        pTrigo.setPreferredSize(new java.awt.Dimension(170, 170));

        lblTrigo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTrigo.setText("Trigo");

        lblsubTrigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblsubTrigo.setText("Total Colhido");
        lblsubTrigo.setToolTipText("");

        lblvalorTrigo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblvalorTrigo.setText("70%");

        javax.swing.GroupLayout pTrigoLayout = new javax.swing.GroupLayout(pTrigo);
        pTrigo.setLayout(pTrigoLayout);
        pTrigoLayout.setHorizontalGroup(
            pTrigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTrigoLayout.createSequentialGroup()
                .addGroup(pTrigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTrigoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pTrigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTrigo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblsubTrigo)))
                    .addGroup(pTrigoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblvalorTrigo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pTrigoLayout.setVerticalGroup(
            pTrigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTrigoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTrigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsubTrigo)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblvalorTrigo)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pPesticida.setBackground(new java.awt.Color(142, 172, 198));
        pPesticida.setPreferredSize(new java.awt.Dimension(170, 170));

        lblPesticidade.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblPesticidade.setText("Pesticida");

        lblsubPesticida.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblsubPesticida.setText("Total em Estoque");
        lblsubPesticida.setToolTipText("");

        lblvalorPesticida.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblvalorPesticida.setText("70%");

        javax.swing.GroupLayout pPesticidaLayout = new javax.swing.GroupLayout(pPesticida);
        pPesticida.setLayout(pPesticidaLayout);
        pPesticidaLayout.setHorizontalGroup(
            pPesticidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPesticidaLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(pPesticidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPesticidade, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(lblsubPesticida)
                    .addComponent(lblvalorPesticida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pPesticidaLayout.setVerticalGroup(
            pPesticidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPesticidaLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lblPesticidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsubPesticida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblvalorPesticida)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pSoja.setBackground(new java.awt.Color(142, 172, 198));
        pSoja.setPreferredSize(new java.awt.Dimension(170, 170));

        lblSoja.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblSoja.setText("Soja");

        lblsubSoja.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblsubSoja.setText("Total Colhido");
        lblsubSoja.setToolTipText("");

        lblvalorSoja.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblvalorSoja.setText("70%");

        javax.swing.GroupLayout pSojaLayout = new javax.swing.GroupLayout(pSoja);
        pSoja.setLayout(pSojaLayout);
        pSojaLayout.setHorizontalGroup(
            pSojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSojaLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(pSojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblvalorSoja, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoja, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsubSoja))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pSojaLayout.setVerticalGroup(
            pSojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSojaLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lblSoja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsubSoja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblvalorSoja)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pFuncionario.setBackground(new java.awt.Color(142, 172, 198));
        pFuncionario.setPreferredSize(new java.awt.Dimension(170, 170));

        lblFuncionarios.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblFuncionarios.setText("Funcionários");

        lblsubFuncionarios.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblsubFuncionarios.setText("Total de funcionários");
        lblsubFuncionarios.setToolTipText("");

        lblvalorFuncionarios.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblvalorFuncionarios.setText("70%");

        javax.swing.GroupLayout pFuncionarioLayout = new javax.swing.GroupLayout(pFuncionario);
        pFuncionario.setLayout(pFuncionarioLayout);
        pFuncionarioLayout.setHorizontalGroup(
            pFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFuncionarioLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(pFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblvalorFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblsubFuncionarios)
                        .addComponent(lblFuncionarios)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pFuncionarioLayout.setVerticalGroup(
            pFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFuncionarioLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lblFuncionarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsubFuncionarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblvalorFuncionarios)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pArroz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pFertilizante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(144, 144, 144)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pPesticida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pTrigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pSoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(pSoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pTrigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pArroz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pPesticida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pFertilizante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuFuncMouseClicked
        if(System.getProperty("adm").equals("true")){
            dispose();
            TelaCadFunc gerenciarFunc = new TelaCadFunc();
            gerenciarFunc.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Você não tem acesso a está aba!", "Não Autorizado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menuFuncMouseClicked

    private void menuEstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEstMouseClicked
        dispose();
        new TelaEstoque().setVisible(true);
    }//GEN-LAST:event_menuEstMouseClicked

    private void menuSafMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSafMouseClicked
        dispose();
        new Safra().setVisible(true);
    }//GEN-LAST:event_menuSafMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Usuario validarPermanencia = new Usuario();
        
        if(!validarPermanencia.validarPermanencia()){
            this.dispose();
            new Index().setVisible(true);
        }
    }//GEN-LAST:event_formWindowActivated

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        Usuario deslogar = new Usuario();
        JOptionPane.showMessageDialog(null, "Deslogando, atá a proxima " + System.getProperty("nome") + "!", "log out", JOptionPane.INFORMATION_MESSAGE);
        deslogar.deslogar();
        dispose();
        Index logar = new Index();
        logar.setVisible(true);
    }//GEN-LAST:event_btnSairMouseClicked

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
                new Menu().setVisible(true);;
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel btnSair;
    private javax.swing.JLabel lblArroz;
    private javax.swing.JLabel lblFertilizante;
    private javax.swing.JLabel lblFuncionarios;
    private javax.swing.JLabel lblPesticidade;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblSoja;
    private javax.swing.JLabel lblTrigo;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JLabel lblsubArroz;
    private javax.swing.JLabel lblsubFertilizante;
    private javax.swing.JLabel lblsubFuncionarios;
    private javax.swing.JLabel lblsubPesticida;
    private javax.swing.JLabel lblsubSoja;
    private javax.swing.JLabel lblsubTrigo;
    private javax.swing.JLabel lblvalorArroz;
    private javax.swing.JLabel lblvalorFertilizante;
    private javax.swing.JLabel lblvalorFuncionarios;
    private javax.swing.JLabel lblvalorPesticida;
    private javax.swing.JLabel lblvalorSoja;
    private javax.swing.JLabel lblvalorTrigo;
    private javax.swing.JLabel menuEst;
    private javax.swing.JLabel menuFunc;
    private javax.swing.JLabel menuSaf;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel pArroz;
    private javax.swing.JPanel pFertilizante;
    private javax.swing.JPanel pFuncionario;
    private javax.swing.JPanel pPesticida;
    private javax.swing.JPanel pSoja;
    private javax.swing.JPanel pTrigo;
    private javax.swing.JPanel quadroInfoSessao;
    // End of variables declaration//GEN-END:variables

    
    
}
