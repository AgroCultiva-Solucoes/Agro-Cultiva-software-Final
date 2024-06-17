package telas;

import Classes.Atividade;
import Classes.Estoque;
import Classes.Usuario;
import dao.DAOatividade;
import dao.DAOestoque;
import dialogos.InserirAtividadeColherDialog;
import dialogos.InserirAtividadeFertiDialog;
import dialogos.InserirAtividadePesticidaDialog;
import dialogos.InserirAtividadePlantarDialog;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;

public class Atividades extends javax.swing.JFrame {

    public Atividades() {
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icon_LogoAgro.jpg")).getImage());
        initComponents(); 
        lblUsuarioLogado.setText(System.getProperty("usuario"));
        
        lblSafra.setText("Safra - " + System.getProperty("safra"));
        try {
            listarAtividades();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
private void listarAtividades() {
    DefaultTableModel modeloTabela = (DefaultTableModel) tableAtividade.getModel();
    modeloTabela.setRowCount(0);

    if (modeloTabela.getColumnCount() == 0) {
        modeloTabela.addColumn("ID Atividade");
        modeloTabela.addColumn("ID Safra");
        modeloTabela.addColumn("ID Usuário");
        modeloTabela.addColumn("Tipo");
        modeloTabela.addColumn("Quantidade");
        modeloTabela.addColumn("Data Atividade");
        modeloTabela.addColumn("Descrição");
    }

    try {
        List<Atividade> atividades = DAOatividade.listarAtividades();
        for (Atividade atividade : atividades) {
            Object[] rowData = {
                atividade.getIdAtividades(),
                atividade.getIdSafra(),
                atividade.getIdUsuario(),
                atividade.getTipo(),
                atividade.getQtdd(),
                atividade.getDataAtividade().toString(),
                atividade.getDescricao()
            };
            modeloTabela.addRow(rowData);
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erro ao listar atividades: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void abrirDialogoInserirPlantio() {
        InserirAtividadePlantarDialog dialogo = new InserirAtividadePlantarDialog(this, System.getProperty("safra"));
        dialogo.setVisible(true);
        try {
            listarAtividades();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void abrirDialogoInserirColheita() {
        InserirAtividadeColherDialog dialogo = new InserirAtividadeColherDialog(this, System.getProperty("safra"));
        dialogo.setVisible(true);
        try {
            listarAtividades();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void abrirDialogoInserirFerti() {
        InserirAtividadeFertiDialog dialogo = new InserirAtividadeFertiDialog(this, System.getProperty("safra"));
        dialogo.setVisible(true);
        try {
            listarAtividades();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void abrirDialogoInserirPesticida() {
        InserirAtividadePesticidaDialog dialogo = new InserirAtividadePesticidaDialog(this, System.getProperty("safra"));
        dialogo.setVisible(true);
        try {
            listarAtividades();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfDESCRICAO2 = new javax.swing.JTextField();
        Container = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAtividade = new javax.swing.JTable();
        navbar = new javax.swing.JPanel();
        quadroInfoSessao = new javax.swing.JPanel();
        lblUsuarioLogado = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JPanel();
        lblVoltar = new javax.swing.JLabel();
        lblSafra = new javax.swing.JLabel();
        pPlantio = new javax.swing.JPanel();
        iconPlantio = new javax.swing.JLabel();
        lblPlantio = new javax.swing.JLabel();
        pColheita = new javax.swing.JPanel();
        iconColheita = new javax.swing.JLabel();
        lblColheita = new javax.swing.JLabel();
        pFertilizante = new javax.swing.JPanel();
        iconFertilizante = new javax.swing.JLabel();
        lblFertilizante = new javax.swing.JLabel();
        pPesticida = new javax.swing.JPanel();
        iconPesticida = new javax.swing.JLabel();
        lblPesticida = new javax.swing.JLabel();
        btnAtualizar2 = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblSafra1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(835, 532));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        Container.setBackground(new java.awt.Color(212, 212, 234));
        Container.setMaximumSize(new java.awt.Dimension(835, 532));
        Container.setMinimumSize(new java.awt.Dimension(835, 532));
        Container.setPreferredSize(new java.awt.Dimension(835, 532));

        tableAtividade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableAtividade.setMinimumSize(new java.awt.Dimension(835, 532));
        tableAtividade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAtividadeMouseClicked(evt);
            }
        });
        tableAtividade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableAtividadeKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableAtividade);

        navbar.setBackground(new java.awt.Color(142, 172, 198));
        navbar.setMaximumSize(new java.awt.Dimension(835, 50));
        navbar.setMinimumSize(new java.awt.Dimension(835, 50));
        navbar.setName(""); // NOI18N

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

        lblSafra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSafra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSafra.setText("SAFRA - ");
        lblSafra.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addComponent(quadroInfoSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(lblSafra, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSafra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quadroInfoSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pPlantio.setBackground(new java.awt.Color(142, 172, 198));
        pPlantio.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        pPlantio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pPlantioMouseClicked(evt);
            }
        });

        iconPlantio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_plantio.png"))); // NOI18N
        iconPlantio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconPlantioMouseClicked(evt);
            }
        });

        lblPlantio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlantio.setText("Plantio");
        lblPlantio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlantioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pPlantioLayout = new javax.swing.GroupLayout(pPlantio);
        pPlantio.setLayout(pPlantioLayout);
        pPlantioLayout.setHorizontalGroup(
            pPlantioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPlantioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pPlantioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconPlantio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPlantio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        pPlantioLayout.setVerticalGroup(
            pPlantioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPlantioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(iconPlantio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPlantio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pColheita.setBackground(new java.awt.Color(142, 172, 198));
        pColheita.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        pColheita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pColheitaMouseClicked(evt);
            }
        });

        iconColheita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_colheita.png"))); // NOI18N
        iconColheita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconColheitaMouseClicked(evt);
            }
        });

        lblColheita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblColheita.setText("Colheita");
        lblColheita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblColheitaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pColheitaLayout = new javax.swing.GroupLayout(pColheita);
        pColheita.setLayout(pColheitaLayout);
        pColheitaLayout.setHorizontalGroup(
            pColheitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pColheitaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pColheitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconColheita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblColheita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        pColheitaLayout.setVerticalGroup(
            pColheitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pColheitaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(iconColheita, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblColheita, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
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

        lblSafra1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSafra1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSafra1.setText("Atividades");
        lblSafra1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContainerLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(ContainerLayout.createSequentialGroup()
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnAtualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addComponent(pPlantio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pColheita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pFertilizante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pPesticida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addComponent(lblSafra1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblSafra1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pFertilizante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pColheita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPlantio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPesticida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar2)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(Container);
        Container.setBounds(0, 0, 835, 560);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        dispose();

        MenuSafra m = new MenuSafra(System.getProperty("safra"));
        m.setVisible(true);
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void tableAtividadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableAtividadeKeyReleased

    }//GEN-LAST:event_tableAtividadeKeyReleased

    private void tableAtividadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAtividadeMouseClicked
        
    }//GEN-LAST:event_tableAtividadeMouseClicked

    private void iconFertilizanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconFertilizanteMouseClicked
        abrirDialogoInserirFerti();
    }//GEN-LAST:event_iconFertilizanteMouseClicked

    private void lblFertilizanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFertilizanteMouseClicked
        abrirDialogoInserirFerti();
    }//GEN-LAST:event_lblFertilizanteMouseClicked

    private void pFertilizanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pFertilizanteMouseClicked
        abrirDialogoInserirFerti();
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
            listarAtividades();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAtualizar2ActionPerformed

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked

    }//GEN-LAST:event_btnExcluirMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
            DefaultTableModel modeloTabela = (DefaultTableModel) tableAtividade.getModel();
    int linhaSelecionada = tableAtividade.getSelectedRow();
    if (linhaSelecionada >= 0) {
        int idAtividade = (int) modeloTabela.getValueAt(linhaSelecionada, 0);
        int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir esta atividade?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
        if (confirmacao == JOptionPane.YES_OPTION) {
            try {
                DAOatividade.deletarAtividade(idAtividade);
                JOptionPane.showMessageDialog(this, "Atividade excluída com sucesso!");
                listarAtividades();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir atividade: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Selecione uma atividade para excluir.", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Usuario validarPermanencia = new Usuario();
        
        if(!validarPermanencia.validarPermanencia()){
            this.dispose();
            new Index().setVisible(true);
        }
    }//GEN-LAST:event_formWindowActivated

    private void iconColheitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconColheitaMouseClicked
        abrirDialogoInserirColheita();
    }//GEN-LAST:event_iconColheitaMouseClicked

    private void lblColheitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblColheitaMouseClicked
        abrirDialogoInserirColheita();
    }//GEN-LAST:event_lblColheitaMouseClicked

    private void pColheitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pColheitaMouseClicked
        abrirDialogoInserirColheita();
    }//GEN-LAST:event_pColheitaMouseClicked

    private void iconPlantioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconPlantioMouseClicked
        abrirDialogoInserirPlantio();
    }//GEN-LAST:event_iconPlantioMouseClicked

    private void lblPlantioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlantioMouseClicked
        abrirDialogoInserirPlantio();
    }//GEN-LAST:event_lblPlantioMouseClicked

    private void pPlantioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pPlantioMouseClicked
        abrirDialogoInserirPlantio();
    }//GEN-LAST:event_pPlantioMouseClicked

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
                new Atividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JButton btnAtualizar2;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JPanel btnVoltar;
    private javax.swing.JLabel iconColheita;
    private javax.swing.JLabel iconFertilizante;
    private javax.swing.JLabel iconPesticida;
    private javax.swing.JLabel iconPlantio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblColheita;
    private javax.swing.JLabel lblFertilizante;
    private javax.swing.JLabel lblPesticida;
    private javax.swing.JLabel lblPlantio;
    private javax.swing.JLabel lblSafra;
    private javax.swing.JLabel lblSafra1;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JLabel lblVoltar;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel pColheita;
    private javax.swing.JPanel pFertilizante;
    private javax.swing.JPanel pPesticida;
    private javax.swing.JPanel pPlantio;
    private javax.swing.JPanel quadroInfoSessao;
    private javax.swing.JTable tableAtividade;
    private javax.swing.JTextField tfDESCRICAO2;
    // End of variables declaration//GEN-END:variables
}
