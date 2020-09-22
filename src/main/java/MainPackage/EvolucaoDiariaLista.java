/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import static java.text.DateFormat.FULL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author marcelo
 */
public class EvolucaoDiariaLista extends javax.swing.JFrame {

    DefaultTableModel modeloTabela = new DefaultTableModel();

    /**
     * Creates new form EvolucaoDiariaLista
     */
    public EvolucaoDiariaLista() {
        initComponents();
    }

    public EvolucaoDiariaLista(String cpf) {
        initComponents();
        carregaListaEvolucao(cpf);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaListaEvo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CFRA - Lista Evolucao Diaria");

        tabelaListaEvo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaListaEvo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(EvolucaoDiariaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EvolucaoDiariaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EvolucaoDiariaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EvolucaoDiariaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EvolucaoDiariaLista().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaListaEvo;
    // End of variables declaration//GEN-END:variables

    private void carregaListaEvolucao(String cpf) {
        this.tabelaListaEvo.setModel(modeloTabela);
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tabelaListaEvo.getModel());

        tabelaListaEvo.setRowSorter(sorter);
        modeloTabela.addColumn("Nome Paciente");
        modeloTabela.addColumn("Data Avaliação");
        modeloTabela.addColumn("Responsável");
        modeloTabela.addColumn("Id Evolução");

        FireBaseClient fbc;
        fbc = new FireBaseClient();

        ApiFuture<QuerySnapshot> future;
        future = fbc.FirebaseInt().collection("evolucaodiaria")
                .whereEqualTo("cpf", cpf).get();

        try {
            List<QueryDocumentSnapshot> documents = future.get().getDocuments();

            documents.forEach((QueryDocumentSnapshot document) -> {
                Locale loc = new Locale("pt", "BR");
                DateFormat df = DateFormat.getDateInstance(FULL, loc);
                com.google.cloud.Timestamp ts = document.getTimestamp("data");
                String dataEvo = ts.toString();
                if (document.exists()) {
                    modeloTabela.addRow(
                            new Object[]{
                                document.getString("nome"),
                                dataEvo,
                                document.getString("responsavel"),
                                document.getString("idEvo")

                            });

                }
            });

        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(RelatorioSaidas.class.getName()).log(Level.SEVERE, null, ex);
        }

        tabelaListaEvo.addMouseListener(
                new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {

                }
                if (e.getClickCount() == 1) {
                    int index = tabelaListaEvo.getSelectedRow();
                    TableModel model = tabelaListaEvo.getModel();
                    String idEvo = model.getValueAt(index, 3).toString();

                    EvolucaoDiariaForm evoform;
                    try {
                        evoform = new EvolucaoDiariaForm(idEvo, true);
                        evoform.setVisible(true);

                    } catch (InterruptedException | ExecutionException ex) {
                        Logger.getLogger(EvolucaoDiariaLista.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        }
        );

        List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
        sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
        sortKeys.add(new RowSorter.SortKey(3, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);

    }
}
