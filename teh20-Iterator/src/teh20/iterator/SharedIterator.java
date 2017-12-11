/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teh20.iterator;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author koivi
 */
public class SharedIterator extends Thread{
    
    @Override
    public void run() {
        Members members = Members.getInstance();
        Iterator iterator = members.singletonIterator();
        while (iterator.hasNext()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(OwnIterator.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(iterator.next());
        }
    }
    
    public static void main(String[] args) {
        
        SharedIterator thread1 = new SharedIterator();
        SharedIterator thread2= new SharedIterator();
        
        thread1.start();
        thread2.start();
        
    }
}
