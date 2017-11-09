/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author koivi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Pizzaravintola laatii pizzahinnaston decorator-mallin avulla. Pizza
koostuu pohjasta ja erilaisista täytteistä. Pohjalla ja täytteillä on kullakin
omat hinnat. Tee ohjelma, jossa rakennat kolme mieleistäsi pizzaa ja
tulostat pizzamenun hintoineen. Pizzapohja ja kaikki täytteet toteuttavat
Pizza-rajapintaa. Kaikki täytteet ovat dekoraattoreita. Piirrä myös
luokkakaavio. */
        PizzaInterface decoratedPizza1;
        PizzaInterface decoratedPizza2;
        PizzaInterface decoratedPizza3;
        
        decoratedPizza1 = new Pizzapohja(new Tomaattikastike(new Juustoraaste(new Pizza())));
        //decoratedPizza = new Juustoraaste(new Pizza());
        System.out.println(decoratedPizza1.kerroTäytteet());
        System.out.println("hinta: " + decoratedPizza1.annaHinta() + "€.");
        
        decoratedPizza1 = new Tonnikala(new Pizzapohja(new Tomaattikastike(new Sipuli(new Pizza()))));
        //decoratedPizza = new Juustoraaste(new Pizza());
        System.out.println(decoratedPizza1.kerroTäytteet());
        System.out.println("hinta: " + decoratedPizza1.annaHinta() + "€.");
        
        decoratedPizza1 = new Tonnikala(new Pizzapohja(new Sipuli(new Pizza())));
        //decoratedPizza = new Juustoraaste(new Pizza());
        System.out.println(decoratedPizza1.kerroTäytteet());
        System.out.println("hinta: " + decoratedPizza1.annaHinta() + "€.");

    }
    
}
