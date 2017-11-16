/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author koivi
 */
public class Strategy1 implements ListConverter{

    @Override
    public String listToString(List list) {
        String listString = String.join("\n", list);
        return listString;
    }
    
}
