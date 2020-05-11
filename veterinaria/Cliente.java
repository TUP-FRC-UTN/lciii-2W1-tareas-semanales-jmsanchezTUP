package veterinaria;

public class Cliente {
    
    private int numero = 0;
    private String nombre = "";
    private int antiguedad = 0;
    Mascota mascota = new Mascota();

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

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    public Cliente() {
    }
    
    public Cliente(int numero, String nombre, int antiguedad, Mascota mascota ) {
        this.numero = numero;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.mascota = mascota;
    }
    
    @Override public String toString() {
        
        return "Cliente: " + nombre + ", numero: " + numero + ", " + 
                    mascota.toString();
    }
    
    
}
