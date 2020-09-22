/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import com.google.api.client.util.DateTime;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Vector;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.EventAttendee;
import com.google.api.services.calendar.model.EventDateTime;
import com.google.api.services.calendar.model.EventReminder;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.SetOptions;
import com.google.cloud.firestore.WriteResult;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author marcelo
 */
public class AgendaRemarcarLista extends javax.swing.JFrame {

    DefaultTableModel modeloTabela = new DefaultTableModel();
    String pacienteIdent;
    String nomePac;
    String eMail;
    ArrayList<ModelCadastroFunc> mdfunc = new ArrayList<>();
    Enumeration vEnumOld;

    /**
     * Creates new form AgendaRemarcar
     */
    public AgendaRemarcarLista() {
        initComponents();
    }

    AgendaRemarcarLista(String pacienteId, String nome, String email) throws InterruptedException, ExecutionException {
        initComponents();
        initFrame(pacienteId);
        pacienteIdent = pacienteId;
        nomePac = nome;
        eMail = email;
        getAllFunc();
        loadTabelaGeral();
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
        txtPaciente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSessoes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CFRA - Remarcar Paciente");

        txtPaciente.setText("paciente");

        tabelaSessoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaSessoes);

        jLabel1.setText("Paciente:");

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/confirmar.png"))); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(txtPaciente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnVoltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnConfirmar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPaciente)
                        .addGap(494, 494, 494))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirmar)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnVoltar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
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

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // Get all the table data
        Vector data = modeloTabela.getDataVector();
        Enumeration vEnum = data.elements();

        //essa são as sessões
        ArrayList<HashMap<String, Timestamp>> agendaClass = new ArrayList<>();
        ModelAgendaPaciente agendaPaciente = new ModelAgendaPaciente();
        while (vEnum.hasMoreElements()) {

            String line = vEnum.nextElement() + " ";
            String lineNew = line.replace("[", "").replace("]", "").replace(", ", " ; ");
            //13-07-2020 - 06:00/07:00 ; Bianca Vergara ; 2020-07-12 00:00:00.0 ; CFRA - SALA 2 ; dc46891932e24ac7acceca4fd76dea22 
            //pegar o idcal do responsável

            FireBaseClient fbc = new FireBaseClient();
            ApiFuture<QuerySnapshot> future = fbc.FirebaseInt().collection("funcionarios")
                    .whereEqualTo("nomeFunc", lineNew.split(" ; ")[1])
                    .get();
            try {
                List<QueryDocumentSnapshot> documents = future.get().getDocuments();
                for (DocumentSnapshot document : documents) {
                    String idCal = document.getString("calendarId");
                    //delete evento específicos do usuário no google agenda
                    GoogleAgendaClientCalendar gaclical = new GoogleAgendaClientCalendar();
                    String event = lineNew.split(" ; ")[4];
                    gaclical.CalendarSVC().events().delete(idCal, event.trim()).execute();

                    //agora inserir novamente os paranauê
                    String eveId = java.util.UUID.randomUUID().toString().replace("-", "");

                    HashMap<String, Timestamp> sessoesPaciente = new HashMap<>();
                    try {

                        String start = lineNew.split(" ; ")[0];
                        String ano = start.split("-")[2].trim();
                        String mes = start.split("-")[1];
                        String dia = start.split("-")[0];
                        String horaIni = start.split(" - ")[1].split("/")[0];
                        String horaFim = start.split(" - ")[1].split("/")[1];
                        String agIni = ano + "-" + mes + "-" + dia + "T" + horaIni + ":00-03:00";
                        String agFim = ano + "-" + mes + "-" + dia + "T" + horaFim + ":00-03:00";

                        String comboSala = lineNew.split(" ; ")[3];

                        //pegar o Id Calendar do profissional
                        ModelCadastroFunc func = mdfunc.stream()
                                .filter(nome -> lineNew.split(" ; ")[1].equals(nome.getNomeFunc()))
                                .findAny()
                                .orElse(null);

                        //colocar o timestamp na terceira coluna da linha
                        //objetivo --> 2020-07-11 16:10:15.732
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        Date parsedDate;
                        parsedDate = dateFormat.parse(agIni.split("T")[0]);
                        Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
                        //trocar o eventId
                        String lineReplaced = lineNew.replace(event, eveId);
                        //trocar o timestamp da linha
                        String tsLinha = lineReplaced.split(" ; ")[2];
                        String newReplace = lineReplaced.replace(tsLinha, timestamp.toString());

                        sessoesPaciente.put(newReplace, timestamp);
                        agendaClass.add(sessoesPaciente);

                        setEvent(nomePac,
                                comboSala,
                                lineNew.split(" ; ")[1],
                                agIni,
                                agFim,
                                eMail,
                                "marcelorv@gmail.com",
                                eveId,
                                func.getCalendarId());

                    } catch (ParseException ex) {
                        Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    agendaPaciente.setSessoes(agendaClass);
                    FireBaseClient fbcli = new FireBaseClient();

                    DocumentReference docRef = fbcli.FirebaseInt().collection("agendamentos").document(pacienteIdent);
                    ApiFuture<WriteResult> result = docRef.set(agendaPaciente, SetOptions.mergeFields("sessoes"));
                    try {
                        System.out.println("Update time : " + result.get().getUpdateTime());

                    } catch (InterruptedException | ExecutionException ex) {
                        Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } catch (InterruptedException | ExecutionException | GeneralSecurityException | IOException ex) {
                Logger.getLogger(AgendaRemarcarLista.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        Component frame = null;
        JOptionPane.showMessageDialog(frame,
                "Agenda atualizada com sucesso!");

        this.dispose();
    }//GEN-LAST:event_btnConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(AgendaRemarcarLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaRemarcarLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaRemarcarLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaRemarcarLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AgendaRemarcarLista().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tabelaSessoes;
    private javax.swing.JLabel txtPaciente;
    // End of variables declaration//GEN-END:variables

    private void initFrame(String pacienteId) {
        this.tabelaSessoes.setModel(modeloTabela);
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tabelaSessoes.getModel());

        tabelaSessoes.setRowSorter(sorter);
        modeloTabela.addColumn("Data - Hora");
        modeloTabela.addColumn("Responsável");
        modeloTabela.addColumn("Timestamp");
        modeloTabela.addColumn("Sala");
        modeloTabela.addColumn("Id Agenda");

        FireBaseClient fbc = new FireBaseClient();
        try {
            DocumentReference docRef = fbc.FirebaseInt().collection("agendamentos").document(pacienteId);
            ApiFuture<DocumentSnapshot> future = docRef.get();
            DocumentSnapshot document = future.get();
            ModelAgendaPaciente agp = null;
            if (document.exists()) {
                // convert document to POJO
                agp = document.toObject(ModelAgendaPaciente.class);
                txtPaciente.setText(document.getString("nome"));
                ArrayList<HashMap<String, Timestamp>> sessoes = agp.sessoes;
                for (HashMap<String, Timestamp> hashMap : sessoes) {
                    hashMap.keySet().stream().map((key) -> {
                        System.out.println("String Sessão => " + key);
                        modeloTabela.addRow(
                                new Object[]{
                                    key.split(" ; ")[0],
                                    key.split(" ; ")[1],
                                    key.split(" ; ")[2],
                                    key.split(" ; ")[3],
                                    key.split(" ; ")[4]

                                });
                        return key;
                    }).map((key) -> {

                        return key;
                    }).forEachOrdered((key) -> {
                        //ArrayList para conferir na hora de inserir as sessoes no FBase

                    });
                }
                //ocultando coluna Timestamp
                tabelaSessoes.getColumn("Timestamp").setPreferredWidth(0);
                tabelaSessoes.getColumn("Timestamp").setMinWidth(0);
                tabelaSessoes.getColumn("Timestamp").setWidth(0);
                tabelaSessoes.getColumn("Timestamp").setMaxWidth(0);

                //ocultando colunda ID Agendamento
                tabelaSessoes.getColumn("Id Agenda").setPreferredWidth(0);
                tabelaSessoes.getColumn("Id Agenda").setMinWidth(0);
                tabelaSessoes.getColumn("Id Agenda").setWidth(0);
                tabelaSessoes.getColumn("Id Agenda").setMaxWidth(0);

                tabelaSessoes.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (e.getClickCount() == 2) {

                        }
                        if (e.getClickCount() == 1) {

                            int row = tabelaSessoes.getSelectedRow();
                            int col = tabelaSessoes.getSelectedColumn();
                            System.out.println(col);
                            TableModel model = tabelaSessoes.getModel();
                            String value = model.getValueAt(row, col).toString();
                            switch (col) {
                                case 0:
                                    AgendaRemarcarDiaHora aghd;
                                    try {
                                        aghd = new AgendaRemarcarDiaHora(row, col, value, tabelaSessoes, modeloTabela);
                                        aghd.setVisible(true);
                                    } catch (ParseException ex) {
                                        Logger.getLogger(AgendaRemarcarLista.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    break;
                                case 1:
                                    AgendaRemarcarResponsavel agresp;
                                    try {
                                        agresp = new AgendaRemarcarResponsavel(row, col, value, tabelaSessoes, modeloTabela);
                                        agresp.setVisible(true);
                                    } catch (InterruptedException | ExecutionException ex) {
                                        Logger.getLogger(AgendaRemarcarLista.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    break;
                                case 3:
                                    AgendaRemarcarSala agsala;
                                    try {
                                        System.out.println("passei aqui");
                                        agsala = new AgendaRemarcarSala(row, col, value, tabelaSessoes, modeloTabela);
                                        agsala.setVisible(true);
                                    } catch (InterruptedException | ExecutionException ex) {
                                        Logger.getLogger(AgendaRemarcarLista.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    break;
                                default:
                                    break;
                            }

                        }
                    }
                }
                );

            } else {
                Component frame = null;
                JOptionPane.showMessageDialog(frame,
                        "Paciente sem Agendamentos!");
                this.dispose();
            }

        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void setEvent(
            String sumario,
            String location,
            String descricao,
            String inicio,
            String fim,
            String email1,
            String email2,
            String id,
            String func
    ) {
        try {

            GoogleAgendaClientCalendar gacc = new GoogleAgendaClientCalendar();

            Event event = new Event()
                    .setId(id)
                    .setSummary(sumario)
                    .setLocation(location)
                    .setDescription(descricao);

            DateTime startDateTime = new DateTime(inicio);
            EventDateTime start = new EventDateTime()
                    .setDateTime(startDateTime)
                    .setTimeZone("America/Sao_Paulo");
            event.setStart(start);

            DateTime endDateTime = new DateTime(fim);
            EventDateTime end = new EventDateTime()
                    .setDateTime(endDateTime)
                    .setTimeZone("America/Sao_Paulo");
            event.setEnd(end);

            EventAttendee[] attendees = new EventAttendee[]{
                new EventAttendee().setEmail(email1),
                new EventAttendee().setEmail(email2),};
            event.setAttendees(Arrays.asList(attendees));

            EventReminder[] reminderOverrides = new EventReminder[]{
                new EventReminder().setMethod("email").setMinutes(24 * 60),
                new EventReminder().setMethod("popup").setMinutes(10),};
            Event.Reminders reminders = new Event.Reminders()
                    .setUseDefault(false)
                    .setOverrides(Arrays.asList(reminderOverrides));
            event.setReminders(reminders);

            //String calendarId = "primary";
            String calendarId = func;
            event = gacc.CalendarSVC().events().insert(calendarId, event).execute();

            System.out.printf("Event created: %s\n", event.getHtmlLink());

        } catch (GeneralSecurityException | IOException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getAllFunc() throws InterruptedException, ExecutionException {
        FireBaseClient fbcli = new FireBaseClient();
        ApiFuture<QuerySnapshot> query = fbcli.FirebaseInt().collection("funcionarios").get();
        QuerySnapshot querySnapshot = query.get();
        List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
        documents.forEach((QueryDocumentSnapshot document) -> {
            String func = document.toObject(ModelCadastroFunc.class).getNomeFunc();
            mdfunc.add(document.toObject(ModelCadastroFunc.class));
        });
    }

    private void loadTabelaGeral() {
        // Get all the table data
        Vector data = modeloTabela.getDataVector();
        vEnumOld = data.elements();
        while (vEnumOld.hasMoreElements()) {
            String line = vEnumOld.nextElement() + " ";
            String lineNew = line.replace("[", "").replace("]", "").replace(", ", " ; ");
            System.out.println(lineNew);
        }
    }
}