package veterinaria;
import java.util.Scanner;

public class Cliente {
    
    private int numero = 0;
    private String nombre = "";
    private int antiguedad = 0;
    private Mascota[] mascotas; //puntero a arreglo de Mascota

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Cliente(int cantMascota) {
        mascotas = new Mascota[cantMascota]; //??
    }
    
    public Cliente(int numero, String nombre, int antiguedad, int cantMascota) {
        
        this.numero = numero;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        mascotas = new Mascota[cantMascota]; //arreglo de n Mascota
    }
    
    public void agregarMascota(String nomMascota, int edadMascota) {
        
        for (int i = 0; i < mascotas.length; i++) {
            
            if (mascotas[i] == null) {
                
                mascotas[i] = new Mascota(nomMascota, edadMascota);
                break;
            }  
        }
    }
    
    public String mostrarMascota() {
        
        String nomMascota = "";
        int edMascota = 0;
        
        for (Mascota m : mascotas ) {
            
            if (m != null) {
                
                nomMascota = m.getNombre();
                edMascota = m.getEdad();
            }
        }
        
        return "Nombre mascota: "+ nomMascota + ", Edad mascota: " + edMascota;
    }
    
    @Override public String toString() {
        
        return "Cliente: " + nombre + ", Numero cliente: " + numero + ", " + 
                    mostrarMascota();
    }
}
