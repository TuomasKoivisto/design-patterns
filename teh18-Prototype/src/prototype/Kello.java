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
public class Kello {
    private TuntiViisari tuntiViisari;
    private MinuuttiViisari minuuttiViisari;
    private SekuntiViisari sekuntiViisari;
    boolean käynnissä;
    int sekunnit;
    
    public Kello (TuntiViisari tuntiViisari, MinuuttiViisari minuuttiViisari, SekuntiViisari sekuntiViisari) {
        this.tuntiViisari = tuntiViisari;
        this.minuuttiViisari = minuuttiViisari;
        this.sekuntiViisari = sekuntiViisari;
        käynnissä = true;
        sekunnit = 0;
        käynnistäkello();
    }
    public Kello(Kello another) {
        this.tuntiViisari = another.tuntiViisari;
        this.minuuttiViisari = another.minuuttiViisari;
        this.sekuntiViisari = another.sekuntiViisari;
        käynnissä = true;
        sekunnit = 0;
        käynnistäkello();  
  }

    private void käynnistäkello() {
        while (käynnissä == true) {
            try {
                sekunnit++;
                sekuntiViisari.sekunti();
                if (sekuntiViisari.getLukema() == 0) {
                    minuuttiViisari.minuutti();
                    if (minuuttiViisari.getLukema() == 0) {
                        tuntiViisari.tunti();
                    }
                }
                System.out.println(tuntiViisari.getLukema() + ":" + minuuttiViisari.getLukema() + ":" + sekuntiViisari.getLukema());
                Thread.sleep(1000);
            }   catch (InterruptedException ex) {
                Logger.getLogger(Kello.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
    
    
}
