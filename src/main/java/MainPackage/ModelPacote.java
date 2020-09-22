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
public class ModelPacote implements java.io.Serializable {

    private String nomePac;
    private String idPac;
    private String procedimento;
    private String qtdSessoes;
    private Double valorPac;
    private Double rateio;

    public ModelPacote(String nomePac,
            String idPac,
            String procedimento,
            String qtdSessoes,
            Double valorPac,
            Double rateio) {

        this.nomePac = nomePac;
        this.idPac = idPac;
        this.procedimento = procedimento;
        this.qtdSessoes = qtdSessoes;
        this.valorPac = valorPac;
        this.rateio = rateio;
    }

    ModelPacote() {

    }

    public String getNomePac() {
        return this.nomePac;
    }

    public void setNomePac(String nomePac) {
        this.nomePac = nomePac;
    }

    public String getidPac() {
        return this.idPac;
    }

    public void setidPac(String idPac) {
        this.idPac = idPac;
    }

    public String getProcedimento() {
        return this.procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public String getQtdSessoes() {
        return this.qtdSessoes;
    }

    public void setQtdSessoes(String qtdSessoes) {
        this.qtdSessoes = qtdSessoes;
    }

    public Double getValorPac() {
        return this.valorPac;
    }

    public void setValorPac(Double valorPac) {
        this.valorPac = valorPac;
    }

    public Double getRateio() {
        return this.rateio;
    }

    public void setRateiro(Double rateio) {
        this.rateio = rateio;
    }

}
