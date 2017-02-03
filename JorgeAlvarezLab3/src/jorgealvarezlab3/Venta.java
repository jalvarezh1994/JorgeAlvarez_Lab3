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
public class Venta {
    private Carro Carro;
    private Empleado Empleado;
    private Cliente Cliente;
    private float Precio;
    private Date Fecha;

    public Venta(Carro Carro, Empleado Empleado, Cliente Cliente, float Precio, Date Fecha) {
        this.Carro = Carro;
        this.Empleado = Empleado;
        this.Cliente = Cliente;
        this.Precio = Precio;
        this.Fecha = Fecha;
    }

    @Override
    public String toString() {
        return "Venta{" + "Carro=" + Carro + ", Empleado=" + Empleado + ", Cliente=" + Cliente + ", Precio=" + Precio + ", Fecha=" + Fecha + '}';
    }
    
    
}
