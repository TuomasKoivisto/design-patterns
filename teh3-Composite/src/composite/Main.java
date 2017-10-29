/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author koivi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AbstractFactory sveitsiläinentehdas = new SveitsiläinenTehdas();
        Kotelo sveitsiläinen = sveitsiläinentehdas.luoKomponentit();
        System.out.println("Sveitsiläiset komponentit: " + sveitsiläinen.ilmoitaHinta() + "€");
        
        
        AbstractFactory kiinalainentehdas = new KiinalainenTehdas();
        Kotelo kiinalainen = kiinalainentehdas.luoKomponentit();
        System.out.println("Kiinalaiset komponentit: " + kiinalainen.ilmoitaHinta() + "€");
    }
    
}
