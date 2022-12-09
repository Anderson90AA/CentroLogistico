/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.unjfsc.fsi.entity;

/**
 *
 * @author ander
 */
public class CELogin {
    private String usurio;
    private String password;

    public CELogin() {
    }

    public CELogin(String usurio, String password) {
        this.usurio = usurio;
        this.password = password;
    }

    public String getUsurio() {
        return usurio;
    }

    public void setUsurio(String usurio) {
        this.usurio = usurio;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "CELogin{" + "usurio=" + usurio + ", password=" + password + '}';
    }
    
    
}
