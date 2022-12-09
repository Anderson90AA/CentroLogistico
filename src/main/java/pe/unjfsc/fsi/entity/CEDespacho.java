/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.unjfsc.fsi.entity;

/**
 *
 * @author ander
 */
public class CEDespacho {
    
    private String codDesp;
    private String docApro;
    private String cdSumi;
    private String metoDist;
    private int Cantidad;
    private String comprador;
    private String fechDisp;
    private String fechEntr;
    private String codiProv;

    public CEDespacho() {
    }

    public CEDespacho(String codDesp, String docApro, String cdSumi, String metoDist, int Cantidad, String comprador, String fechDisp, String fechEntr, String codiProv) {
        this.codDesp = codDesp;
        this.docApro = docApro;
        this.cdSumi = cdSumi;
        this.metoDist = metoDist;
        this.Cantidad = Cantidad;
        this.comprador = comprador;
        this.fechDisp = fechDisp;
        this.fechEntr = fechEntr;
        this.codiProv = codiProv;
    }

    public String getCodDesp() {
        return codDesp;
    }

    public void setCodDesp(String codDesp) {
        this.codDesp = codDesp;
    }

    public String getDocApro() {
        return docApro;
    }

    public void setDocApro(String docApro) {
        this.docApro = docApro;
    }

    public String getCdSumi() {
        return cdSumi;
    }

    public void setCdSumi(String cdSumi) {
        this.cdSumi = cdSumi;
    }

    public String getMetoDist() {
        return metoDist;
    }

    public void setMetoDist(String metoDist) {
        this.metoDist = metoDist;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public String getFechDisp() {
        return fechDisp;
    }

    public void setFechDisp(String fechDisp) {
        this.fechDisp = fechDisp;
    }

    public String getFechEntr() {
        return fechEntr;
    }

    public void setFechEntr(String fechEntr) {
        this.fechEntr = fechEntr;
    }

    public String getCodiProv() {
        return codiProv;
    }

    public void setCodiProv(String codiProv) {
        this.codiProv = codiProv;
    }

    @Override
    public String toString() {
        return "CEDespacho{" + "codDesp=" + codDesp + ", docApro=" + docApro + ", cdSumi=" + cdSumi + ", metoDist=" + metoDist + ", Cantidad=" + Cantidad + ", comprador=" + comprador + ", fechDisp=" + fechDisp + ", fechEntr=" + fechEntr + ", codiProv=" + codiProv + '}';
    }
    
    

}
