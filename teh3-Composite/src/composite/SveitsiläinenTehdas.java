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
public class SveitsiläinenTehdas implements AbstractFactory{

    @Override
    public Kotelo luoKomponentit() {
        Kotelo kotelo = new Kotelo(100, new Emolevy(new Prosessori(400), new Näytönohjain(600), 
            new Verkkokortti(50), new Muistipiiri(400)));
        return kotelo;
    }
    
}
