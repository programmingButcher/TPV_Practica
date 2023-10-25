/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpv;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author ALUMNO CCC - TARDE
 */
public class Productos {
    String nombreProducto;
    double precio;
    public static List<Productos> BEBIDAS = new ArrayList<>();
   public Productos (String bebidas, double precio){
       this.nombreProducto = bebidas;
       this.precio = precio;
   }
    // Métodos getters y setters

    public String getNombre() {
        return nombreProducto;
    }

    public void setNombre(String nombre) {
        this.nombreProducto = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    	public static List<Productos> getBebidas() {
            return BEBIDAS;
        }
    // Lista para almacenar las bebidas
    
    
    static  {
        // Agregar las bebidas a la lista
        BEBIDAS.add(new Productos("Cerveza", 4.0));
        BEBIDAS.add(new Productos("Vino", 5.5));
        BEBIDAS.add(new Productos("Sprite", 3.2));
        BEBIDAS.add(new Productos("Tequila", 3.0));
        BEBIDAS.add(new Productos("Margarita", 2.0));
        BEBIDAS.add(new Productos("Bloody Mary", 6.0));
        BEBIDAS.add(new Productos("Mojito", 1.8));
        BEBIDAS.add(new Productos("Coca Cola", 2.5));
        BEBIDAS.add(new Productos("Agua Mineral", 1.5));
       
        
        
        
        
        
        
    }
    
}
