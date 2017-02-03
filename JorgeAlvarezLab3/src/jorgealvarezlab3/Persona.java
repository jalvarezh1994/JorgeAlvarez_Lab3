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
public class Persona {
    private String Nombre,ID;
    private int Edad;
    private float Altura,Peso;

    public Persona() {
    }

    public Persona(String Nombre, String ID, int Edad, float Altura, float Peso) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Edad = Edad;
        this.Altura = Altura;
        this.Peso = Peso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", ID=" + ID + ", Edad=" + Edad + ", Altura=" + Altura + ", Peso=" + Peso + '}';
    }
    
    
    
}
