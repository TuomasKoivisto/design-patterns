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
public class Päällikkö extends Handler{
    
    public Päällikkö(Handler s, Palkankorotuspyyntö palkankorotuspyyntö) {
        super(s, palkankorotuspyyntö);
    }
    
   @Override
    public void handle() {
        if (palkankorotuspyyntö.getKorotusProsentteina() > 2 && palkankorotuspyyntö.getKorotusProsentteina() <= 5) {
                System.out.println("Päällikkö: Hyvä yritys!");
        } else if (successor != null) {
                successor.handle();
        }
    }
    
}
