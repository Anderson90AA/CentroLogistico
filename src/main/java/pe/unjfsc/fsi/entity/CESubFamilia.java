/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.unjfsc.fsi.entity;

/**
 *
 * @author ander
 */
public class CESubFamilia {
    
    private String codiSubFami;
    private String nombFami;

    public CESubFamilia() {
    }

    public CESubFamilia(String codiSubFami, String nombFami) {
        this.codiSubFami = codiSubFami;
        this.nombFami = nombFami;
    }

    public String getCodiSubFami() {
        return codiSubFami;
    }

    public void setCodiSubFami(String codiSubFami) {
        this.codiSubFami = codiSubFami;
    }

    public String getNombFami() {
        return nombFami;
    }

    public void setNombFami(String nombFami) {
        this.nombFami = nombFami;
    }

    @Override
    public String toString() {
        return "CESubFamilia{" + "codiSubFami=" + codiSubFami + ", nombFami=" + nombFami + '}';
    }
  
}
