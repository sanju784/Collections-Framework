package collections;

import java.util.*;

/**
 * Program to check algorithms on ArrayList
 * @author tata
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        // ArrayList declaration
        ArrayList<String> al = new ArrayList();
        System.out.println("Initial size of al: " + al.size());
        
        //Add elements to array list.
        al.add("iPhone");
        al.add("ipad");
        al.add("iMac");
        al.add("macbook");
        al.add("appleWatch");
        //Adding element by index
        al.add(1, "iPod");
        
        System.out.println("Size of array list after add: " + al.size());
        
        //Display of arraylist.
        System.out.println("The contents of al: " + al);
        
        //Remove elements from ArrayList 1. by value 2. by index
        al.remove("macbook");
        al.remove(4);
        System.out.println("The contents of al after deletion: " + al);
        
        //getting from ArrayList to array
        String[] sa = new String[al.size()];
        sa = al.toArray(sa);
        for(String s : sa) {
            System.out.println(s);
        }
        
        //using Iterator to fetch element from ArrayList
        Iterator <String> it = al.iterator();
        System.out.println("\nPrinting element of ArrayList using Iterator");
        while(it.hasNext()) {
            System.out.print(" " + it.next());
        }
        
        System.out.println("\n\nFor-each alternative to Iterator");
        for(String s : al) {
            System.out.print(" " + s);
        }
        
        //sorting arraylist
        Collections.sort(al);
        System.out.println("\n\nThe list after sort :");
        System.out.println(al);
    }
}
