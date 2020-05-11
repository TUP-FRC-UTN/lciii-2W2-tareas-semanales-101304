


package fabricadecaños;

import java.util.Scanner;



public class FabricaDeCaños {

    
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in); 
        int[] a = new int[3];
        a[0]= 2;
        a[1]= 3;
        a[2]= 4;
        int[] b=new int[3];
        b = a;
        
        
        
        
        //3
        System.out.println("Ingrese Cantidad de Elementos que va a cargar: ");
        int elementos = lector.nextInt();        
        Producto p = new Producto(elementos);
        
        //4
        for (int i =0; i < elementos; i++)
        {
            System.out.println("Cargando Elemento " + (i+1));
            System.out.println("Introduzca Descripcion del Material: ");
            lector.nextLine();
            String descripcionMaterial = lector.nextLine();
            System.out.println("Introduzca el Codigo: ");
            int codigo = lector.nextInt();
            System.out.println("Introduzca el Valor Unitario: ");
            double valorUnitario = lector.nextDouble();           
            Material m = new Material (descripcionMaterial, codigo, valorUnitario);
            p.agregaMaterial(m);
        }
        
        
        //5 Metodo que retorne el valor sumado de todos los valoresUnitarios
        //6 Metodo que reciba un codigo de material, y retorne true, si esta en stock
        //7 Metodo que retorne un vector, con todos los materiales con valor menor a un parametro
        //8 Cantidad de Materiales con un precio menor o igual (10,20,30) o mayor a 30
        System.out.println("");
        System.out.println("");
        System.out.println("Ingrese la operacion que desea realizar: ");
        System.out.println("0 - Cerrar el programa");
        System.out.println("1 - Valor sumado de todos los Valores Unitarios de los Materiales");
        System.out.println("2 - Comprobar si un Material esta en Stock");
        System.out.println("3 - Retornar todos los los materiales con valor menor o igual al parametro");
        System.out.println("4 - Cantidad de Materiales con un precio menor o igual a 10, 20, 30. O mayor a 30");
        int operacion =0;
        operacion = lector.nextInt();
        while (operacion !=0) {
        
            switch (operacion) {
            case 0: break;
            case 1: //5 Metodo que retorne el valor sumado de todos los valoresUnitarios
                    System.out.println("El valor total de los materiales es: " + p.sumaValoresUnitarios());                
                    break;
            case 2: //6 Metodo que reciba un codigo de material, y retorne true, si esta en stock
                    System.out.println("Punto 6 - Ingrese el codigo del material que quiere comprobar si esta en stock: ");
                    int codigoenstock = lector.nextInt();
                    System.out.println("Resultado: " + p.enStock(codigoenstock));
                    break;
            case 3: //7 Metodo que retorne un vector, con todos los materiales con valor menor a un parametro
                    System.out.println("Punto 7 - Indique el valor maximo de los materiales: ");
                    double valorMaximo = lector.nextDouble();
                    Material[] m3 = new Material[10];
                    for (int i = 0; i < m3.length; i++) {
                        m3[i] = new Material();            
                        }
                    m3 = p.retornarVector(valorMaximo);
        
                    for (int i = 0; i < m3.length; i++) {
                        if(m3[i] != null)
                        {
                        System.out.println("Los que estan por debajo de ese valor son: " + m3[i].StringMaterial());
                        }
                     }  
                    break;
            case 4: //8 Cantidad de Materiales con un precio menor o igual (10,20,30) o mayor a 30
                    int[] cantidadMateriales = new int[4];
                    cantidadMateriales = p.cantMaterilesPorPrecio();
                    System.out.println("Cantidad de Materiales con un precio menor o igual 10: "+ cantidadMateriales[0]);
                    System.out.println("Cantidad de Materiales con un precio menor o igual 20: "+ cantidadMateriales[1]);
                    System.out.println("Cantidad de Materiales con un precio menor o igual 30: "+ cantidadMateriales[2]);
                    System.out.println("Cantidad de Materiales con un precio mayor a 30: "+ cantidadMateriales[3]);
                    break;           
            
             }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Ingrese la operacion que desea realizar: ");
        System.out.println("0 - Cerrar el programa");
        System.out.println("1 - Valor sumado de todos los Valores Unitarios de los Materiales");
        System.out.println("2 - Comprobar si un Material esta en Stock");
        System.out.println("3 - Retornar todos los los materiales con valor menor o igual al parametro");
        System.out.println("4 - Cantidad de Materiales con un precio menor o igual a 10, 20, 30. O mayor a 30");      
        operacion = lector.nextInt();
        }
        
    }    
}
