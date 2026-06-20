/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.fidelitas.java.farmacia_salud_integral;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Practica Programada #2 Autores: Cristal Núñez, Jorhsam Mora, Stward Lezcano,
 * Diego Benavides.
 */
public class Farmacia_Salud_Integral {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<ProductoBase> productos = new ArrayList<>();

        int opcion = 0;

        do {
            try {
                System.out.println("\n===== SISTEMA DE GESTION FARMACIA SALUD INTEGRAL =====");
                System.out.println("Digite una opcion:");
                System.out.println("1. Agregar producto farmacéutico");
                System.out.println("2. Modificar producto");
                System.out.println("3. Listar productos");
                System.out.println("4. Eliminar producto");
                System.out.println("5. Agregar producto al carrito");
                System.out.println("6. Generar recibo");
                System.out.println("7. Salir");

                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("\n===== AGREGAR PRODUCTO =====");
                        System.out.println("Seleccione el tipo de Producto:");
                        System.out.println("1. Medicamentos sin descuento");
                        System.out.println("2. Medicamentos con descuento");
                        System.out.println("3. Vitaminas");
                        System.out.println("4. Productos de cuidado personal");
                        System.out.println("5. Productos de primeros auxilios.");
                        int tipo = sc.nextInt();
                        sc.nextLine();
                        

                        System.out.println("Digite el Codigo:");
                        int cod = Integer.parseInt(sc.nextLine());

                        System.out.println("Digite el nombre:");
                        String nombre = sc.nextLine();

                        System.out.println("Digite el precio:");
                        double precio = Double.parseDouble(sc.nextLine());

                        System.out.println("Digite la cantidad:");
                        int cant = sc.nextInt();

                        if (cod < 0 || cod == 0 || nombre.equals("") || precio < 0 || cant <= 0) {
                            System.out.println("No se pudo registrar. Hay datos incorrectos.");
                        break;
                        }
                        
                        switch (tipo) {
                        case 1:                                                        
                            Producto producto1 = new Producto(cod,nombre,precio,cant);
                            productos.add(producto1);

                            System.out.println("Producto registrado correctamente.");
                            break;

                        case 2:
                            ProductoDescuento producto = new ProductoDescuento(cod,nombre,precio,cant);
                            productos.add(producto);

                            System.out.println("Producto registrado correctamente.");
                            break;
                        
                        case 3:
                            Producto producto3 = new Producto(cod,nombre,precio,cant);
                            productos.add(producto3);
                            
                            System.out.println("Producto registrado correctamente.");                            
                            break;                                                       

                        case 4:
                            Producto producto4 = new Producto(cod,nombre,precio,cant);
                            productos.add(producto4);

                            System.out.println("Producto registrado correctamente.");
                            break;
                            
                        case 5:
                            Producto producto5 = new Producto(cod,nombre,precio,cant);
                            productos.add(producto5);

                            System.out.println("Producto registrado correctamente.");
                            break;
                            
                        default:
                            System.out.println("Tipo de producto invalido.");
                            break;
                    }
                    
                    break;
                        
                case 2:
                        System.out.println("\n===== MODIFICAR PRODUCTO =====");

                        break;

                    case 3:
                        System.out.println("\n===== LISTA DE PRODUCTOS =====");

                        break;
                    case 4:
                        System.out.println("\n===== ELIMINAR PRODUCTO =====");

                        break;

                    case 5:
                        System.out.println("\n===== AGREGAR PRODUCTO AL CARRITO =====");

                        break;

                    case 6:
                        System.out.println("\n===== GENERAR RECIBO =====");

                        break;

                    case 7:
                        System.out.println("Saliendo... Gracias por usar el sistema :)");
                        break;

                    default:
                        System.out.println("Opcion invalida.");
                        break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "No se permiten letras", "Error", JOptionPane.ERROR_MESSAGE);
            }finally {
                System.out.println("Operacion finalizada...");
            }

            }
            while (opcion != 7);

            sc.close();

        }
    }
