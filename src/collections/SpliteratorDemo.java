package collections;

import java.util.*;

public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> al = new ArrayList();
        al.add(1.0);
        al.add(2.0);
        al.add(3.0);
        al.add(4.0);
        al.add(5.0);
        
        //using tryAdvance() to display contents of al
        System.out.println("Contents of ArrayList al :");
        Spliterator<Double> spltitr = al.spliterator();
        while(spltitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();
        
        //create new list that contains square roots.
        spltitr = al.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while(spltitr.tryAdvance(n -> sqrs.add(Math.sqrt(n))));
        
        //using forEachRemaining() to display contents of ArrayList
        System.out.println("Contents of ArrayList sqrs :");
        spltitr = sqrs.spliterator();
        spltitr.forEachRemaining(n -> System.out.println(n));
        System.out.println();
    }
}
