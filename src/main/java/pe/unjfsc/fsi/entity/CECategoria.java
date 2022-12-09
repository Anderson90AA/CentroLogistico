/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.unjfsc.fsi.entity;

/**
 *
 * @author ander
 */
public class CECategoria {
    
    private String codiCate;
    private String nombCate;

    public CECategoria() {
    }
    
    public CECategoria(String codiCate, String nombCate) {
        this.codiCate = codiCate;
        this.nombCate = nombCate;
    }

    public String getCodiCate() {
        return codiCate;
    }

    public void setCodiCate(String codiCate) {
        this.codiCate = codiCate;
    }

    public String getNombCate() {
        return nombCate;
    }

    public void setNombCate(String nombCate) {
        this.nombCate = nombCate;
    }

    @Override
    public String toString() {
        return "CECategoria{" + "codiCate=" + codiCate + ", nombCate=" + nombCate + '}';
    } 
    
}
