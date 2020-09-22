/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import static MainPackage.TelaPrincipal.edtNome;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.SetOptions;
import com.google.cloud.firestore.WriteResult;
import java.awt.Color;
import java.awt.Component;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class TelaPrincipalEditarPaciente extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     *
     * @throws java.lang.InterruptedException
     * @throws java.util.concurrent.ExecutionException
     */
    public TelaPrincipalEditarPaciente() throws InterruptedException, ExecutionException {

        initComponents();

    }

    TelaPrincipalEditarPaciente(ModelPaciente pacienteObj) throws ParseException {
        initComponents();
        initEdtsTexts(pacienteObj);
        System.out.println(pacienteObj.getId());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopCadastro = new javax.swing.JDesktopPane();
        txtEndereco = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        txtDataAvaliacao = new javax.swing.JLabel();
        txtSexo = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JLabel();
        txtIdade = new javax.swing.JLabel();
        txtEstadoCivil = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        edtIdade = new javax.swing.JTextField();
        edtEndereco = new javax.swing.JTextField();
        edtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JLabel();
        edtEmail = new javax.swing.JTextField();
        txtCpf = new javax.swing.JLabel();
        edtCpf = new javax.swing.JTextField();
        edtSexo = new javax.swing.JComboBox<>();
        edtEstadoCivil = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        edtWhatsapp = new javax.swing.JComboBox<>();
        edtDataAval = new javax.swing.JTextField();
        btnSalvaAlteracao = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CFRA - Fisio App");

        jDesktopCadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopCadastro.setPreferredSize(new java.awt.Dimension(650, 350));

        txtEndereco.setText("Endereço:");

        txtNome.setText("Nome:");

        txtDataAvaliacao.setText("Data Avaliação:");

        txtSexo.setText("Sexo:");

        txtTelefone.setText("Telefone:");

        txtIdade.setText("Dt. Nascimento:");

        txtEstadoCivil.setText("Estado Civil:");

        txtEmail.setText("Email");

        txtCpf.setText("CPF");

        edtSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indiferente", "Feminino", "Masculino" }));
        edtSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtSexoActionPerformed(evt);
            }
        });

        edtEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indiferente", "Solteiro", "Casado", "Separado", "Divorciado", "Viúvo" }));

        jLabel2.setText("Whatsapp:");

        edtWhatsapp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        btnSalvaAlteracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        btnSalvaAlteracao.setText("Salvar Alterações");
        btnSalvaAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvaAlteracaoActionPerformed(evt);
            }
        });

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jDesktopCadastro.setLayer(txtEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(txtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(txtDataAvaliacao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(txtSexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(txtTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(txtIdade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(txtEstadoCivil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(edtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(edtIdade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(edtEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(edtTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(txtEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(edtEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(txtCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(edtCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(edtSexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(edtEstadoCivil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(edtWhatsapp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(edtDataAval, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(btnSalvaAlteracao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(btnVoltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopCadastro.setLayer(txtId, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopCadastroLayout = new javax.swing.GroupLayout(jDesktopCadastro);
        jDesktopCadastro.setLayout(jDesktopCadastroLayout);
        jDesktopCadastroLayout.setHorizontalGroup(
            jDesktopCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtId)
                .addGap(46, 675, Short.MAX_VALUE))
            .addGroup(jDesktopCadastroLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jDesktopCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopCadastroLayout.createSequentialGroup()
                        .addGroup(jDesktopCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstadoCivil)
                            .addComponent(txtSexo))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jDesktopCadastroLayout.createSequentialGroup()
                        .addGroup(jDesktopCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopCadastroLayout.createSequentialGroup()
                                .addGroup(jDesktopCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefone)
                                    .addComponent(txtDataAvaliacao)
                                    .addComponent(txtEmail)
                                    .addComponent(txtCpf)
                                    .addComponent(txtIdade)
                                    .addComponent(txtNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtDataAval, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopCadastroLayout.createSequentialGroup()
                                        .addGroup(jDesktopCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(edtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopCadastroLayout.createSequentialGroup()
                                                .addComponent(edtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edtWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtEndereco))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvaAlteracao)
                .addContainerGap())
        );
        jDesktopCadastroLayout.setVerticalGroup(
            jDesktopCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopCadastroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jDesktopCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edtIdade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSexo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edtSexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jDesktopCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtEstadoCivil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstadoCivil, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16)
                .addGroup(jDesktopCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edtEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataAvaliacao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edtDataAval, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edtTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edtWhatsapp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jDesktopCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopCadastroLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jDesktopCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(edtCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(txtId))
                    .addGroup(jDesktopCadastroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDesktopCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVoltar)
                            .addComponent(btnSalvaAlteracao))))
                .addContainerGap())
        );

        jDesktopCadastroLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {edtCpf, edtDataAval, edtEmail, edtEndereco, edtEstadoCivil, edtIdade, edtNome, edtSexo, edtTelefone, edtWhatsapp});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        ConsultarPaciente cp;
        try {
            cp = new ConsultarPaciente();
            cp.setVisible(true);
            this.dispose();
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(TelaPrincipalEditarPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvaAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvaAlteracaoActionPerformed

        String phone = edtTelefone.getText().replace("-", "").replace("/", "").trim();

        FireBaseClient fbc = new FireBaseClient();

        DocumentReference docRef;
        docRef = fbc.FirebaseInt().collection("pacientes").document(txtId.getText());
        Map<String, Object> updates = new HashMap<>();
        updates.put("idade", edtIdade.getText());
        updates.put("sexo", edtSexo.getSelectedItem().toString());
        updates.put("estadoCivil", edtEstadoCivil.getSelectedItem().toString());
        updates.put("endereco", edtEndereco.getText());
        updates.put("dataAvaliacao", edtDataAval.getText());
        updates.put("telefone", phone.replaceAll("\\s+", ""));
        updates.put("cpf", edtCpf.getText());
        updates.put("email", edtEmail.getText());
        updates.put("whatsapp", edtWhatsapp.getSelectedItem().toString());

        ApiFuture<WriteResult> result = docRef.update(updates);

        //System.out.println("Update time : " + result.get().getUpdateTime());
        Component frame = null;
        JOptionPane.showMessageDialog(frame,
                "Paciente atualizado com sucesso!");
        this.dispose();
    }//GEN-LAST:event_btnSalvaAlteracaoActionPerformed

    private void edtSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtSexoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalEditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalEditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalEditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalEditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new TelaPrincipalEditarPaciente().setVisible(true);
            } catch (InterruptedException | ExecutionException ex) {
                Logger.getLogger(TelaPrincipalEditarPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvaAlteracao;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField edtCpf;
    private javax.swing.JTextField edtDataAval;
    private javax.swing.JTextField edtEmail;
    public javax.swing.JTextField edtEndereco;
    private javax.swing.JComboBox<String> edtEstadoCivil;
    public javax.swing.JTextField edtIdade;
    public static javax.swing.JTextField edtNome;
    private javax.swing.JComboBox<String> edtSexo;
    public javax.swing.JTextField edtTelefone;
    private javax.swing.JComboBox<String> edtWhatsapp;
    private javax.swing.JDesktopPane jDesktopCadastro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel txtCpf;
    private javax.swing.JLabel txtDataAvaliacao;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtEndereco;
    private javax.swing.JLabel txtEstadoCivil;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtIdade;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtSexo;
    private javax.swing.JLabel txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void initEdtsTexts(ModelPaciente pacienteObj) throws ParseException {
        edtNome.setText(pacienteObj.getnome());
        edtNome.setEditable(false);
        edtNome.setBackground(Color.GRAY);
        edtIdade.setText(pacienteObj.getidade());
        edtSexo.setSelectedItem(pacienteObj.getsexo());
        edtEstadoCivil.setSelectedItem(pacienteObj.getestadoCivil());
        edtEndereco.setText(pacienteObj.getendereco());
        edtDataAval.setText(pacienteObj.getdataAvaliacao());
        edtDataAval.setEditable(false);
        edtTelefone.setText(pacienteObj.gettelefone());
        edtWhatsapp.setSelectedItem(pacienteObj.getWhatsapp());
        edtEmail.setText(pacienteObj.getEmail());
        edtCpf.setText(pacienteObj.getcpf());
        edtCpf.setEditable(false);
        txtId.setText(pacienteObj.getId());

    }

}
