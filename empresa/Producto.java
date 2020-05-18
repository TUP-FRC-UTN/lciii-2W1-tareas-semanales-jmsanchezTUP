package empresa;

public class Producto {
    
    private String descripcion;
    private Material[] materiales;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto(int cantidadElem) {
        
        materiales = new Material[cantidadElem];
    }
    
    public Producto(String descripcion, int cantidadElem) {
        
        this.descripcion = descripcion;
        materiales = new Material[cantidadElem];
    }
    
    public void agregarMaterial(String descMaterial, int codMaterial, 
                                   float valorUnitMaterial) {
        
        for (int i = 0; i < materiales.length; i++) {
            
            if (materiales[i] == null) {
                
                Material nuevoMaterial = new Material(descMaterial, codMaterial,
                                                valorUnitMaterial);
                
                materiales[i] = nuevoMaterial;
                break;
            }
        }
    }
    
    public float calcularCostoTotal() {
        
        float costoTotal = 0;
        
        for (Material m : materiales) {
            
            if (m != null) {
                
                costoTotal += m.getValorUnitario();
            }
        }
        
        return costoTotal;
    }
    
    public boolean existeMaterial(int codigoMaterial) {
        
        boolean existe = false;
        
        for (Material m : materiales) {
            
            if (m != null && (m.getCodigo() == codigoMaterial)) {
                
                existe = true;
                break;
            }
        }
        
        return existe;
    }
    
    public String[] valorUnitarioMenor(float valorUnitario) {
        
        String[] resultado = new String[materiales.length];
        
        for (int i = 0; i < materiales.length; i++) {
            
            //Material m = materiales[i];
            
            if (materiales[i].getValorUnitario() <= valorUnitario) {
                
                resultado[i] = materiales[i].getDescripcion();
            }
            else { 
                resultado[i] = "---";
            }
        }
        
        return resultado;
    }
    
    public int[] contadorMaterialPorPrecio() {
        
        int[] resultado = new int[4];
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        
        float valor = 0;
        
        
        for (Material m : materiales) {
            
            if (m != null) {
                
                valor = m.getValorUnitario(); 

                if (valor <= 10) {
                    resultado[0] = contador1++;
                }
                else if (valor > 10 && valor <= 20) {
                    resultado[1] = contador2++;
                }
                
                else if (valor > 20 && valor <= 30) {
                    
                    resultado[2] = contador3++;
                }
                else {
                    resultado[3] = contador4++;
                }
                
            }
        }
        
        return resultado;
    }
}
