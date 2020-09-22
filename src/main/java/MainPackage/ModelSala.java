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
public class ModelSala implements java.io.Serializable {

    private String nomeSala;
    private String idSala;
    private int qtdMaxPacientes;

    public ModelSala(String nomeSala, String idSala, int qtdMaxPacientes) {
        this.nomeSala = nomeSala;
        this.idSala = idSala;
        this.qtdMaxPacientes = qtdMaxPacientes;
    }

    ModelSala() {

    }

    public String getNomeSala() {
        return this.nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public String getidSala() {
        return this.idSala;
    }

    public void setidSala(String idSala) {
        this.idSala = idSala;
    }

    public int getQtdPaciente() {
        return this.qtdMaxPacientes;
    }

    public void setQtdPaciente(int qtdMaxPacientes) {
        this.qtdMaxPacientes = qtdMaxPacientes;
    }
}
