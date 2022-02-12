/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.lab4p2_diegocarcamo_22141168_romeogame;

import java.lang.invoke.TypeDescriptor;
import java.util.AbstractQueue;

/**
 *
 * @author Diego Carcamo
 * 
 * 
 
*/



public abstract class Persona {
    
    
    String Apellido;
    
    String nombre;
    
    int edad;
    int PuntosVida;
    
    int PtsAtq;
    
    double tasaAtq;
    
    String Tipo="";
    
    
           

    public Persona(String Apellido , String nombre,int edad,int PtsVida ) {
        this.Apellido=Apellido;
        this.nombre= nombre;
        this.PuntosVida=PtsVida;
       
        
        
        
    }
    
    public String getApellido(){
        return Apellido;
    
    
    }
    
    public void recibirAtq(int Atq){
        
        PuntosVida-=PtsAtq;
    
    
    }
    
    public int getVida(){
    
        return PuntosVida;
    
    }
    
    public double  Atacar(Persona p){
       System.out.println(nombre +"de "+Apellido+" Esta atacando a "+ p.getName());
       return PtsAtq + (PtsAtq*tasaAtq);
       
       
    
    }
    
    public  void  Recibir(double Atq){
        PuntosVida-=Atq;
    }
    public String getName(){
        
        return nombre;
        
     
    
    
    }

   public String toString(){
       return "Tipo"+Tipo+"-Vida:"+PuntosVida+"Ataque"+PtsAtq+ nombre+"-";
   
   }
    
    
    
    
    
    
    
    
}
