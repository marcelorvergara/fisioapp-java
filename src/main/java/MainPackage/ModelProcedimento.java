/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

/**
 *
 * @author marcelo
 */
public class ModelProcedimento implements java.io.Serializable {

    private String nomeProcedimento;
    private String idProc;
    private int qtdMaxPac;

    public ModelProcedimento(String nomeProcedimento, String idProc, int qtdMaxPac) {
        this.nomeProcedimento = nomeProcedimento;
        this.idProc = idProc;
        this.qtdMaxPac = qtdMaxPac;
    }

    public ModelProcedimento() {

    }

    public String getProcedimento() {
        return this.nomeProcedimento;
    }

    public void setProcedimento(String nomeProcedimento) {
        this.nomeProcedimento = nomeProcedimento;
    }

    public String getidProc() {
        return this.idProc;
    }

    public void setidProc(String idProc) {
        this.idProc = idProc;
    }

    public int getQtdMaxPAciente() {
        return this.qtdMaxPac;
    }

    public void setQtdMaxPAciente(int qtdMaxPac) {
        this.qtdMaxPac = qtdMaxPac;
    }

}
