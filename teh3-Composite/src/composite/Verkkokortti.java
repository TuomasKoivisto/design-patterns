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
public class Verkkokortti implements Laiteosa {
    
    private double hinta = 0;

    public Verkkokortti(double hinta) {
        this.hinta = hinta;
    }

        @Override
        public double ilmoitaHinta() {
            return hinta;
        }
        
    }
