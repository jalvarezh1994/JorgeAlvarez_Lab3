/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgealvarezlab3;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author ofici
 */
public class Carro {
    protected Date FechaEnsamblado;
    protected Color Color;
    protected String MarcaDeLlantas,noSerie;
    protected String Polarizado;
    protected float VelocidadMax,KMxGalon,Precio;

    public Carro() {
    }

    public Carro(String noSerie, Date FechaEnsamblado, Color Color, String MarcaDeLlantas, String Polarizado, float VelocidadMax, float KMxGalon, float Precio) {
        this.noSerie = noSerie;
        this.FechaEnsamblado = FechaEnsamblado;
        this.Color = Color;
        this.MarcaDeLlantas = MarcaDeLlantas;
        this.Polarizado = Polarizado;
        this.VelocidadMax = VelocidadMax;
        this.KMxGalon = KMxGalon;
        this.Precio = Precio;
    }

    public String getNoSerie() {
        return noSerie;
    }

    public void setNoSerie(String noSerie) {
        this.noSerie = noSerie;
    }

    public Date getFechaEnsamblado() {
        return FechaEnsamblado;
    }

    public void setFechaEnsamblado(Date FechaEnsamblado) {
        this.FechaEnsamblado = FechaEnsamblado;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public String getMarcaDeLlantas() {
        return MarcaDeLlantas;
    }

    public void setMarcaDeLlantas(String MarcaDeLlantas) {
        this.MarcaDeLlantas = MarcaDeLlantas;
    }

    public String getPolarizado() {
        return Polarizado;
    }

    public void setPolarizado(String Polarizado) {
        this.Polarizado = Polarizado;
    }

    public float getVelocidadMax() {
        return VelocidadMax;
    }

    public void setVelocidadMax(float VelocidadMax) {
        this.VelocidadMax = VelocidadMax;
    }

    public float getKMxGalon() {
        return KMxGalon;
    }

    public void setKMxGalon(float KMxGalon) {
        this.KMxGalon = KMxGalon;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Carro{" + "noSerie=" + noSerie + ", FechaEnsamblado=" + FechaEnsamblado + ", Color=" + Color + ", MarcaDeLlantas=" + MarcaDeLlantas + ", Polarizado=" + Polarizado + ", VelocidadMax=" + VelocidadMax + ", KMxGalon=" + KMxGalon + ", Precio=" + Precio + '}';
    }
    
    
    
}
