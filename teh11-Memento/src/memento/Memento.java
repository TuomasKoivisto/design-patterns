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
public class Memento {
    
    private int luku;
    
    public Memento(int luku) {
        this.luku = luku;
    }
    
    public int annaLuku(Arvuuttaja arvuuttaja) {
        int palautettava = -1;
        if (arvuuttaja != null) {
            palautettava = luku;
        }
        return palautettava;
    }
}
