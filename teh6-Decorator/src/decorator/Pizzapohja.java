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
public class Pizzapohja extends PizzaDecorator{
    private double hinta = 0;
    
    public Pizzapohja(PizzaInterface pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
        hinta = 1.10;
    }

    @Override
    public String kerroTäytteet() {
        return super.kerroTäytteet() + " pizzapohjalla"; 
    }

    @Override
    public double annaHinta() {
        return super.annaHinta() + hinta; //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
}
