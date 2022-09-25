
package Registro;

import java.util.Scanner;

public class ContarPaga extends Vendedor{
    public String nombreVendedor;
    public String formaPago;
    public int contarPaga;

    public ContarPaga(String nombre, String tipo, int precio, int id, String nombreV, String pago, String nombreVendedor, String formaPago, int contarPaga) {
        super(nombre, tipo, precio, id, nombreV, pago);
        this.nombreVendedor = nombreVendedor;
        this.formaPago = formaPago;
        this.contarPaga = contarPaga;
    }
    Scanner entrada = new Scanner(System.in);
    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getContarPaga() {
        return contarPaga;
    }

    public void setContarPaga(int contarPaga) {
        this.contarPaga = contarPaga;
    }
    
    
    
}
