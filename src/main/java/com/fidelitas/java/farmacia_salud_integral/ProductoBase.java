/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.farmacia_salud_integral;

/**
 *
 * @author crisn
 */
public abstract class ProductoBase {
    
    private final int codigo;
    private String nombre;
    private double precio;
    private int cantInventario;

    public ProductoBase(int codigo, String nombre, double precio, int cantInventario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantInventario = cantInventario;
    }

    public int getCantInventario() {
        return cantInventario;
    }

    public void setCantInventario(int cantInventario) {
        this.cantInventario = cantInventario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public abstract double PrecioTotal();
    
    public String descripcion() {
        return "codigo=" + codigo 
                + ", nombre=" + nombre 
                + ", precio=" + precio 
                + ", cantInventario=" + cantInventario;
    }
    
    public final void imprimirDescripcion() {
        System.out.println("[Producto]: " + descripcion());
    }
    
    
}
