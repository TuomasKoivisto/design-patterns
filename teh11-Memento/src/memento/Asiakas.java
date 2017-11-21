/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author koivi
 */
public class Asiakas extends Thread{
    private Arvuuttaja arvuuttaja;
    private Memento memento;

    public Asiakas() {
        this.arvuuttaja = Arvuuttaja.getInstance();
        this.memento = null;
    }
    
    public void liityPeliin() {
        memento = arvuuttaja.liityPeliin(this);
    }
    
    public void arvaa(int arvaus) {
        arvuuttaja.tarkistaArvaus(arvaus,memento);
    }
    
    
}
