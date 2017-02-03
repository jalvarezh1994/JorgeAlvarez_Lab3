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
public class FiskerAutomotive extends Carro{
    private String CamionetaOTurismo;
    private String Convertible;

    public FiskerAutomotive() {
        super();
    }
    
    public FiskerAutomotive(String CamionetaOTurismo, String Convertible, String noSerie, Date FechaEnsamblado, java.awt.Color Color, String MarcaDeLlantas, String Polarizado, float VelocidadMax, float KMxGalon, float Precio) {
        super(noSerie, FechaEnsamblado, Color, MarcaDeLlantas, Polarizado, VelocidadMax, KMxGalon, Precio);
        this.CamionetaOTurismo = CamionetaOTurismo;
        this.Convertible = Convertible;
    }

    public String getCamionetaOTurismo() {
        return CamionetaOTurismo;
    }

    public void setCamionetaOTurismo(String CamionetaOTurismo) {
        this.CamionetaOTurismo = CamionetaOTurismo;
    }

    public String getConvertible() {
        return Convertible;
    }

    public void setConvertible(String Convertible) {
        this.Convertible = Convertible;
    }

    
    @Override
    public String toString() {
        return super.toString()+"FiskerAutomotive{" + "CamionetaOTurismo=" + CamionetaOTurismo + ", Convertible=" + Convertible + '}';
    }
    
    
}
