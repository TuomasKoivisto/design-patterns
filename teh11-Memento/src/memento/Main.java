/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author koivi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asiakas asiakas1 = new Asiakas();
        Asiakas asiakas2 = new Asiakas();
        Asiakas asiakas3 = new Asiakas();
        
        asiakas1.liityPeliin();
        asiakas2.liityPeliin();
        asiakas3.liityPeliin();
        
        asiakas1.arvaa(0);
        asiakas1.arvaa(7);
        asiakas1.arvaa(1);
    
    }
}
