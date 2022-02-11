/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.lab4p2_diegocarcamo_22141168_romeogame;

/**
 *
 * @author Diego Carcamo
 */
public class Agronomo extends Persona{

    public Agronomo(String Apellido , String nombre,int edad,int PtsVida ) {
        super( Apellido,nombre,edad,PtsVida);
        PtsAtq=100;
        
        
        
    }

    
    public void Aatcar(Persona p) {
        
        if(p instanceof  AldeanoNormal){
            double Ataque= PtsAtq+(PtsAtq*0.1);
            
           p.Recibir(Ataque);
            
           
            
        
        
        }
        
        
        
        
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    public void Recibir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
    
    
    
    
    
}
