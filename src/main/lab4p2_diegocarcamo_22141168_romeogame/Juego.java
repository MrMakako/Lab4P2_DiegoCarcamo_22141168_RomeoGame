/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.lab4p2_diegocarcamo_22141168_romeogame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego Carcamo
 */
public class Juego {

    ArrayList<Familia> Familias;

    Familia Montesco;
    Familia Copuleto;

    Scanner lea = new Scanner(System.in);

    public Juego() {
        Familias = new ArrayList<>();
        //Familia de Julieta
        Copuleto = new Familia("COPULETO");
        //Eneemigos
        Familias.add(new Familia("RAMIREZ"));

        Familias.add(new Familia("SIMPSONS"));

        Montesco = new Familia("MONTESCO");

        Montesco.AddMiembros(new Agronomo("MONTESCO", "Edgar", 29, 200));
        Montesco.AddMiembros(new AldeanoHerrero("MONTESCO", "Maurice", 29, 400));
        Montesco.AddMiembros(new Agronomo("MONTESCO", "Fill", 49, 250));
        //Familia de juieta

        Copuleto.AddMiembros(new AldeanoNormal("COPULETO", "Julieta", 20, 50));
        Copuleto.AddMiembros(new AldeanoExplosivo("COPULETO", "BOOM", 23, 200));

        Familias.get(0).AddMiembros(new Agronomo("RAMIREZ", "Erminio", 29, 200));
        Familias.get(0).AddMiembros(new AldeanoHerrero("RAMIREZ", "Juanr", 29, 200));
        Familias.get(0).AddMiembros(new Agronomo("RAMIREZ", "pollo", 29, 200));

        //Crear Aldeanos
    }

    public void menu() {
        int option;

        do {
            System.out.println("1-Anadir familia" + "\n2-Ver Familias" + "\n3-nAnadir Miembro a Familia" + "\n4-Crear Aldeano"
            );

            option = lea.nextInt();

            Opciones(option);

        } while (option != 5);

    }

    public void Opciones(int opciones) {
        switch (opciones) {
            case 1: {

            }
            case 2: {

            }

            case 3: {

            }
            case 4: {

                Jugar();

                break;

            }

        }

    }

    public void VerFamilias() {
        for (Familia stat : Familias) {

            System.out.println(stat.toString());

        }

    }

    public int BuscarFamilia(String Apellido) {
        for (int i = 0; i < Familias.size(); i++) {
            if (Apellido.toUpperCase().equals(Familias.get(i).getApellido())) {
                System.out.println(i);
                return i;
            }
        }
        System.out.print("-1");
        return -1;
    }

    public void Jugar() {
        //Minetras allan no se alla derrotado o la lafmiala de julieta o la de romeo ;
        while (true) {

            VerFamilias();
            System.out.println("Elija el apellido>>");
            
            

            String Apellido = lea.next();
            int index = BuscarFamilia(Apellido);
            if (index != -1) {
                System.out.println("Empezando pelea");
                if (Pelea(index)) {
                    System.out.println("Triunfastse");
                    break;
                } else {
                    System.out.println("Perdiste");
                    break;
                }

            }

        }

    }

    public boolean Pelea(int index) {
        //Primero
        for (int a = 0; a < Montesco.getMiembros().size(); a++) {
            String Fin = "";
            for (int i = 0; i < Familias.get(index).getMiembros().size(); i++) {
                if (Fin.equals("M")) {
                    break;
                }
                Fin = "";

                while (Fin.equals("")) {

                    System.out.println("Peleando");

                    Fin = VS(Montesco.getMiembros().get(a), Familias.get(index).getMiembros().get(i));

                    if (Fin.equals("M")) {
                        
                        if (Familias.get(index).getMiembros().size() < 2) {
                            Montesco.MatarMiembro(a);
                             return false;
                         }

                        

                    }
                    if (Fin.equals("E")) {
                        
                          if (Montesco.getMiembros().size() < 2) {
                              
                             Familias.get(a).MatarMiembro(i);

                            return true;

                           }

                       

                    }

                   
                }

            }

        }

        return true;

    }

    public String VS(Persona Montesco, Persona Enemiga) {

        if (Montesco.getVida() > 0) {
            System.out.println(Montesco.toString() + "ataca" + Enemiga.toString());
            Enemiga.Recibir(Montesco.Atacar(Enemiga));

        } else {
            return "M";

        }

        if (Enemiga.getVida() > 0) {

            Montesco.Recibir(Enemiga.Atacar(Montesco));

        } else {
            return "E";

        }

        return "";

    }

}
