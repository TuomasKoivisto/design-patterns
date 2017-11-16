/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author koivi
 */
public class Strategy2 implements ListConverter{

    @Override
    public String listToString(List list) {
        Iterator iterator = list.iterator();
        String[] lista = new String[5];
        int i = 0;
        while(iterator.hasNext()) {
            if (i == 1 || i % 2 == 1) {
                lista[i] = iterator.next() + "\n";
                
            }else {
                lista[i] = (String)iterator.next();
            } 
            i++;
        }
        String listaString = Arrays.toString(lista);
        return listaString.replace(",", "");
    }
    
}
