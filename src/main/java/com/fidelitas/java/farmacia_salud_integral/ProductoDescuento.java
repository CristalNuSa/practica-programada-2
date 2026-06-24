/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.farmacia_salud_integral;

/**
 *
 * @author crisn
 */
public class ProductoDescuento extends ProductoBase{
    
    double impuestos = 0.13;
    double descuento = 0.40;
    
    public ProductoDescuento(int codigo, String nombre, double precio, int cantInventario) {
        super(codigo, nombre, precio, cantInventario);
    }

    @Override
    public double PrecioTotal() {
        double total = getPrecio() * getCantInventario();
        double calculo = total * impuestos; 
        double resta = total * descuento;
        return (total - resta) + calculo;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", impuestos = $" + impuestos + ", descuento = $" + descuento;
    }
    
    
    
    
}
