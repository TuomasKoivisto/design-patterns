/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author koivi
 */
public class Main {

     
    
    
    public static void main(String[] args) {
        
        Jasper jasper = new Jasper(new AdidasFactory());
        jasper.pueVaatteet();
        jasper.esitteleVaatteet();
        
        jasper = new Jasper(new BossFactory());
        jasper.pueVaatteet();
        jasper.esitteleVaatteet();
    }
    
}
