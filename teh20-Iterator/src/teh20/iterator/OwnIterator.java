package teh20.iterator;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OwnIterator extends Thread{

    @Override
    public void run() {
        Members members = Members.getInstance();
        Iterator iterator = members.createIterator();
        while (iterator.hasNext()) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(OwnIterator.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(iterator.next());
        }
    }
    
    public static void main(String[] args) {
        
        OwnIterator thread1 = new OwnIterator();
        OwnIterator thread2 = new OwnIterator();
        
        thread1.start();
        thread2.start();
    }
}
