/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.jidesoft.swing.ComboBoxSearchable;
import java.awt.Component;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Pacotes extends javax.swing.JFrame {

    /**
     * Creates new form CadastroPacotes
     *
     * @throws java.lang.InterruptedException
     * @throws java.util.concurrent.ExecutionException
     */
    public Pacotes() throws InterruptedException, ExecutionException {
        initComponents();
        initComboProcs();
        btnAtualizar.setVisible(false);
    }

    Pacotes(ModelPacote pacote) throws InterruptedException, ExecutionException {
        initComponents();
        initComboProcs();
        initFields(pacote);
        btnCadastroPacote.setVisible(false);
        this.setTitle("CFRA - Atualizar Pacotes");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCadastroPacote = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        comboRateio = new javax.swing.JComboBox<>();
        btnVoltar = new javax.swing.JButton();
        comboProcs = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        edtNomePacote = new javax.swing.JTextField();
        edtValorPacote = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        edtQtdSessoes = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        txtId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CFRA - Cadastro Pacotes");

        jLabel2.setText("Procedimento:");

        jLabel1.setText("Nome Pacote/Sessão");

        btnCadastroPacote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/confirmar.png"))); // NOI18N
        btnCadastroPacote.setText("Confirmar");
        btnCadastroPacote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroPacoteActionPerformed(evt);
            }
        });

        jLabel4.setText("Valor:");

        comboRateio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Porcentagem", "05,00%", "10,00%", "15,00%", "20,00%", "25,00%", "30,00%", "35,00%", "40,00%", "45,00%", "50,00%", "55,00%", "60,00%", "65,00%", "70,00%", "75,00%", "80,00%", "85,00%", "90,00%", "95,00%" }));

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        comboProcs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Quantidade de Sessões:");

        jLabel5.setText("Rateio:");

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/confirmar.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnCadastroPacote, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(comboRateio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnVoltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(comboProcs, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(edtNomePacote, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(edtValorPacote, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(edtQtdSessoes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnAtualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtId, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastroPacote))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboProcs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(edtQtdSessoes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(edtValorPacote, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(comboRateio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(edtNomePacote, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(41, 41, 41))))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtId)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtNomePacote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(13, 13, 13)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboProcs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edtQtdSessoes, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edtValorPacote, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboRateio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastroPacote)
                    .addComponent(btnVoltar)
                    .addComponent(btnAtualizar))
                .addContainerGap())
        );

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboProcs, edtNomePacote, edtQtdSessoes, edtValorPacote});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastroPacoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroPacoteActionPerformed
        if ("Selecione um Procedimento".equals(comboProcs.getSelectedItem().toString())) {
            Component frame = null;
            JOptionPane.showMessageDialog(frame,
                    "Favor verificar o Procedimento");
        } else if ("Porcentagem".equals(comboRateio.getSelectedItem().toString())) {
            Component frame = null;
            JOptionPane.showMessageDialog(frame,
                    "Favor verificar a Porcentagem");
        } else if ("".equals(edtNomePacote.getText())
                || "".equals(edtQtdSessoes.getText())
                || "".equals(edtValorPacote.getText())) {
            Component frame = null;
            JOptionPane.showMessageDialog(frame,
                    "Favor verificar a todos os campos");
        } else {
            ModelPacote mdcadpac = new ModelPacote();
            mdcadpac.setNomePac(edtNomePacote.getText());
            mdcadpac.setProcedimento(comboProcs.getSelectedItem().toString());
            mdcadpac.setQtdSessoes(edtQtdSessoes.getText());
            mdcadpac.setValorPac(Double.valueOf(edtValorPacote.getText().replace(",", ".")));
            mdcadpac.setRateiro(Double.valueOf(comboRateio.getSelectedItem().toString().replace("%", "").replace(",", ".")));

            String uuid = java.util.UUID.randomUUID().toString();
            mdcadpac.setidPac(uuid);

            FireBaseClient fbcli = new FireBaseClient();

            DocumentReference docRef = fbcli.FirebaseInt().collection("pacotes").document(uuid);
            ApiFuture<WriteResult> result = docRef.set(mdcadpac);
            try {
                System.out.println("Update time : " + result.get().getUpdateTime());
                Component frame = null;
                JOptionPane.showMessageDialog(frame,
                        "Pacote cadastrado com sucesso!");
                edtNomePacote.setText("");
                edtQtdSessoes.setText("");
                edtValorPacote.setText("");

            } catch (InterruptedException | ExecutionException ex) {
                Logger.getLogger(Anamnese.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnCadastroPacoteActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if ("Selecione um Procedimento".equals(comboProcs.getSelectedItem().toString())) {
            Component frame = null;
            JOptionPane.showMessageDialog(frame,
                    "Favor verificar o Procedimento");
        } else if ("Porcentagem".equals(comboRateio.getSelectedItem().toString())) {
            Component frame = null;
            JOptionPane.showMessageDialog(frame,
                    "Favor verificar a Porcentagem");
        } else if ("".equals(edtNomePacote.getText())
                || "".equals(edtQtdSessoes.getText())
                || "".equals(edtValorPacote.getText())) {
            Component frame = null;
            JOptionPane.showMessageDialog(frame,
                    "Favor verificar a todos os campos");
        } else {
            ModelPacote mdcadpac = new ModelPacote();
            mdcadpac.setNomePac(edtNomePacote.getText());
            mdcadpac.setProcedimento(comboProcs.getSelectedItem().toString());
            mdcadpac.setQtdSessoes(edtQtdSessoes.getText());
            mdcadpac.setValorPac(Double.valueOf(edtValorPacote.getText().replace(",", ".")));
            mdcadpac.setRateiro(Double.valueOf(comboRateio.getSelectedItem().toString().replace("%", "").replace(",", ".")));

            mdcadpac.setidPac(txtId.getText());

            FireBaseClient fbcli = new FireBaseClient();

            DocumentReference docRef = fbcli.FirebaseInt().collection("pacotes").document(txtId.getText());
            ApiFuture<WriteResult> result = docRef.set(mdcadpac);
            try {
                System.out.println("Update time : " + result.get().getUpdateTime());
                Component frame = null;
                JOptionPane.showMessageDialog(frame,
                        "Pacote cadastrado com sucesso!");
                edtNomePacote.setText("");
                edtQtdSessoes.setText("");
                edtValorPacote.setText("");

            } catch (InterruptedException | ExecutionException ex) {
                Logger.getLogger(Anamnese.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.dispose();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Pacotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pacotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pacotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pacotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Pacotes().setVisible(true);
            } catch (InterruptedException | ExecutionException ex) {
                Logger.getLogger(Pacotes.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastroPacote;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboProcs;
    private javax.swing.JComboBox<String> comboRateio;
    private javax.swing.JTextField edtNomePacote;
    private javax.swing.JTextField edtQtdSessoes;
    private javax.swing.JTextField edtValorPacote;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtId;
    // End of variables declaration//GEN-END:variables

    private void initComboProcs() throws InterruptedException, ExecutionException {
        FireBaseClient fbcli = new FireBaseClient();

        // asynchronously retrieve all users
        ApiFuture<QuerySnapshot> query = fbcli.FirebaseInt().collection("procedimentos").get();
        // ...
        // query.get() blocks on response
        QuerySnapshot querySnapshot = query.get();
        List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
        comboProcs.removeAllItems();
        comboProcs.addItem("Selecione um Procedimento");
        documents.forEach((QueryDocumentSnapshot document) -> {
            String nome = document.toObject(ModelProcedimento.class).getProcedimento();
            comboProcs.addItem(nome);
            //ComboBoxSearchable searchable = new ComboBoxSearchable(comboPacientes);
        });

        ComboBoxSearchable searchable = new ComboBoxSearchable(comboProcs);
    }

    private void initFields(ModelPacote pacote) {
        edtNomePacote.setText(pacote.getNomePac());
        edtQtdSessoes.setText(pacote.getQtdSessoes());
        edtValorPacote.setText(pacote.getValorPac().toString());
        comboProcs.setSelectedItem(pacote.getProcedimento());
        String rateiro = pacote.getRateio().toString().replace(".0", "") + ",00%";
        comboRateio.setSelectedItem(rateiro);
        txtId.setText(pacote.getidPac());
        txtId.setVisible(false);
    }

}