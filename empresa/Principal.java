package empresa;
import java.util.Scanner;

public class Principal {
    
//    public static void menuAgregarProducto() {
//        
//        
//    }
//    
    public static void menuOpciones() {
        
        System.out.println("");
        System.out.println("Menu de opciones");
        System.out.println("1 - Agregar un material al producto");
        System.out.println("2 - Calcular el costo total deal producto");
        System.out.println("3 - Averiguar si material forma parte del producto");
        System.out.println("4 - Averiguar materiales con precio menor a");
        System.out.println("5 - Contador de materiales por rango de precios");
        System.out.println("0 - Salir del menu");
        System.out.println("Ingrese una opcion: ");
        System.out.println("");
    }
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Creación de un producto");
        System.out.print("Ingrese descripción del producto: ");
        String descProducto = sc.nextLine();
        System.out.println();
        
        System.out.print("Ingrese cantidad de materiales del producto: ");
        int cantMaterial = sc.nextInt();
        sc.nextLine();
        
        Producto p = new Producto(descProducto, cantMaterial);
        System.out.print("El producto ha sido creado");
        sc.nextLine();
        
        if (p != null) {

            int opcion = -1;
            menuOpciones();
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1: {
                    System.out.println("Agregar un material");
                    System.out.print("Ingrese descripción del material: ");
                    String descMaterial = sc.nextLine();
                
                    System.out.print("Ingrese codigo del material: ");
                    int codMaterial = sc.nextInt();
                
                    System.out.print("Ingrese valor unitario del material: ");
                    float valorUnitMaterial = sc.nextFloat();
                
                    p.agregarMaterial(descMaterial, codMaterial, valorUnitMaterial);
                    System.out.println("");
                    System.out.println("Material agregado");
                    menuOpciones();
                    opcion = sc.nextInt();
                    break;
                }
                case 2: {
                    System.out.println("Calcular costo total del producto");
                    float costoTotal = p.calcularCostoTotal();
                    System.out.print("El costo total es de: " + costoTotal);
                    menuOpciones();
                    opcion = sc.nextInt();
                    break;
                }
                case 3: {
                    System.out.println("Averiguar si material forma parte +"
                            + "del producto");
                    System.out.print("Ingrese codigo del material: ");
                    int codMaterial = sc.nextInt();
                    boolean existe = p.existeMaterial(codMaterial);
                    
                    if (existe) {
                        System.out.println("El material si forma parte del"
                                + "producto");
                    }
                    else {
                        System.out.println("El material no forma parte del"
                                + "producto");
                    }
                    menuOpciones();
                    opcion = sc.nextInt();
                    break;
                }
                case 4: {
                    System.out.println("Materiales con valor unitario menor a");
                    System.out.print("Ingrese un valor unitario máximo: ");
                    float valorUnit = sc.nextFloat();
                    
                    String[] lista = p.valorUnitarioMenor(valorUnit);
                    
                    for (int i = 0; i < lista.length; i++) {
                        System.out.println(lista[i]);
                    }
                    menuOpciones();
                    opcion = sc.nextInt();
                    break;
                }
                case 5: {
                    System.out.println("Contador de materiales por rango de precios");
                    int[] contador = p.contadorMaterialPorPrecio();
                    
                    for (int i = 0; i < contador.length; i++) {
                        System.out.println(contador[i]);
                    }
                    menuOpciones();
                    opcion = sc.nextInt();
                    break;
                }
                case 0: {
                    System.out.println("Usted a salido del menu");
                    break;
                }
                default:
                    System.out.println("Debe seleccionar un opción");
                    menuOpciones();
                    opcion = sc.nextInt();
            }
        }
    }
}
    

