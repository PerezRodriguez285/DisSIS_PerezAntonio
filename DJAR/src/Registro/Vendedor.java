package Registro;

public class Vendedor extends Seleccion{
    public int id;
    public String nombreV;
    public String pago;
    public Vendedor(){
        
    }
    public Vendedor(String nombre, String tipo, int precio, int id, String nombreV, String pago){
        super(nombre, tipo, precio);
        this.id=id;
        this.nombreV=nombreV;
        this.pago=pago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreV() {
        return nombreV;
    }

    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }
    
    
}
