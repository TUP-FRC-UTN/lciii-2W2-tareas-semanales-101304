

package veterinaria;

import java.util.Scanner;


public class Veterinaria {


    
    public static void main(String[] args) {
   
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de clientes a cargar: ");
        int tam = lector.nextInt();
                
        cliente[] ac = new cliente[tam];
        
              
        for (int i = 0; i < ac.length; i++) {
            
            System.out.println("Ingrese numero de cliente: " + (i + 1));
            int numeroCliente = lector.nextInt();
            System.out.println("Ingrese Nombre del cliente: ");
            lector.nextLine();
            String nombreCliente = lector.nextLine();
            System.out.println("Ingrese la antigued del cliente: ");
            double antiguedad = lector.nextDouble();
            System.out.println("Ingrese el nombre de la mascota: ");
            lector.nextLine();
            String nombreMascota = lector.nextLine();
            System.out.println("Ingrese la edad de la mascota: ");
            double edadMascota = lector.nextDouble();
            ac[i] = new cliente(numeroCliente, nombreCliente, antiguedad, nombreMascota,edadMascota );           
        }
        
        int promedioEdadMascotas = 0;
        int antiguedadMayorCincoAños = 0;
        
        for (int i = 0; i < ac.length; i++) {
            promedioEdadMascotas += ac[i].getEdadMascota();
            
            if (ac[i].getAntiguedad() >= 5 ) {
                antiguedadMayorCincoAños ++;
            }
            
        }
        
        System.out.println("Cantidad de clientes: " + ac.length); 
        System.out.println("Promedio de edad de las mascotas: " + promedioEdadMascotas/ac.length);
        System.out.println("Clientes con una antiguedad mayor o igual a cinco años: " + antiguedadMayorCincoAños);
        
        
                
    }
    
}
