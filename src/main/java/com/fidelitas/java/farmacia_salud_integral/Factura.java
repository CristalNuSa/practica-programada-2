/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.farmacia_salud_integral;

/**
 *
 * @author crisn
 */
import java.util.ArrayList;

public class Factura {
    
    public void generarRecibo(ArrayList<CarritoCompra> carrito) {
        
        if (carrito.isEmpty()) {
            System.out.println("No hay productos en el carrito.");
        } else {
            double total = 0;
            
            System.out.println("\n===== RECIBO DE COMPRA =====");
            
            for (CarritoCompra c : carrito) {
                double subtotal = c.getPrecio() * c.getCantInventario();
                
                System.out.println("Codigo: " + c.getCodigo());
                System.out.println("Nombre: " + c.getNombre());
                System.out.println("Precio unitario: " + c.getPrecio());
                System.out.println("Cantidad: " + c.getCantInventario());
                System.out.println("Subtotal: " + subtotal);
                System.out.println("--------------------------------");
                
                total = total + subtotal;
            }
            
            System.out.println("TOTAL A PAGAR: " + total);
        }
    }
}