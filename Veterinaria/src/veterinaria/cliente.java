

package veterinaria;



public class cliente {
    
    private int numeroCliente;
    private String nombre;
    private double antiguedad;
    private String nombreMascota;
    private Double edadMascota;
    
    public int getnumeroCliente(){
        return numeroCliente; 
    }
    public void setnumeroCliente(int numeroCliente){
        this.numeroCliente = numeroCliente;
    }        

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(double antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }
    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public Double getEdadMascota() {
        return edadMascota;
    }
    public void setEdadMascota(Double edadMascota) {
        this.edadMascota = edadMascota;
    }
    
    public cliente(int numeroCliente, String nombre, double antiguedad, String nombreMascota, double edadMascota){
         this.numeroCliente = numeroCliente;
         this.nombre= nombre;
         this.antiguedad = antiguedad;
         this.nombreMascota = nombreMascota;
         this.edadMascota = edadMascota;
        
    }
    
    
        
    
}
