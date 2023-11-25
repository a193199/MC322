/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.telas;

import java.sql.*;
import br.com.turismo.dal.ModuloConexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 * Classe responsável pelo gerenciamento da tela de destinos do projeto a tela
 * de destinos contém a listagem de possíveis escolhas dos clientes
 *
 * @author analu
 */
public class TelaDestino extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form TelaBuscar
     */
    public TelaDestino() {
        initComponents();
        conexao = ModuloConexao.conector();
        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/turismo/icones/aviao.png")));
    }

    /**
     * método responsável por pesquisar no banco de dados o destino refenre ao
     * input do cliente
     */
    private void pesquisarDestino() {
        String sql = "select iddestino as IdDestio, estado as Estado, cidade as Cidade, local as Local, categoria as Categorai,"
                + "dataini as DataIni, datafim as DataFim from tbdestino where estado like ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtDestinoPesquisar.getText() + "%");
            rs = pst.executeQuery();
            tblDestino.setModel(DbUtils.resultSetToTableModel(rs));
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * método responsável por adicionar um novo destino em tbdestino
     */
    private void adicionar() {
        String sql = "insert into tbdestino(iddestino,estado,cidade,local,categoria) values (?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtDestid.getText());
            pst.setString(2, txtDestEstado.getText());
            pst.setString(3, txtDestCidade.getText());
            pst.setString(4, txtDestLocal.getText());
            pst.setString(5, cboDestCategoria.getSelectedItem().toString());

            //verificação dos dados obrigatórios
            if ((txtDestid.getText().isEmpty()) || (txtDestEstado.getText().isEmpty()) || (txtDestCidade.getText().isEmpty())
                    || (txtDestLocal.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios.");
            } else {
                int adicionado = pst.executeUpdate(); //inserir os dados na tabela
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Destino adicionado com sucesso.");
                    limpar();
//                    cboUsuPerf.setSelectedItem(null);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * método responsável por inserir os campos de tbdestino nas caixas de texto
     * da visualização do usuário
     */
    public void setarCampos() {
        int setar = tblDestino.getSelectedRow();
        txtDestid.setText(tblDestino.getModel().getValueAt(setar, 0).toString());
        txtDestEstado.setText(tblDestino.getModel().getValueAt(setar, 1).toString());
        txtDestCidade.setText(tblDestino.getModel().getValueAt(setar, 2).toString());
        txtDestLocal.setText(tblDestino.getModel().getValueAt(setar, 3).toString());
        cboDestCategoria.setSelectedItem(tblDestino.getModel().getValueAt(setar, 4).toString());
        
        if ((tblDestino.getModel().getValueAt(setar, 0).toString().equals("1"))) {
            lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/turismo/imagens/sp.jpg")));
        } else if ((tblDestino.getModel().getValueAt(setar, 0).toString().equals("11"))){
            lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/turismo/imagens/hotel_x_sp.jpg")));
        }else if ((tblDestino.getModel().getValueAt(setar, 0).toString().equals("12"))){
            lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/turismo/imagens/campinas.jpg")));
        }else if ((tblDestino.getModel().getValueAt(setar, 0).toString().equals("13"))){
            lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/turismo/imagens/sao_seba.jpg")));
        }else if ((tblDestino.getModel().getValueAt(setar, 0).toString().equals("14"))){
            lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/turismo/imagens/praia_grande.jpg")));
        }else if ((tblDestino.getModel().getValueAt(setar, 0).toString().equals("2"))){
            lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/turismo/imagens/rio.jpeg")));
        }else if ((tblDestino.getModel().getValueAt(setar, 0).toString().equals("3"))){
            lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/turismo/imagens/belo_horizonte.jpg")));
        }else if ((tblDestino.getModel().getValueAt(setar, 0).toString().equals("4"))){
            lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/turismo/imagens/curitiba.jpg")));
        }
    }

    /**
     * método responsável por limpar a pesquisa após conclusão
     */
    private void limpar() {
        txtDestEstado.setText(null);
        txtDestCidade.setText(null);
        txtDestid.setText(null);
        txtDestLocal.setText(null);
        ((DefaultTableModel) tblDestino.getModel()).setRowCount(0);
        cboDestCategoria.setSelectedItem(" ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDestinoPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDestino = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboDestCategoria = new javax.swing.JComboBox<>();
        btnDestAdicionar = new javax.swing.JButton();
        txtDestid = new javax.swing.JTextField();
        txtDestEstado = new javax.swing.JTextField();
        txtDestCidade = new javax.swing.JTextField();
        txtDestLocal = new javax.swing.JTextField();
        lblImagem = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(518, 565));

        jLabel1.setText("Destino");

        txtDestinoPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDestinoPesquisarMouseClicked(evt);
            }
        });
        txtDestinoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinoPesquisarActionPerformed(evt);
            }
        });
        txtDestinoPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDestinoPesquisarKeyReleased(evt);
            }
        });

        tblDestino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "idDestino", "estado", "cidade", "local", "categoria", "datainil", "datafim"
            }
        ));
        tblDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDestinoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDestino);

        jLabel2.setText("iddestino");

        jLabel3.setText("Estado");

        jLabel4.setText("Cidade");

        jLabel5.setText("Local");

        jLabel6.setText("Categoria");

        cboDestCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aventura", "Relaxamento", "Cultura", " " }));

        btnDestAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/turismo/icones/create2.png"))); // NOI18N
        btnDestAdicionar.setToolTipText("Adicionar");
        btnDestAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDestAdicionarActionPerformed(evt);
            }
        });

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/turismo/icones/aviao.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtDestinoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtDestid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtDestEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtDestLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cboDestCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnDestAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtDestCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lblImagem)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDestinoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDestid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtDestEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtDestCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDestLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(cboDestCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(btnDestAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDestinoPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDestinoPesquisarKeyReleased
        pesquisarDestino();        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinoPesquisarKeyReleased

    private void txtDestinoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinoPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinoPesquisarActionPerformed

    private void txtDestinoPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDestinoPesquisarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinoPesquisarMouseClicked

    private void tblDestinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDestinoMouseClicked
        setarCampos();          // TODO add your handling code here:
    }//GEN-LAST:event_tblDestinoMouseClicked

    private void btnDestAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDestAdicionarActionPerformed
        adicionar();        // TODO add your handling code here:
    }//GEN-LAST:event_btnDestAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDestAdicionar;
    private javax.swing.JComboBox<String> cboDestCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JTable tblDestino;
    private javax.swing.JTextField txtDestCidade;
    private javax.swing.JTextField txtDestEstado;
    private javax.swing.JTextField txtDestLocal;
    private javax.swing.JTextField txtDestid;
    private javax.swing.JTextField txtDestinoPesquisar;
    // End of variables declaration//GEN-END:variables
}
