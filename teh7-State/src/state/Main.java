/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import java.util.Scanner;

/**
 *
 * @author koivi
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        int komento = 1;
        
        while (komento != 4) {
            System.out.println("Command your Pokemon");
            System.out.println("1: Attack");
            System.out.println("2: BoostPower");
            System.out.println("3: Move");
            System.out.println("4: Stop Playing");
            komento = scanner.nextInt();
            switch(komento) {
                case 1: 
                    pokemon.attack();
                    break;
                case 2: 
                    pokemon.boostPower();
                    break;
                case 3: 
                    pokemon.move();
                    break;
                case 4:
                    System.out.println("Playing stopped");
            }
        }
        
    }
    
}
