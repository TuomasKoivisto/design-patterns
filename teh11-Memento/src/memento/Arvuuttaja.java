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
public class Arvuuttaja {
    
    private static Arvuuttaja arvuuttaja = new Arvuuttaja();

    private Arvuuttaja() {
        
    }

   public static Arvuuttaja getInstance( ) {
      return arvuuttaja;
   }
    
    public Memento liityPeliin(Asiakas asiakas) {
        double lukuD = Math.random() * 10;
        int luku = (int)lukuD;
        return new Memento(luku);
    }
    
    public void tarkistaArvaus(int arvaus, Memento memento) {
        if (arvaus == memento.annaLuku(this)) {
            System.out.println("Arvasit oikein!");
        } else {
            System.out.println("Arvasit väärin");
        }
    }
    
    
}
