package comercio;

public class Cliente {
    
    private int numero;
    private String nombre;
    private long telefono;

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

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Cliente(){
    
    }
    
    public Cliente(int numero, String nombre, long telefono) {
        this.numero = numero;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    @Override public String toString() {
        
        return "Nº: " + numero + ", Nombre: " + nombre + ", Tel: " + telefono;
    }
    
}
