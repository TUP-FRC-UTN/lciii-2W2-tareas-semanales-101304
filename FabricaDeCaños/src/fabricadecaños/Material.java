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
public class Material {
    
    String descripcionMaterial;
    int codigo;
    double valorUnitario;
    
    
    //4
    public Material(String descripcionMaterial, int codigo, double valorUnitario)
    {
        this.descripcionMaterial = descripcionMaterial;
        this.codigo = codigo;
        this.valorUnitario = valorUnitario;     
    }    
    public Material(){
        
    }
    
    //7
    public String StringMaterial()
    {
        return descripcionMaterial + " Codigo: " + codigo +" Valor: " + valorUnitario;
    }
    
}
