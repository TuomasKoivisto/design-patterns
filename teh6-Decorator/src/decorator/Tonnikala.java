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
public class Tonnikala  extends PizzaDecorator {
    private double hinta = 0;
    
    public Tonnikala(PizzaInterface pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
        hinta = 1.70;
    }

    @Override
    public String kerroTäytteet() {
        return super.kerroTäytteet() + " tonnikalalla"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double annaHinta() {
        return super.annaHinta() + hinta; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
