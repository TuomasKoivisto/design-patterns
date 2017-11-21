/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author koivi
 */
public class Toimitusjohtaja extends Handler{
    
    public Toimitusjohtaja(Handler s, Palkankorotuspyyntö palkankorotuspyyntö) {
        super(s, palkankorotuspyyntö);
    }
    @Override
    public void handle() {
        if (palkankorotuspyyntö.getKorotusProsentteina() > 5) {
                System.out.println("Toimitusjohtaja: Saat potkut! Ei tämä ole mikään Piilaakso.");
        } else if (successor != null) {
                successor.handle();
        }
    }
}
