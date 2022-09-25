package Registro;

import java.util.Scanner;

public class Seleccion {
    public String nombre;
    public String tipo;
    public int precio;
    
    public Seleccion(){
        
    }
    public Seleccion(String nombre, String tipo, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }
    
    Scanner entrada = new Scanner(System.in);
    
    public void Ingresar(){
        System.out.println("Ingresando los datos");
        System.out.println("Encargado del pedido: ");
        nombre = entrada.next();
        System.out.println("Tipo de calzado: ");
        tipo = entrada.next();
        System.out.println("Precio del pedido: ");
        precio = entrada.nextInt();
        
        System.out.println("Mostrar datos ingresados:\n"+"Encargado: " + nombre + "\nCalzado: " + tipo + "\nPrecio: " +precio);
    }
    public void verDatos(){
        //System.out.println("Mostrar datos ingresados:\n" + nombre + "\nCalzado" + tipo + "\nPrecio" +precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
