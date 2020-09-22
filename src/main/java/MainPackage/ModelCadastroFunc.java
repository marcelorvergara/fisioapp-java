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
public class ModelCadastroFunc implements java.io.Serializable {

    private String nomeFunc;
    private String crefito;
    private String phone;
    private String proc1;
    private String proc2;
    private String proc3;
    private String calendarId;
    private String login;
    private String perfil;
    private String token;
    private boolean flag;

    public ModelCadastroFunc(String nomeFunc,
            String crefito,
            String phone,
            String proc1,
            String proc2,
            String proc3,
            String calendarId,
            String login,
            String perfil,
            String token,
            boolean flag) {
        this.nomeFunc = nomeFunc;
        this.crefito = crefito;
        this.phone = phone;
        this.proc1 = proc1;
        this.proc2 = proc2;
        this.proc3 = proc3;
        this.calendarId = calendarId;
        this.login = login;
        this.perfil = perfil;
        this.token = token;
        this.flag = flag;
    }

    ModelCadastroFunc() {

    }

    public String getNomeFunc() {
        return this.nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getCrefito() {
        return this.crefito;
    }

    public void setCrefito(String crefito) {
        this.crefito = crefito;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProc1() {
        return this.proc1;
    }

    public void setProc1(String proc1) {
        this.proc1 = proc1;
    }

    public String getProc2() {
        return this.proc2;
    }

    public void setProc2(String proc2) {
        this.proc2 = proc2;
    }

    public String getProc3() {
        return this.proc3;
    }

    public void setProc3(String proc3) {
        this.proc3 = proc3;
    }

    public String getCalendarId() {
        return this.calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPerfil() {
        return this.perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean getFlag() {
        return this.flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
