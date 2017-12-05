/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author koivi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kello kello = new Kello(new TuntiViisari(2),new MinuuttiViisari(2),new SekuntiViisari(2));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        Kello kello2 = new Kello(new Kello(new TuntiViisari(10),new MinuuttiViisari(10),new SekuntiViisari(10)));
        
    }
}
