/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.lab4p2_diegocarcamo_22141168_romeogame;

/**
 *
 * @author Diego Carcamo
 */
public class AldeanoExplosivo extends Persona {
    
    

    public AldeanoExplosivo(String Apellido , String nombre,int edad,int PtsVida ) {  
        super( Apellido,nombre,edad,PtsVida);
        PtsAtq=250;
        Tipo="Aldeano Exposivo";
        //con amigios incluidos xd
        
       
    }
    
    
    public double Atacar(Persona p){
        
        if(p instanceof AldeanoHerrero){
            tasaAtq=0.05;
        
        }else if(p instanceof Agronomo){
            tasaAtq= 0.15;
        }
        
        return super.Atacar(p);
        
    
    
    }
    
    
    
}
