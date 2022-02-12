/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.lab4p2_diegocarcamo_22141168_romeogame;

import java.util.ArrayList;

/**
 *
 * @author Diego Carcamo
 */
public  class Familia {
    
    
    ArrayList<Persona> Miembros;
    
    protected String Apellido;

    public Familia(String Apellido) {
        this.Apellido=Apellido;
        
        Miembros=new ArrayList<>();
        
        
        
        
    }
    
    public void AddMiembros(Persona p ){
        //solo se puden anadir perosnas de la misma familia ose amismio apellido
        if(p.getApellido().equals(this.Apellido)){
            
           
            
            Miembros.add(p);
        
        }else{
            System.out.println("No se puede anadir ");
             System.out.println(p.getApellido());
        }
        
       
        
        
    
    
    }
    
    
    public String toString(){
        
        return "Apelldio:"+Apellido+"-Miembros:"+Miembros;
        
    /**
     *
     * @return
     */
    }
    public  ArrayList<Persona> getMiembros( ){
        
        return Miembros;
    }
    
    
    
    public String getApellido(){
        return  Apellido;
    }
    
    public void MatarMiembro(int index){
        Miembros.remove(index);
    
    
    }
 
    
    
    
    
    
    
    
    
    
    
    
    
}
