/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.unjfsc.fsi.entity;

/**
 *
 * @author ander
 */
public class CEFamilia {
 
    private String codiFami;
    private String nombFami;

    public CEFamilia() {
    }

    public CEFamilia(String codiFami, String nombFami) {
        this.codiFami = codiFami;
        this.nombFami = nombFami;
    }

    public String getCodiFami() {
        return codiFami;
    }

    public void setCodiFami(String codiFami) {
        this.codiFami = codiFami;
    }

    public String getNombFami() {
        return nombFami;
    }

    public void setNombFami(String nombFami) {
        this.nombFami = nombFami;
    }

    @Override
    public String toString() {
        return "CEFamilia{" + "codiFami=" + codiFami + ", nombFami=" + nombFami + '}';
    }
    
}
