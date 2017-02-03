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
public class MayBach extends Carro {
    private int LlantasRepuesto;

    public MayBach() {
        super();
    }

    public MayBach(int LlantasRepuesto, String noSerie, Date FechaEnsamblado, java.awt.Color Color, String MarcaDeLlantas, String Polarizado, float VelocidadMax, float KMxGalon, float Precio) {
        super(noSerie, FechaEnsamblado, Color, MarcaDeLlantas, Polarizado, VelocidadMax, KMxGalon, Precio);
        this.LlantasRepuesto = LlantasRepuesto;
    }

    public int getLlantasRepuesto() {
        return LlantasRepuesto;
    }

    public void setLlantasRepuesto(int LlantasRepuesto) {
        if (LlantasRepuesto==1||LlantasRepuesto==2) {
            this.LlantasRepuesto=LlantasRepuesto;
        } else {
            JOptionPane.showMessageDialog(null, "No es válido");
        }
    }

    @Override
    public String toString() {
        return super.toString()+"MayBach{" + "LlantasRepuesto=" + LlantasRepuesto + '}';
    }

    
    
    
    
}
