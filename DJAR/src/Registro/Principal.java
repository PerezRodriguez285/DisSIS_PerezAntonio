
package Registro;
import java.util.*;
public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        Administracion nombre = new Administracion();
        Seleccion datos = new Seleccion();
        Seleccion datos1 = new Seleccion();
        datos.Ingresar();
             
        //datos1.verDatos();
        
        
        Proveedor proveedor = new Proveedor();
        proveedor.Ingresar();
        
        Vendedor prov = new Vendedor();
        Vendedor prov1 = new Vendedor();
        Vendedor prov2 = new Vendedor();
        prov1.setId(1);
        prov.setNombreV("Juanito");
        prov2.setPago("Tarjeta de credito");
        nombre.setNombreA("Antonio Alberto de la Luz"); 
        System.out.println("Administrador encaragado del pedido: " + nombre.getNombreA());
        
        System.out.println("Datos del Vendedor a cargo: " + prov1.getId());
        System.out.println("Datos del Vendedor a cargo: " + prov.getNombreV());
        System.out.println("Datos del Vendedor a cargo: " + prov2.getPago());
    }
}
