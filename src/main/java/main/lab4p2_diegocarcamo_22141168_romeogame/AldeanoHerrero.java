/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.lab4p2_diegocarcamo_22141168_romeogame;

/**
 *
 * @author Diego Carcamo
 */
public class AldeanoHerrero extends Persona{

    public AldeanoHerrero(String Apellido , String nombre,int edad,int PtsVida ) {
        super( Apellido,nombre,edad,PtsVida);
       
    }
    
    
    
    
    public void Ataque( ){
        
        PtsAtq= (int) Math.random()*(500+200);
        
       
        
        
       
        
        
        
    //Cada vez que el herrero ataque llamaremos esta funcion
    
    }
    public double  Atacar(Persona p ){
        Ataque();
        
        if(p instanceof Agronomo){
            tasaAtq=0.1;
        
        
        }else{
            if( p instanceof  Pacifistas){
            
                tasaAtq= 0.05;
            
            }
        
        }
        //ADD PROBABIBLIDADES 
 
        return super.Atacar(p);
        
    
    
    
    }
    
    
    
 
    
    
    
}
