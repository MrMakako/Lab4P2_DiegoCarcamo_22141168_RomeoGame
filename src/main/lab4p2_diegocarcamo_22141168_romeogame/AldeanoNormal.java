/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.lab4p2_diegocarcamo_22141168_romeogame;

/**
 *
 * @author Diego Carcamo
 */
public class AldeanoNormal extends Persona {
    
    

    public AldeanoNormal(String Apellido , String nombre,int edad,int PtsVida ) {
        super( Apellido,nombre,edad,PtsVida);
        PtsAtq=50;
        Tipo="Aldeano Normal";
        
        
        
    }
    
    
    public double  Atacar(Persona p){
        
        if(p instanceof Pacifistas){
            tasaAtq=0.05;
        }
        
        
        return super.Atacar(p);
    
    
    
    }
    
    
    
    
    
}
