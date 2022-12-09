/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.unjfsc.fsi.entity;

/**
 *
 * @author ander
 */
public class CECargo {
    
    private String codiCargo;
    private String nombCargo;

    public CECargo() {
    }

    public CECargo(String codiCargo, String nombCargo) {
        this.codiCargo = codiCargo;
        this.nombCargo = nombCargo;
    }

    public String getCodiCargo() {
        return codiCargo;
    }

    public void setCodiCargo(String codiCargo) {
        this.codiCargo = codiCargo;
    }

    public String getNombCargo() {
        return nombCargo;
    }

    public void setNombCargo(String nombCargo) {
        this.nombCargo = nombCargo;
    }

    @Override
    public String toString() {
        return "CECargo{" + "codiCargo=" + codiCargo + ", nombCargo=" + nombCargo + '}';
    }
    
    
    
}
