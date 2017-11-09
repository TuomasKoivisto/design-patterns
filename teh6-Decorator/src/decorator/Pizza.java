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
public class Pizza implements PizzaInterface {
    private double hinta = 0;

    @Override
    public double annaHinta() {
        return hinta;
    }

    @Override
    public String kerroTäytteet() {
        return "Pizza";
    }
    
}
