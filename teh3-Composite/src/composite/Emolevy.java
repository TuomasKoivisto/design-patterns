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
public class Emolevy implements Laiteosa{
    Prosessori prosessori = null;
    Näytönohjain näytönohjain = null;
    Verkkokortti verkkokortti = null;
    Muistipiiri muistipiiri = null;
    
    public Emolevy(Prosessori prosessori, Näytönohjain näytönohjain, 
            Verkkokortti verkkokortti, Muistipiiri muistipiiri) {
        this.prosessori = prosessori;
        this.näytönohjain = näytönohjain;
        this.verkkokortti = verkkokortti;
        this.muistipiiri = muistipiiri;
    }

    @Override
    public double ilmoitaHinta() {
        return prosessori.ilmoitaHinta() + näytönohjain.ilmoitaHinta() + 
                verkkokortti.ilmoitaHinta() + muistipiiri.ilmoitaHinta();
    }
    
}
