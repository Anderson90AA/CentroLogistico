/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.unjfsc.fsi.entity;

/**
 *
 * @author ander
 */
public class CEProveedor {
    
    private String codiProv;
    private String nombProv;
    private String direccion;
    private String rut;
    private String telefono;

        public CEProveedor() {
        }

        public CEProveedor(String codiProv, String nombProv, String direccion, String rut, String telefono) {
            this.codiProv = codiProv;
            this.nombProv = nombProv;
            this.direccion = direccion;
            this.rut = rut;
            this.telefono = telefono;
        }

    public String getCodiProv() {
        return codiProv;
    }

    public void setCodiProv(String codiProv) {
        this.codiProv = codiProv;
    }

    public String getNombProv() {
        return nombProv;
    }

    public void setNombProv(String nombProv) {
        this.nombProv = nombProv;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "CEProveedor{" + "codiProv=" + codiProv + ", nombProv=" + nombProv + ", direccion=" + direccion + ", rut=" + rut + ", telefono=" + telefono + '}';
    }
    
}
