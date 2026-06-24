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
        if (cantInventario < 0) {
            System.out.println("La cantidad del producto no puede estar vacío ni ser negativo");
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
            System.out.println("El Nombre no puede estar vacío.");
        } else {
            this.nombre = nombre;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio == 0 || precio < 0) {
            System.out.println("El Precio del producto no puede estar vacío ni ser negativo.");
        } else {
            this.precio = precio;
        }
    }

    public abstract double PrecioTotal();

    public String descripcion() {
        return "codigo = " + codigo + "\n"
                + "Nombre = " + nombre + "\n"
                + "Precio = " + precio + "\n"
                + "CantInventario = " + cantInventario;
    }

    public final void imprimirDescripcion() {
        System.out.println("[Producto]: " + descripcion());
    }
}
