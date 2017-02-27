package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap();
        hm.put("Sanjeev", 27);
        hm.put("Pinky", 25);
        hm.put("Deepa", 29);
        
        Set<Map.Entry<String, Integer>> set = hm.entrySet();
        
        //Printing HashMap values 
        //1. using for loop
        for(Map.Entry<String, Integer> me : set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }
        
        //2. Using iterator
        System.out.println("\nPrint using Iterator.");
        Iterator<Entry<String, Integer>> it = set.iterator();
        while(it.hasNext()) {
            Map.Entry<String, Integer> me = (Map.Entry<String, Integer>)it.next();
            System.out.println(me.getKey() + ": " + me.getValue());
        }
        Integer age = hm.get("Sanjeev");
        hm.put("Sanjeev", age + 1);
        System.out.println("Sanjeev new age is " + hm.get("Sanjeev"));
    }
}
