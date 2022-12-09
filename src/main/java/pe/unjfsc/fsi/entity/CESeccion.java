/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.unjfsc.fsi.entity;

/**
 *
 * @author ander
 */
public class CESeccion {
    
    private String codiSecc;
    private String nombSecc;

    public CESeccion() {
    }

    public CESeccion(String codiSecc, String nombSecc) {
        this.codiSecc = codiSecc;
        this.nombSecc = nombSecc;
    }

    public String getCodiSecc() {
        return codiSecc;
    }

    public void setCodiSecc(String codiSecc) {
        this.codiSecc = codiSecc;
    }

    public String getNombSecc() {
        return nombSecc;
    }

    public void setNombSecc(String nombSecc) {
        this.nombSecc = nombSecc;
    }

    @Override
    public String toString() {
        return "CESeccion{" + "codiSecc=" + codiSecc + ", nombSecc=" + nombSecc + '}';
    }
    
}
