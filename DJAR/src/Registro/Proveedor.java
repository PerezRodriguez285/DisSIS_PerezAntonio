
package Registro;

import java.util.Scanner;

public class Proveedor extends Seleccion{
    public String nombreP;
    public String apellidos;
    public int rfc;
    public Proveedor(){
        
    }
    public Proveedor(String nombre, String tipo, int precio, String nombreP, String apellidos, int rfc){
        super(nombre, tipo, precio);
        this.nombreP=nombreP;
        this.apellidos=apellidos;
        this.rfc=rfc;
    }
    Scanner entrada = new Scanner(System.in);
    
    public void Ingresar(){
        System.out.println("Ingresando los datos del proveedor");
        System.out.println("Nombre del proveedor: ");
        nombreP = entrada.next();
        System.out.println("Apellidos del proveedor (si es una Organizacion escribela): ");
        apellidos = entrada.next();
        System.out.println("RFC: ");
        rfc = entrada.nextInt();
        
        System.out.println("Mostrar datos del proveedor:\n"+"Proveedor: " + nombreP + "\nApellidos: " + apellidos + "\nRFC: " +rfc);
    }
    
    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getRfc() {
        return rfc;
    }

    public void setRfc(int rfc) {
        this.rfc = rfc;
    }
    
    
}
