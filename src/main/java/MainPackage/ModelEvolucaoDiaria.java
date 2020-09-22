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
public class ModelEvolucaoDiaria implements java.io.Serializable {

    private String nome;
    private String cpf;
    private String responsavel;
    private Timestamp data;
    private String impPaciente;
    private String tratamentoReal;
    private String impTerapeuta;
    private String IdEvo;

    public ModelEvolucaoDiaria() {
    }

    public ModelEvolucaoDiaria(String nome,
            String cpf,
            String responsavel,
            Timestamp data,
            String impPaciente,
            String tratamentoReal,
            String impTerapeuta,
            String IdEvo) {

        this.nome = nome;
        this.cpf = cpf;
        this.responsavel = responsavel;
        this.data = data;
        this.impPaciente = impPaciente;
        this.tratamentoReal = tratamentoReal;
        this.impTerapeuta = impTerapeuta;
        this.IdEvo = IdEvo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getResponsavel() {
        return this.responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Timestamp getData() {
        return this.data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    public String getimpPaciente() {
        return this.impPaciente;
    }

    public void setimpPaciente(String impPaciente) {
        this.impPaciente = impPaciente;
    }

    public String gettratamentoReal() {
        return this.tratamentoReal;
    }

    public void settratamentoReal(String tratamentoReal) {
        this.tratamentoReal = tratamentoReal;
    }

    public String getimpTerapeuta() {
        return this.impTerapeuta;
    }

    public void setimpTerapeuta(String impTerapeuta) {
        this.impTerapeuta = impTerapeuta;
    }

    public String getIdEvo() {
        return this.IdEvo;
    }

    public void setIdEvo(String IdEvo) {
        this.IdEvo = IdEvo;
    }

}
