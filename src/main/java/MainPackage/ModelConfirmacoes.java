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
public class ModelConfirmacoes implements java.io.Serializable {

    private String answ;
    private String ident;

    ModelConfirmacoes(String answ, String ident) {

        this.answ = answ;
        this.ident = ident;

    }

    ModelConfirmacoes() {

    }

    public String getAnsw() {
        return this.answ;
    }

    public void setAnsw(String answ) {
        this.answ = answ;
    }

    public String getIdent() {
        return this.ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

}
