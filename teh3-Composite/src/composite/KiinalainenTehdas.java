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
public class KiinalainenTehdas implements AbstractFactory{

    @Override
    public Kotelo luoKomponentit() {
        Kotelo kotelo = new Kotelo(10, new Emolevy(new Prosessori(100), new Näytönohjain(100), 
            new Verkkokortti(5), new Muistipiiri(50)));
        return kotelo;
    }
    
}
