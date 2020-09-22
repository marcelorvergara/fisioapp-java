/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author marcelo
 */
public class ModelAgendaPaciente implements java.io.Serializable {

    private String nome;
    private String cpf;
    ArrayList<HashMap<String, Timestamp>> sessoes;
    private String responsavel;
    private String ts;
    private String phone;

    public ModelAgendaPaciente() {
    }

    public ModelAgendaPaciente(String nome,
            String cpf, ArrayList<HashMap<String, Timestamp>> sessoes,
            String responsavel,
            String ts,
            String phone) {

        this.nome = nome;
        this.cpf = cpf;
        this.sessoes = sessoes;
        this.responsavel = responsavel;
        this.ts = ts;
        this.phone = phone;

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

    public ArrayList<HashMap<String, Timestamp>> getSessoes() {
        return this.sessoes;
    }

    public void setSessoes(ArrayList<HashMap<String, Timestamp>> sessoes) {
        this.sessoes = sessoes;
    }

    public String getResponsavel() {
        return this.responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getTsDtAgendamento() {
        return this.ts;
    }

    public void setTsDtAgendamento(String ts) {
        this.ts = ts;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
