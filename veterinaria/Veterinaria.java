package veterinaria;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Veterinaria {

    public static void main(String[] args) {
        
        int n = 0;
        Scanner sc = new Scanner(System.in);
        
        int sumaEdadMascota = 0;
        double promEdadMascota = 0;
        int contClientesMasCinco = 0;
        
        System.out.print("Ingrese cantidad de clientes a cargar: ");
        n = sc.nextInt();
        
        Cliente clientes[] = new Cliente[n];
        
        for (int i = 0; i < clientes.length; i++) {
            
            clientes[i] = new Cliente();
            
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
            clientes[i].mascota.setNombre(sc.nextLine());
            
            System.out.println("Ingrese edad de la mascota: ");
            clientes[i].mascota.setEdad(sc.nextInt());
            
            sumaEdadMascota+=clientes[i].mascota.getEdad();
            
            System.out.println(clientes[i].toString());
        }
        
        System.out.print("Cantidad de clientes: " + clientes.length);
        
        promEdadMascota = (double)sumaEdadMascota / clientes.length;
        System.out.print("El promedio de edades de las mascotas: " + 
                            promEdadMascota);
        
        System.out.println("Cantidad de clientes con 5 o mas años de " +
                            "antiguedad: " + contClientesMasCinco);
    }
    
}
