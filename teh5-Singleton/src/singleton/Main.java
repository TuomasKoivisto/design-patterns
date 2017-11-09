/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author koivi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JuojaInterface beduiini1 = new Beduiini();
        JuojaInterface beduiini2 = new Beduiini();
        beduiini1.juo();
        beduiini2.juo();
        beduiini1.juo();
        
        
    }
    
}
