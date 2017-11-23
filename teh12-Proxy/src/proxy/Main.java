/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author koivi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List <Image> images = new ArrayList();
        
        //Lisätään kansioon
        for (int i = 0;i < 10; i++) {
            final Image image = new ProxyImage("HiRes_10MB_Photo" + Integer.toString(i + 1));
            images.add(image);
            //images.get(i).showData();
        }
        
        //Tulostetaan kuvien tiedot
        images.forEach((x) -> {
            x.showData();
        });
        
        //katsellaan kuvia
        images.forEach((x) -> {
            x.displayImage();
        });
    } 
}

