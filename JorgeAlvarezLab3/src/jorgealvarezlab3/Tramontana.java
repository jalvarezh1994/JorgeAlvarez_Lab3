/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgealvarezlab3;

import java.util.Date;

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
        this.Peso = Peso;
    }

    public int getTransmision() {
        return Transmision;
    }

    public void setTransmision(int Transmision) {
        this.Transmision = Transmision;
    }

    @Override
    public String toString() {
        return super.toString() + "Tramontana{" + "Peso=" + Peso + ", Transmision=" + Transmision + '}';
    }

}
