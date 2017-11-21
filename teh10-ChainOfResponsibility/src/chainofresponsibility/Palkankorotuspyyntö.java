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
public class Palkankorotuspyyntö {
    private double korotusProsentteina;
    private Handler handler;
    
    public Palkankorotuspyyntö(double korotusProsentteina) {
        this.korotusProsentteina = korotusProsentteina;
        this.handler = new Lähiesimies(new Päällikkö(new Toimitusjohtaja(null,this),this),this);
    }
    
    public void käsittelyyn() {
        handler.handle();
    }

    public double getKorotusProsentteina() {
        return korotusProsentteina;
    }
    
    
}
