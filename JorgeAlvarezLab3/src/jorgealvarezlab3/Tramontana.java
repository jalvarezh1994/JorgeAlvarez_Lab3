/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgealvarezlab3;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ofici
 */
public class Tramontana extends Carro {

    private float Peso;
    private int Transmision;

    public Tramontana() {
        super();
    }

    public Tramontana(float Peso, int Transmision, String noSerie, Date FechaEnsamblado, java.awt.Color Color, String MarcaDeLlantas, String Polarizado, float VelocidadMax, float KMxGalon, float Precio) {
        super(noSerie, FechaEnsamblado, Color, MarcaDeLlantas, Polarizado, VelocidadMax, KMxGalon, Precio);
        this.Peso = Peso;
        this.Transmision = Transmision;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        if (Peso >= 1276 && Peso <= 1376) {
            this.Peso = Peso;
        } else {
            JOptionPane.showMessageDialog(null, "No es válido");
        }
    }

    public int getTransmision() {
        return Transmision;
    }

    public void setTransmision(int Transmision) {
        if (Transmision == 6 || Transmision == 7) {
            this.Transmision = Transmision;
        } else {
            JOptionPane.showMessageDialog(null, "No es válido");
        }
    }

    @Override
    public void setVelocidadMax(float VelocidadMax) {
            if (VelocidadMax >= 175 && VelocidadMax <= 180) {
            this.VelocidadMax = VelocidadMax;
        } else {
            JOptionPane.showMessageDialog(null, "No es válido");
        }

    }

    @Override
    public void setKMxGalon(float KMxGalon) {
        if (KMxGalon >= 50 && KMxGalon <= 55) {
            this.KMxGalon = KMxGalon;
        } else {
            JOptionPane.showMessageDialog(null, "No es válido");
        }

    }

    @Override
    public void setPrecio(float Precio) {
        if (Precio >= 800000 && Precio <= 1000000) {
            this.Precio = Precio;
        } else {
            JOptionPane.showMessageDialog(null, "No es válido");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Tramontana{" + "Peso=" + Peso + ", Transmision=" + Transmision + '}';
    }

}
