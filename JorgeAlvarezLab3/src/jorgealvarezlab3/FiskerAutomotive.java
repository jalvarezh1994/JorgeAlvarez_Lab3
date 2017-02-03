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
        if (CamionetaOTurismo.equalsIgnoreCase("camioneta")||CamionetaOTurismo.equalsIgnoreCase("turismo")) {
            
        } else {
        }
        this.CamionetaOTurismo = CamionetaOTurismo;
    }

    public String getConvertible() {
        return Convertible;
    }

    public void setConvertible(String Convertible) {
        this.Convertible = Convertible;
    }

        @Override
    public void setVelocidadMax(float VelocidadMax) {
        if (VelocidadMax > 155 && VelocidadMax < 160) {
            this.VelocidadMax = VelocidadMax;
        } else {
            JOptionPane.showMessageDialog(null, "No es válido");
        }

    }

    @Override
    public void setKMxGalon(float KMxGalon) {
        if (KMxGalon > 50 && KMxGalon < 55) {
            this.KMxGalon = KMxGalon;
        } else {
            JOptionPane.showMessageDialog(null, "No es válido");
        }

    }

    @Override
    public void setPrecio(float Precio) {
        if (Precio > 400000 && Precio < 600000) {
            this.Precio = Precio;
        } else {
            JOptionPane.showMessageDialog(null, "No es válido");
        }
    }

    @Override
    public String toString() {
        return super.toString()+"FiskerAutomotive{" + "CamionetaOTurismo=" + CamionetaOTurismo + ", Convertible=" + Convertible + '}';
    }
    
    
}
