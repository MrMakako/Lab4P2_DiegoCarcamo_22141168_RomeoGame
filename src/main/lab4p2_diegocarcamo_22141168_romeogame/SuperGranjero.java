/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.lab4p2_diegocarcamo_22141168_romeogame;

/**
 *
 * @author Diego Carcamo
 */
public class SuperGranjero extends Persona{

    public SuperGranjero( String Apellido,String nombre,int edad,int PtsVida) {
        super( Apellido,nombre,edad,PtsVida);
    }
    
    public double Atacar(Persona p){
        
        if(p instanceof AldeanoHerrero){
            tasaAtq=0.10;
        
        
        }else if(p instanceof  AldeanoExplosivo){
            tasaAtq=0.15;
        }
        
        return super.Atacar(p);
    
    
    }
    
    
    
    
    
    
}
