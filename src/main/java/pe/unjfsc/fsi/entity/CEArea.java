/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.unjfsc.fsi.entity;

/**
 *
 * @author ander
 */
public class CEArea {
    
    private String codiArea;
    private String nombArea;

    public CEArea() {
    }

    public CEArea(String codiArea, String nombArea) {
        this.codiArea = codiArea;
        this.nombArea = nombArea;
    }

    public String getCodiArea() {
        return codiArea;
    }

    public void setCodiArea(String codiArea) {
        this.codiArea = codiArea;
    }

    public String getNombArea() {
        return nombArea;
    }

    public void setNombArea(String nombArea) {
        this.nombArea = nombArea;
    }

    @Override
    public String toString() {
        return "CEArea{" + "codiArea=" + codiArea + ", nombArea=" + nombArea + '}';
    }
    
}
