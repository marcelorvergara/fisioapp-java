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
public class ModelFornecedor implements java.io.Serializable {

    private String nomeFor;
    private String idFor;
    private String idTipo;
    private String codFor;

    public ModelFornecedor(String nomeFor, String idFor, String idTipo, String codFor) {
        this.nomeFor = nomeFor;
        this.idFor = idFor;
        this.idTipo = idTipo;
        this.codFor = codFor;
    }

    ModelFornecedor() {

    }

    public String getNomeFor() {
        return this.nomeFor;
    }

    public void setNomeFor(String nomeFor) {
        this.nomeFor = nomeFor;
    }

    public String getIdFor() {
        return this.idFor;
    }

    public void setIdFor(String idFor) {
        this.idFor = idFor;
    }

    public String getTipoFor() {
        return this.idTipo;
    }

    public void setTipoFor(String idTipo) {
        this.idTipo = idTipo;
    }

    public String getCodFor() {
        return this.codFor;
    }

    public void setCodFor(String codFor) {
        this.codFor = codFor;
    }
}
