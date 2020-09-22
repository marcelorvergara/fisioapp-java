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
public class ModelPaciente implements java.io.Serializable {

    private String id;
    private String nome;
    private String idade;
    private String sexo;
    private String estadoCivil;
    private String peso;
    private String altura;
    private String profissao;
    private String endereco;
    private String dataAvaliacao;
    private String telefone;
    private String cpf;
    private String queixaPrin;
    private String histDoePrin;
    private String apLocomotor;
    private String apCardioResp;
    private String apVascular;
    private String apGinec;
    private String apOutros;
    private String histFamiliar;
    private String sinaisVitais;
    private String diagCli;
    private String email;
    private String whatsapp;
    private String convenio;
    private String convenioNum;
    private String appPass;

    public ModelPaciente() {
    }

    public ModelPaciente(String id, String nome, String idade, String sexo,
            String estadoCivil, String peso, String altura,
            String profissao, String endereco, String dataAvaliacao,
            String telefone, String cpf, String queixaPrin, String histDoePrin,
            String apLocomotor, String apCardioResp, String apVascular,
            String apGinec, String apOutros, String histFamiliar,
            String sinaisVitais, String diagCli, String email, String whatsapp,
            String convenio, String convenioNum, String appPass) {

        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.peso = peso;
        this.altura = altura;
        this.profissao = profissao;
        this.endereco = endereco;
        this.dataAvaliacao = dataAvaliacao;
        this.telefone = telefone;
        this.cpf = cpf;
        this.queixaPrin = queixaPrin;
        this.histDoePrin = histDoePrin;
        this.apLocomotor = apLocomotor;
        this.apCardioResp = apCardioResp;
        this.apVascular = apVascular;
        this.apGinec = apGinec;
        this.apOutros = apOutros;
        this.histFamiliar = histFamiliar;
        this.sinaisVitais = sinaisVitais;
        this.diagCli = diagCli;
        this.email = email;
        this.whatsapp = whatsapp;
        this.convenio = convenio;
        this.convenioNum = convenioNum;
        this.appPass = appPass;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getnome() {
        return this.nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getidade() {
        return this.idade;
    }

    public void setidade(String idade) {
        this.idade = idade;
    }

    public String getsexo() {
        return this.sexo;
    }

    public void setsexo(String sexo) {
        this.sexo = sexo;
    }

    public String getestadoCivil() {
        return this.estadoCivil;
    }

    public void setestadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getpeso() {
        return this.peso;
    }

    public void setpeso(String peso) {
        this.peso = peso;
    }

    public String getaltura() {
        return this.altura;
    }

    public void setaltura(String altura) {
        this.altura = altura;
    }

    public String getprofissao() {
        return this.profissao;
    }

    public void setprofissao(String profissao) {
        this.profissao = profissao;
    }

    public String getendereco() {
        return this.endereco;
    }

    public void setendereco(String endereco) {
        this.endereco = endereco;
    }

    public String getdataAvaliacao() {
        return this.dataAvaliacao;
    }

    public void setdataAvaliacao(String dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }

    public String gettelefone() {
        return this.telefone;
    }

    public void settelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getcpf() {
        return this.cpf;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    public String getqueixaPrin() {
        return this.queixaPrin;
    }

    public void setqueixaPrin(String queixaPrin) {
        this.queixaPrin = queixaPrin;
    }

    public String gethistDoePrin() {
        return this.histDoePrin;
    }

    public void sethistDoePrin(String histDoePrin) {
        this.histDoePrin = histDoePrin;
    }

    public String getapLocomotor() {
        return this.apLocomotor;
    }

    public void setapLocomotor(String apLocomotor) {
        this.apLocomotor = apLocomotor;
    }

    public String getapCardioResp() {
        return this.apCardioResp;
    }

    public void setapCardioResp(String apCardioResp) {
        this.apCardioResp = apCardioResp;
    }

    public String getapVascular() {
        return this.apVascular;
    }

    public void setapVascular(String apVascular) {
        this.apVascular = apVascular;
    }

    public String getapGinec() {
        return this.apGinec;
    }

    public void setapGinec(String apGinec) {
        this.apGinec = apGinec;
    }

    public String getapOutros() {
        return this.apOutros;
    }

    public void setapOutros(String apOutros) {
        this.apOutros = apOutros;
    }

    public String gethistFamiliar() {
        return this.histFamiliar;
    }

    public void sethistFamiliar(String histFamiliar) {
        this.histFamiliar = histFamiliar;
    }

    public String getsinaisVitais() {
        return this.sinaisVitais;
    }

    public void setsinaisVitais(String sinaisVitais) {
        this.sinaisVitais = sinaisVitais;
    }

    public String getdiagCli() {
        return this.diagCli;
    }

    public void setdiagCli(String diagCli) {
        this.diagCli = diagCli;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWhatsapp() {
        return this.whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getConvenio() {
        return this.convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getConvenioNum() {
        return this.convenioNum;
    }

    public void setConvenioNum(String convenioNum) {
        this.convenioNum = convenioNum;
    }

    public String getAppPass() {
        return this.appPass;
    }

    public void setAppPass(String appPass) {
        this.appPass = appPass;
    }
}
