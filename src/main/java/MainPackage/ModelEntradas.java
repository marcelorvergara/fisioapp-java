/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import com.google.cloud.Timestamp;

/**
 *
 * @author marcelo
 */
public class ModelEntradas implements java.io.Serializable {

    private String nomePaciente;
    private String cpf;
    private String pacote;
    private String idPacote;
    private Timestamp data;
    private Double valor;
    private String idEntrada;
    private String responsavel;
    private Double rateio;

    ModelEntradas(String nomePaciente,
            String cpf,
            String pacote,
            String idPacote,
            Timestamp data,
            Double valor,
            String idEntrada,
            String responsavel,
            Double rateio) {

        this.nomePaciente = nomePaciente;
        this.cpf = cpf;
        this.pacote = pacote;
        this.idPacote = idPacote;
        this.data = data;
        this.valor = valor;
        this.idEntrada = idEntrada;
        this.responsavel = responsavel;
        this.rateio = rateio;
    }

    ModelEntradas() {

    }

    public String getNomePaciente() {
        return this.nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPacote() {
        return this.pacote;
    }

    public void setPacote(String pacote) {
        this.pacote = pacote;
    }

    public String getIdPacote() {
        return this.idPacote;
    }

    public void setIdPacote(String idPacote) {
        this.idPacote = idPacote;
    }

    public Timestamp getData() {
        return this.data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getIdEntrada() {
        return this.idEntrada;
    }

    public void setIdEntrada(String idEntrada) {
        this.idEntrada = idEntrada;
    }

    public String getResponsavel() {
        return this.responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Double getRateio() {
        return this.rateio;
    }

    public void setRateio(Double rateio) {
        this.rateio = rateio;
    }
}
