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
public class Lähiesimies extends Handler{

    public Lähiesimies(Handler s, Palkankorotuspyyntö palkankorotuspyyntö) {
        super(s, palkankorotuspyyntö);
    }

    

    @Override
    public void handle() {
        if (palkankorotuspyyntö.getKorotusProsentteina() <= 2) {
                System.out.println("Lähiesimies: Ei tipu!");
        } else if (successor != null) {
                successor.handle();
        }
    }
}
