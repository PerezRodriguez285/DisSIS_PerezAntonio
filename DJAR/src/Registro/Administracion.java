
package Registro;
import java.util.*;
import javax.swing.JOptionPane;

public class Administracion extends Seleccion{
    private String nombreA;
    private int bonus;
    public int salario;
    public Administracion(){
        
    }
    public Administracion(String nombre, String tipo, int precio, String nombreA, int bonus, int salario){
        super(nombre, tipo, precio);
        this.nombreA=nombreA;
        this.bonus=bonus;
        this.salario=salario;
    }
    
    Scanner entrada = new Scanner(System.in);
    
    @Override
    public void Ingresar(){
        
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
}
