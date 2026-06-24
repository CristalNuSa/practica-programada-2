/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.farmacia_salud_integral;

/**
 *
 * @author crisn
 */
public class CarritoCompra {
    private final int codigo;
    private String nombre;
    private double precio;
    private int cantInventario;

    public CarritoCompra(int codigo, String nombre, double precio, int cantInventario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantInventario = cantInventario;
    }

    public int getCantInventario() {
        return cantInventario;
    }

    public void setCantInventario(int cantInventario) {
        if (cantInventario == 0 || cantInventario < 0) {
            System.out.println("La cantidad de producto no puede estar vacío ni ser negativo");
        } else {
            this.cantInventario = cantInventario;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null) {
            System.out.println("El nombre del producto no puede estar vacío");
        } else {
            this.nombre = nombre;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio == 0 || precio < 0) {
            System.out.println("El preco del producto no puede estar vacío ni ser negativo");
        } else {
            this.precio = precio;
        }
    }

    @Override
    public String toString() {
        return "Producto{ " + " Codigo = " + codigo 
                + ", Nombre=" + nombre 
                + ", Precio=" + precio 
                + ", Cantidad en el Inventario = " + cantInventario + '}';
    }
    
}
