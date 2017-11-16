/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;

/**
 *
 * @author koivi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();
        lista.add("Pertti");
        lista.add("Tarja");
        lista.add("Keijo");
        lista.add("Terttu");
        lista.add("Reiska");
                
        Strategy1 strategy1 = new Strategy1();
        System.out.println(strategy1.listToString(lista));
        
        ArrayList<String> lista2 = new ArrayList();
        lista2.add("Pertti");
        lista2.add("Tarja");
        lista2.add("Keijo");
        lista2.add("Terttu");
        lista2.add("Reiska");
                
        Strategy2 strategy2 = new Strategy2();
        System.out.println(strategy2.listToString(lista2));
        
        ArrayList<String> lista3 = new ArrayList();
        lista3.add("Pertti");
        lista3.add("Tarja");
        lista3.add("Keijo");
        lista3.add("Terttu");
        lista3.add("Reiska");
                
        Strategy3 strategy3 = new Strategy3();
        System.out.println(strategy3.listToString(lista3));
    }
    
}
