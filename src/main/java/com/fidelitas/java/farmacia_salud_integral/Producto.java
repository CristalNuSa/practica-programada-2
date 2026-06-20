/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.farmacia_salud_integral;

/**
 *
 * @author crisn
 */
public class Producto extends ProductoBase {

    double impuestos = 0.13;

    public Producto(int codigo, String nombre, double precio, int cantInventario) {
        super(codigo, nombre, precio, cantInventario);
        this.impuestos = impuestos;
    }
    
    @Override
    public double PrecioTotal() {
        double total = getPrecio() * getCantInventario();
        double calculo = total * impuestos;        
        return total + calculo;
    }

        

}
