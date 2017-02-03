/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgealvarezlab3;

import java.util.ArrayList;

/**
 *
 * @author ofici
 */
public class Cliente extends Persona {

    private float Dinero;
    private ArrayList<Carro> Carros = new ArrayList();

    public Cliente() {
        super();
    }

    public Cliente(float Dinero, String Nombre, String ID, int Edad, float Altura, float Peso) {
        super(Nombre, ID, Edad, Altura, Peso);
        this.Dinero = Dinero;
    }

    public float getDinero() {
        return Dinero;
    }

    public void setDinero(float Dinero) {
        this.Dinero = Dinero;
    }

    public ArrayList<Carro> getCarros() {
        return Carros;
    }

    public void setCarros(ArrayList<Carro> Carros) {
        this.Carros = Carros;
    }
    
    public void addCarro(Carro car){
        Carros.add(car);
    }

    @Override
    public String toString() {
        return super.toString()+"Cliente{" + "Dinero=" + Dinero + ", Carros=" + Carros + '}';
    }

    
}
