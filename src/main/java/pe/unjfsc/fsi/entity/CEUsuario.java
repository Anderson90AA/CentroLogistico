/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.unjfsc.fsi.entity;

/**
 *
 * @author ander
 */
public class CEUsuario {
    
    private String codiUsuario;
    private String nombUsuario;

    public CEUsuario() {
    }

    public CEUsuario(String codiUsuario, String nombUsuario) {
        this.codiUsuario = codiUsuario;
        this.nombUsuario = nombUsuario;
    }

    public String getCodiUsuario() {
        return codiUsuario;
    }

    public void setCodiUsuario(String codiUsuario) {
        this.codiUsuario = codiUsuario;
    }

    public String getNombUsuario() {
        return nombUsuario;
    }

    public void setNombUsuario(String nombUsuario) {
        this.nombUsuario = nombUsuario;
    }

    @Override
    public String toString() {
        return "CEUsuario{" + "codiUsuario=" + codiUsuario + ", nombUsuario=" + nombUsuario + '}';
    }
    
    
}
