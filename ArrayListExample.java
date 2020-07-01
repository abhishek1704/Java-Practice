
// Java program for working of ArrayList in Java 
  
import java.io.*; 
import java.util.*; 
  
class ArrayListExample { 
    public static void main(String[] args) 
    { 
        int n = 5; 
  
        // Declaring the ArrayList with 
        // initial size n 
        ArrayList<Integer> list 
            = new ArrayList<Integer>(n); 
  
        // Appending new elements at 
        // the end of the list 
        for (int i = 1; i <= n; i++) 
            list.add(i); 
  
        // Printing elements 
        System.out.println(list); 
  
        // Remove element at index 3 
        list.remove(3); 
  
        // Displaying the ArrayList 
        // after deletion 
        System.out.println(list); 
  
        // Printing elements one by one 
        for (int i = 0; i < list.size(); i++) 
            System.out.print(list.get(i) + " "); 
    } 
} 

