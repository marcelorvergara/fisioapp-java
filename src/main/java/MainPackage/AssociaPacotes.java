/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import com.google.api.core.ApiFuture;
import com.google.cloud.Timestamp;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.jidesoft.swing.ComboBoxSearchable;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class AssociaPacotes extends javax.swing.JFrame {

    ArrayList<ModelPacote> mdlPacote = new ArrayList<>();

    /**
     * Creates new form AssociaPacotes
     *
     * @throws java.lang.InterruptedException
     * @throws java.util.concurrent.ExecutionException
     */
    public AssociaPacotes() throws InterruptedException, ExecutionException {
        initComponents();
        initComboPacientes();
        initComboPacotes();
        initComboFuncionarios();
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
        comboPacote = new javax.swing.JComboBox<>();
        comboPaciente = new javax.swing.JComboBox<>();
        btnVoltar = new javax.swing.JButton();
        btnAssociar = new javax.swing.JButton();
        btnCadPAcote = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        comboFunc = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CFRA - Associa Paciente Pacotes");

        jLabel2.setText("Pacote:");

        jLabel1.setText("Paciente:");

        comboPacote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnAssociar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        btnAssociar.setText("Associar");
        btnAssociar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssociarActionPerformed(evt);
            }
        });

        btnCadPAcote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package-icon.png"))); // NOI18N
        btnCadPAcote.setText("Cadastrar Novo Pacote");
        btnCadPAcote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadPAcoteActionPerformed(evt);
            }
        });

        jLabel3.setText("Profissional:");

        comboFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(comboPacote, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(comboPaciente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnVoltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnAssociar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnCadPAcote, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(comboFunc, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboPaciente, 0, 336, Short.MAX_VALUE)
                    .addComponent(comboPacote, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboFunc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadPAcote)
                .addGap(35, 35, 35)
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAssociar)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboPacote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboFunc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadPAcote)
                    .addComponent(btnVoltar)
                    .addComponent(btnAssociar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboFunc, comboPaciente, comboPacote});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadPAcoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadPAcoteActionPerformed
        PacotesAssociaPaciente cadpacAss;
        try {
            cadpacAss = new PacotesAssociaPaciente();
            cadpacAss.setVisible(true);
            this.dispose();
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(AssociaPacotes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnCadPAcoteActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAssociarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssociarActionPerformed
        if ("Selecione um Paciente".equals(comboPaciente.getSelectedItem().toString())
                || "Selecione um Pacote".equals(comboPacote.getSelectedItem().toString())
                || "Selecione um Responsável".equals(comboFunc.getSelectedItem().toString())) {
            Component frame = null;
            JOptionPane.showMessageDialog(frame,
                    "Favor verificar os itens selecionados!");
        } else {
            ModelEntradas mdlEntr = new ModelEntradas();

            mdlEntr.setNomePaciente(comboPaciente.getSelectedItem().toString().split(" ; ")[0]);
            mdlEntr.setCpf(comboPaciente.getSelectedItem().toString().split(" ; ")[1]);
            mdlEntr.setPacote(comboPacote.getSelectedItem().toString());

            //buscar o idPacote
            ModelPacote pacote;
            pacote = mdlPacote.stream()
                    .filter((ModelPacote it) -> comboPacote.getSelectedItem().toString().equals(it.getNomePac()))
                    .findAny()
                    .orElse(null);

            mdlEntr.setIdPacote(pacote.getidPac());
            mdlEntr.setData(Timestamp.now());
            mdlEntr.setValor(pacote.getValorPac());
            mdlEntr.setResponsavel(comboFunc.getSelectedItem().toString());
            mdlEntr.setRateio(pacote.getRateio());

            String uuid = java.util.UUID.randomUUID().toString();
            mdlEntr.setIdEntrada(uuid);

            FireBaseClient fbcli = new FireBaseClient();
            DocumentReference docRef = fbcli.FirebaseInt().collection("entradas").document(uuid);
            ApiFuture<WriteResult> result = docRef.set(mdlEntr);
            try {
                System.out.println("Update time : " + result.get().getUpdateTime());
                Component frame = null;
                JOptionPane.showMessageDialog(frame,
                        "Associação inserida com sucesso!");

            } catch (InterruptedException | ExecutionException ex) {
                Logger.getLogger(Anamnese.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnAssociarActionPerformed

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
            java.util.logging.Logger.getLogger(AssociaPacotes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssociaPacotes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssociaPacotes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssociaPacotes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new AssociaPacotes().setVisible(true);

            } catch (InterruptedException | ExecutionException ex) {
                Logger.getLogger(AssociaPacotes.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssociar;
    private javax.swing.JButton btnCadPAcote;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboFunc;
    private javax.swing.JComboBox<String> comboPaciente;
    private javax.swing.JComboBox<String> comboPacote;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void initComboPacientes() throws InterruptedException, ExecutionException {
        // Combo dos Pacientes
        FireBaseClient fbcli = new FireBaseClient();

        // asynchronously retrieve all users
        ApiFuture<QuerySnapshot> query = fbcli.FirebaseInt().collection("pacientes").get();
        // ...
        // query.get() blocks on response
        QuerySnapshot querySnapshot = query.get();
        List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
        comboPaciente.removeAllItems();
        comboPaciente.addItem("Selecione um Paciente");
        documents
                .forEach((document) -> {

                    String nome = document.toObject(ModelPaciente.class
                    ).getnome();
                    String idPaciente = document.toObject(ModelPaciente.class
                    ).getId();
                    String combo = nome + " ; " + idPaciente;

                    comboPaciente.addItem(combo);
                    //ComboBoxSearchable searchable = new ComboBoxSearchable(comboPacientes);

                });

        ComboBoxSearchable searchable = new ComboBoxSearchable(comboPaciente);

    }

    private void initComboPacotes() throws InterruptedException, ExecutionException {
        //Combo dos Pacotes
        FireBaseClient fbclipac = new FireBaseClient();

        // asynchronously retrieve all users
        ApiFuture<QuerySnapshot> queryPac = fbclipac.FirebaseInt().collection("pacotes").get();
        // ...
        // query.get() blocks on response
        QuerySnapshot querySnapshotPac = queryPac.get();
        List<QueryDocumentSnapshot> documentsPac = null;
        documentsPac = querySnapshotPac.getDocuments();
        comboPacote.removeAllItems();
        comboPacote.addItem("Selecione um Pacote");
        documentsPac
                .forEach((QueryDocumentSnapshot documentPac) -> {
                    String nomePacote = documentPac.toObject(ModelPacote.class
                    ).getNomePac();
                    mdlPacote
                            .add(documentPac.toObject(ModelPacote.class
                            ));
                    comboPacote.addItem(nomePacote);

                });

        ComboBoxSearchable searchablePac = new ComboBoxSearchable(comboPacote);

    }

    private void initComboFuncionarios() throws InterruptedException, ExecutionException {
        //Combo dos profissional
        FireBaseClient fbclipac = new FireBaseClient();

        // asynchronously retrieve all users
        ApiFuture<QuerySnapshot> queryFunc = fbclipac.FirebaseInt().collection("funcionarios").get();
        // ...
        // query.get() blocks on response
        QuerySnapshot querySnapshotPac = queryFunc.get();
        List<QueryDocumentSnapshot> documentsFunc = null;
        documentsFunc = querySnapshotPac.getDocuments();
        comboFunc.removeAllItems();
        comboFunc.addItem("Selecione um Profissional");
        documentsFunc
                .forEach((QueryDocumentSnapshot documentFunc) -> {
                    String nomeFunc = documentFunc.toObject(ModelCadastroFunc.class
                    ).getNomeFunc();
                    comboFunc.addItem(nomeFunc);

                });

        ComboBoxSearchable searchablePac = new ComboBoxSearchable(comboPacote);
    }
}