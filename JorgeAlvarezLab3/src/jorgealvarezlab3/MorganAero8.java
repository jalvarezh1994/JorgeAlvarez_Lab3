/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgealvarezlab3;

import javax.swing.JOptionPane;

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
        if (Convertible.equalsIgnoreCase("convertible") || Convertible.equalsIgnoreCase("sencillo")) {
            this.Convertible = Convertible;
        } else {
            JOptionPane.showMessageDialog(null, "No es válido");
        }
    }

    public String getCabina() {
        return Cabina;
    }

    public void setCabina(String Cabina) {
        if (Cabina.equalsIgnoreCase("unica") || Cabina.equalsIgnoreCase("doble")) {
            this.Cabina = Cabina;
        } else {
            JOptionPane.showMessageDialog(null, "No es válido");
        }
    }

        @Override
    public void setVelocidadMax(float VelocidadMax) {
        if (VelocidadMax > 140 && VelocidadMax < 145) {
            this.VelocidadMax = VelocidadMax;
        } else {
            JOptionPane.showMessageDialog(null, "No es válido");
        }

    }

    @Override
    public void setKMxGalon(float KMxGalon) {
        if (KMxGalon > 35 && KMxGalon < 40) {
            this.KMxGalon = KMxGalon;
        } else {
            JOptionPane.showMessageDialog(null, "No es válido");
        }

    }

    @Override
    public void setPrecio(float Precio) {
        if (Precio > 500000 && Precio < 700000) {
            this.Precio = Precio;
        } else {
            JOptionPane.showMessageDialog(null, "No es válido");
        }
    }

    
    @Override
    public String toString() {
        return super.toString() + "MorganAero8{" + "Convertible=" + Convertible + ", Cabina=" + Cabina + '}';
    }

}
