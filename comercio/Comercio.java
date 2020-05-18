package comercio;
import java.util.Scanner;

public class Comercio {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cliente: ");
        System.out.print("Numero: ");
        int nro = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Nombre: ");
        String nom = sc.nextLine();
        
        System.out.print("Telefono: ");
        long tel = sc.nextLong();
        
        Cliente cli = new Cliente(nro, nom, tel);
        
        System.out.println(cli.toString());
        
        System.out.println("");
        System.out.println("Cliente Preferencial: ");
        System.out.print("Numero: ");
        int nroP = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Nombre: ");
        String nomP = sc.nextLine();
        
        System.out.print("Telefono: ");
        long telP = sc.nextLong();
        
        sc.nextLine();
        
        System.out.print("Domicilio: ");
        String domP = sc.nextLine();
        
        System.out.print("Saldo: ");
        float salP = sc.nextFloat();
        
        System.out.print("Maximo Saldo: ");
        float maxSalP = sc.nextFloat();
        
        ClientePreferencial cliP = new ClientePreferencial(nroP,nomP,telP,salP, maxSalP, domP);
        
        System.out.println(cliP.toString());
        
        
        
        
        
        
        
        
    }
    
}
