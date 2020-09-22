/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.sql.Timestamp;

/**
 *
 * @author marcelo
 */
public class ModelItem implements java.io.Serializable {

    private String nomeItem;
    private Timestamp data;
    private String fornecedor;
    private Double valor;
    private String uuid;

    ModelItem(String nomeItem, Timestamp data, String fornecedor, Double valor, String uuid) {
        this.nomeItem = nomeItem;
        this.data = data;
        this.fornecedor = fornecedor;
        this.valor = valor;
        this.uuid = uuid;

    }

    ModelItem() {

    }

    public String getNomeItem() {
        return this.nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public Timestamp getData() {
        return this.data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    public String getFornecedor() {
        return this.fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
