package comercio;

public class ClientePreferencial extends Cliente {
    
    private float saldo;
    private float maximoSaldo;
    private String domicilio;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getMaximoSaldo() {
        return maximoSaldo;
    }

    public void setMaximoSaldo(float maximoSaldo) {
        this.maximoSaldo = maximoSaldo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    public ClientePreferencial() {    
    
    }
    
    public ClientePreferencial(int numero, String nombre, long telefono,
            float saldo, float maximoSaldo, String domicilio) {
        
        super(numero, nombre, telefono);
        this.saldo = saldo;
        this.maximoSaldo = maximoSaldo;
        this.domicilio = domicilio;
    }
    
    public String cPreferencialToString() {
        
        return ", Domicilio: " + domicilio + 
                ", Saldo: " + saldo + ", Saldo Maximo: " + maximoSaldo;
    }
    
    public String toString() {
        
        return super.toString() + cPreferencialToString();
    }
}
