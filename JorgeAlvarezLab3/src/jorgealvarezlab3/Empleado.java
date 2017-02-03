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
public class Empleado extends Persona {
    private float HorasLaborales;
    private Cliente Client;

    public Empleado() {
        super();
    }

    public Empleado(float HorasLaborales, Cliente Client, String Nombre, String ID, int Edad, float Altura, float Peso) {
        super(Nombre, ID, Edad, Altura, Peso);
        this.HorasLaborales = HorasLaborales;
        this.Client = Client;
    }

    public float getHorasLaborales() {
        return HorasLaborales;
    }

    public void setHorasLaborales(float HorasLaborales) {
        this.HorasLaborales = HorasLaborales;
    }

    public Cliente getClient() {
        return Client;
    }

    public void setClient(Cliente Client) {
        this.Client = Client;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Empleado{" + "HorasLaborales=" + HorasLaborales + ", Client=" + Client + '}';
    }
    
    
    
    
}
