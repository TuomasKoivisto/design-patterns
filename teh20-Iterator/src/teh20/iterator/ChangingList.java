package teh20.iterator;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChangingList extends Thread{
    
    @Override
    public void run() {
        Members members = Members.getInstance();
        Iterator iterator = members.createIterator();
        while (iterator.hasNext()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(OwnIterator.class.getName()).log(Level.SEVERE, null, ex);
            }
            members.removeMember();
            System.out.println(iterator.next());
        }
    }
    
    public static void main(String[] args) {
        
        ChangingList thread1 = new ChangingList();
        ChangingList thread2 = new ChangingList();
        
        thread1.start();
        thread2.start();
    }
}
