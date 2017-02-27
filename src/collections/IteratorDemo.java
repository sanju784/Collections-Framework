package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class IteratorDemo {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList();
        animals.add("dog");
        animals.add("fox");
        animals.add("cat");
        animals.add("owl");
        
        Iterator<String> it = animals.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
        Vector<Integer> v = new Vector();
        for(int i = 0; i < 10; i++) {
            double val = Math.random()*100;
            v.add((int)val);
        }
        
        for(int i : v)
            System.out.print(i + " ");
        Iterator<Integer> itr = v.iterator();
        while(itr.hasNext()) {
            int num = itr.next();
            if(num % 2 == 0)
                itr.remove();
        }
        System.out.println("");
        for(int i : v)
            System.out.print(i + " ");
        System.out.println("");
    }
}
