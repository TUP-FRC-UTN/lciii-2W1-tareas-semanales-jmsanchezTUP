package veterinaria;
import java.util.Scanner;

public class Veterinaria {

    public static void main(String[] args) {
    
        int n = 0; //cantidad de clientes a crear
        Scanner sc = new Scanner(System.in);
        
        int acumEdadMascota = 0;
        double promEdadMascota = 0;
        int contClientesMasCinco = 0;
       
        System.out.print("Ingrese cantidad de clientes a cargar: ");
        n = sc.nextInt();
        
        Cliente clientes[] = new Cliente[n];
        
        int cantMascota = 1;
        
        for (int i = 0; i < clientes.length; i++) {
            
            clientes[i] = new Cliente(cantMascota);
            
            System.out.print("Ingrese numero de cliente: ");
            clientes[i].setNumero(sc.nextInt());
            sc.nextLine();
            
            System.out.print("Ingrese nombre cliente: ");
            clientes[i].setNombre(sc.nextLine());
            
            System.out.print("Ingrese antiguedad del cliente: ");
            clientes[i].setAntiguedad(sc.nextInt());
            sc.nextLine();
            
            if (clientes[i].getAntiguedad() >= 5) {
                contClientesMasCinco++;
            }
            
            System.out.print("Ingrese nombre de mascota: ");
            String nomM = sc.nextLine();
            
            System.out.print("Ingrese edad de la mascota: ");
            int edadM = sc.nextInt();
            acumEdadMascota += edadM;
            
            clientes[i].agregarMascota(nomM, edadM);
            
            System.out.println(clientes[i].toString()); 
        }
        
        System.out.println("Cantidad de clientes: " + clientes.length);
        
        promEdadMascota = (double)acumEdadMascota / clientes.length;
        System.out.println("El promedio de edades de las mascotas: " + 
                            promEdadMascota);
        
        System.out.println("Cantidad de clientes con 5 o mas años de " +
                            "antiguedad: " + contClientesMasCinco);
    }
    
}
