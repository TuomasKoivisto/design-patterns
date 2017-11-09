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
public abstract class PizzaDecorator implements PizzaInterface{
    protected PizzaInterface pizzaToBeDecorated;
    protected double hinta = 0;

    public PizzaDecorator (PizzaInterface pizzaToBeDecorated) {
        this.pizzaToBeDecorated = pizzaToBeDecorated;
    }

    @Override
    public double annaHinta() {
        return pizzaToBeDecorated.annaHinta(); 
    }

    @Override
    public String kerroTäytteet() {
        return pizzaToBeDecorated.kerroTäytteet(); 
    }
    
}
