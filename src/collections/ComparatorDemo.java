package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        //Creating a list
        List<Integer> ls = new ArrayList<>();
        
        //Add elements to list
        ls.add(305);
        ls.add(902);
        ls.add(500);
        ls.add(709);
        ls.add(606);
        
        //creating a comparator object to sort vaues as desired
        Comparator<Integer> comp = new MyComp();
        Collections.sort(ls, comp);
        System.out.println(ls);
    }
}

class MyComp implements Comparator<Integer> {
    //defining a comparator method to sort numbers by last digits
    public int compare(Integer a, Integer b) {
        if(a%10 > b%10)
            return 1;
        return -1;
    }
}