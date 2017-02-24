package collections;

import java.util.LinkedList;
/**
 * Linked List to store user Object in place of Generic Objects
 * 
 * @author Sanjeev
 */
public class UserCollection {
    public static void main(String[] args) {
        LinkedList<Address> m1 = new LinkedList();
        m1.add(new Address("Sanjeev", "Toshimaku", "Tokyo", "1710021"));
        m1.add(new Address("Ajeet", "Basti", "U.P.", "221002"));
        m1.add(new Address("Vivek", "Kolkata", "Bengal", "231012"));
        
        for (Address a : m1) {
            System.out.println(a + "\n");
        }
    }
}

class Address {
    private String name;
    private String city;
    private String state;
    private String code;
    Address(String n, String c, String st, String cd) {
        name = n;
        city = c;
        state = st;
        code = cd;
    }
    
    //to print Address Object
    public String toString() {
        return name + "\n" + city + " " + state + " " + code;
    }
}