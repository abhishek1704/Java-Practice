
// Set operations in java

import java.util.*; 

public class SetOperations
{ 
    public static void main(String args[]) 
    { 
        Set<Integer> A = new HashSet<Integer>(); 
        A.addAll(Arrays.asList(new Integer[] {3, 2, 1, 0, 7, 9})); 
        
        Set<Integer> B = new HashSet<Integer>(); 
        B.addAll(Arrays.asList(new Integer[] {1, 4, 5, 6, 9, 0})); 
  
        // Union 
        Set<Integer> union = new HashSet<Integer>(A); 
        union.addAll(B); 
        System.out.print("\n1. Union of sets A & B = "); 
        System.out.println(union); 
  
        // Intersection
        Set<Integer> intersection = new HashSet<Integer>(A); 
        intersection.retainAll(B); 
        System.out.print("2. Intersection of sets A and B = "); 
        System.out.println(intersection); 
  
        // To find the symmetric difference 
        Set<Integer> difference = new HashSet<Integer>(A); 
        difference.removeAll(B); 
        System.out.print("3. Difference of sets A & B = "); 
        System.out.println(difference); 
    } 
} 

