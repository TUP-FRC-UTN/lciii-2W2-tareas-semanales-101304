/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricadecaños;

/**
 *
 * @author Seba
 */
public class Producto {
    
    String descripcionProducto;
    Material[] materiales;
    //8 Cantidad de Materiales por precio    
    int[] cantidad = new int[4];    
    
    //3
    public Producto(int cantidadElementos)
    {
        materiales = new Material[cantidadElementos];
        descripcionProducto = "";
    }
    
    //4
    public void agregaMaterial(Material m)
    {
        for (int i = 0; i < materiales.length; i++) 
        {
            if(materiales[i]==null )
            {
                materiales[i] = new Material();
                materiales[i] = m;
                break;
            }
            
        }
    }
    
    //5 Metodo que retorne el valor sumado de todos los valoresUnitarios    
    public double sumaValoresUnitarios()
    {
        double total = 0;
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] != null)
            {
                total += materiales[i].valorUnitario;
            }            
        }
        return total;
    }
    
    //6 Metodo que reciba un codigo de material, y retorne true, si esta en stock
    public boolean enStock(int codigo)
    {
        boolean enstock = false;
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] != null)
            {
                if(materiales[i].codigo == codigo)
                {
                    enstock = true;
                }                
            }            
        }
        return enstock;
    }
    
    //7 Metodo que retorne un vector, con todos los materiales con valor menor a un parametro
    public Material[] retornarVector(double valor)
    {        
        Material[] m2 = new Material[materiales.length];
        int posicion = 0;
        
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] != null)
            {
                if(materiales[i].valorUnitario <= valor)
                {                       
                    m2[posicion] = new Material();
                    m2[posicion] = materiales[i];
                    posicion ++;                                    
                }    
            }                        
        }
        return m2;
    }
    
    //8 Cantidad de Materiales con un precio menor o igual (10,20,30) o mayor a 30
    
    public int[] cantMaterilesPorPrecio()
    {   cantidad[0]=0;     
        cantidad[1]=0;     
        cantidad[2]=0;     
        cantidad[3]=0;     
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] != null)
            {
                if (materiales[i].valorUnitario <= 10 ) 
                {
                  cantidad[0] ++;    
                } else 
                {
                    if(materiales[i].valorUnitario <= 20)
                    {
                        cantidad[1] ++;
                    }
                    else
                    {
                        if(materiales[i].valorUnitario <= 30)
                        {
                            cantidad[2]++;
                        }
                        else
                        {
                            cantidad[3]++;
                        }
                    }
                }
            }
        }
        return cantidad;
    }
    
 
}
