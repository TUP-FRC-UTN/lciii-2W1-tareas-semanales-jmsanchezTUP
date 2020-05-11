package veterinaria;

public class Mascota {
    
    private String nombre = "";
    private int edad = 0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public Mascota() {
    }
    
    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    @Override public String toString() {
        return "Mascota: " + nombre + ", edad: " + edad;
    }
}
