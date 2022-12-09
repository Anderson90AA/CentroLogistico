/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.unjfsc.fsi.entity;

/**
 *
 * @author ander
 */
public class CEAlmacen {
    
    private String material;
    private String ean13;
    private String dun14;
    private String descMate;
    private String aplilabilidad;
    private String tipoMHE;
    private String sorter;
    private String fechCrea;
    private String codiProv;
    private String codiArea;
    private String codiSecc;
    private String codiCate;
    private String codiFami;
    private String codiSubFami;

    public CEAlmacen() {
    }

    public CEAlmacen(String material, String ean13, String dun14, String descMate, String aplilabilidad, String tipoMHE, String sorter, String fechCrea, String codiProv, String codiArea, String codiSecc, String codiCate, String codiFami, String codiSubFami) {
        this.material = material;
        this.ean13 = ean13;
        this.dun14 = dun14;
        this.descMate = descMate;
        this.aplilabilidad = aplilabilidad;
        this.tipoMHE = tipoMHE;
        this.sorter = sorter;
        this.fechCrea = fechCrea;
        this.codiProv = codiProv;
        this.codiArea = codiArea;
        this.codiSecc = codiSecc;
        this.codiCate = codiCate;
        this.codiFami = codiFami;
        this.codiSubFami = codiSubFami;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getEan13() {
        return ean13;
    }

    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }

    public String getDun14() {
        return dun14;
    }

    public void setDun14(String dun14) {
        this.dun14 = dun14;
    }

    public String getDescMate() {
        return descMate;
    }

    public void setDescMate(String descMate) {
        this.descMate = descMate;
    }

    public String getAplilabilidad() {
        return aplilabilidad;
    }

    public void setAplilabilidad(String aplilabilidad) {
        this.aplilabilidad = aplilabilidad;
    }

    public String getTipoMHE() {
        return tipoMHE;
    }

    public void setTipoMHE(String tipoMHE) {
        this.tipoMHE = tipoMHE;
    }

    public String getSorter() {
        return sorter;
    }

    public void setSorter(String sorter) {
        this.sorter = sorter;
    }

    public String getFechCrea() {
        return fechCrea;
    }

    public void setFechCrea(String fechCrea) {
        this.fechCrea = fechCrea;
    }

    public String getCodiProv() {
        return codiProv;
    }

    public void setCodiProv(String codiProv) {
        this.codiProv = codiProv;
    }

    public String getCodiArea() {
        return codiArea;
    }

    public void setCodiArea(String codiArea) {
        this.codiArea = codiArea;
    }

    public String getCodiSecc() {
        return codiSecc;
    }

    public void setCodiSecc(String codiSecc) {
        this.codiSecc = codiSecc;
    }

    public String getCodiCate() {
        return codiCate;
    }

    public void setCodiCate(String codiCate) {
        this.codiCate = codiCate;
    }

    public String getCodiFami() {
        return codiFami;
    }

    public void setCodiFami(String codiFami) {
        this.codiFami = codiFami;
    }

    public String getCodiSubFami() {
        return codiSubFami;
    }

    public void setCodiSubFami(String codiSubFami) {
        this.codiSubFami = codiSubFami;
    }

    @Override
    public String toString() {
        return "CEAlmacen{" + "material=" + material + ", ean13=" + ean13 + ", dun14=" + dun14 + ", descMate=" + descMate + ", aplilabilidad=" + aplilabilidad + ", tipoMHE=" + tipoMHE + ", sorter=" + sorter + ", fechCrea=" + fechCrea + ", codiProv=" + codiProv + ", codiArea=" + codiArea + ", codiSecc=" + codiSecc + ", codiCate=" + codiCate + ", codiFami=" + codiFami + ", codiSubFami=" + codiSubFami + '}';
    }
   
}
