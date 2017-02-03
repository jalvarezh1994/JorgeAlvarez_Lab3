/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgealvarezlab3;

/**
 *
 * @author ofici
 */
public class MorganAero8 extends Carro {

    private String Convertible;
    private String Cabina;

    public MorganAero8(String Convertible, String Cabina) {
        this.Convertible = Convertible;
        this.Cabina = Cabina;
    }

    public String getConvertible() {
        return Convertible;
    }

    public void setConvertible(String Convertible) {
        this.Convertible = Convertible;
    }

    public String getCabina() {
        return Cabina;
    }

    public void setCabina(String Cabina) {
        this.Cabina = Cabina;
    }

    @Override
    public String toString() {
        return super.toString() + "MorganAero8{" + "Convertible=" + Convertible + ", Cabina=" + Cabina + '}';
    }

}
