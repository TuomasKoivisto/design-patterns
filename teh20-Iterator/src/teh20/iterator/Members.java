package teh20.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Members {
    
    private static Members members = new Members();
    
    private ArrayList<String> list = new ArrayList();
    
    private static Iterator singletonIterator;
    
    private Members() {
        list.add("Veli-Pekka");
        list.add("Tytti-Irmeli");
        list.add("Gunnar");
        list.add("Tuulikki");
        singletonIterator = list.iterator();
    }
    
    public static Members getInstance( ) {
      return members;
   }
    
    public Iterator createIterator() {
        return list.iterator();
}
    public Iterator singletonIterator() {
        return singletonIterator;
    }
    
    public void addMember(String name) {
        list.add(name);
    }
    
    public void removeMember() {
        if (list.size() > 0) {
           list.remove(0); 
        }
        
    }

}
