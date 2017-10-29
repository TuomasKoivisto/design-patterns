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
public class Kotelo implements Laiteosa{
    
    private double hinta = 0;
    Emolevy emolevy = null;
    
    public Kotelo(double hinta, Emolevy emolevy) {
        this.hinta = hinta;
        this.emolevy = emolevy;
    }

    @Override
    public double ilmoitaHinta() {
        return hinta + emolevy.ilmoitaHinta();
    }
   
    
}
