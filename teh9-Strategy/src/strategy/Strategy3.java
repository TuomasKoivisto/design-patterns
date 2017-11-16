/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author koivi
 */
public class Strategy3 implements ListConverter{

    @Override
    public String listToString(List list) {
        String[] lista = new String[5];
        for (int i = 0; i < list.size(); i++) {
            if (i == 2 || i % 3 == 2) {
                lista[i] = list.get(i) + "\n";
            } else {
                lista[i] = (String) list.get(i);
            }
        }
        String listaString = Arrays.toString(lista);
        return listaString.replace(",", "");
    }
    
}
