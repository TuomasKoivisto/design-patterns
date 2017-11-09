/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author koivi
 */
public class Vesipullo implements Pullo{
    private static Vesipullo vesipullo = new Vesipullo();
    private String vesitilanne = null;
    
    private Vesipullo() {
        vesitilanne = "täynnä";
        
    }
    
    public static Vesipullo getInstance() {
        return vesipullo;
    }
    
    public void juo() {
        if (vesitilanne == "täynnä") {
            vesitilanne = "puolillaan";
            System.out.println("Vesipullo on enää puolillaan");
        } else if (vesitilanne == "puolillaan") {
            vesitilanne = "tyhjä";
            System.out.println("Kaikki vesi juotiin. Pullo on nyt tyhjä.");
        } else {
            vesitilanne = "tyhjä";
            System.out.println("Vettä ei enää ole. RIP. Aavikko kuivaa sen minkä kerran 10:ssä vuodessa kastelee.");
        }
}
}
