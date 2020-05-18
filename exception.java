
// Java program to demonstrate exception is thrown 

class ExceptionThrown { 
    // This method throws the Exception(ArithmeticException). 

    static int divideByZero(int a, int b) { 
          
        // this statement will cause ArithmeticException(divide by zero) 
        int i = a/b;  
          
        return i; 
    } 
      
    // The runTime System could not find appropriate Exception handler 
    // in this method.

    static int computeDivision(int a, int b) { 
          
        int res =0; 
          
        try
        { 
          res = divideByZero(a,b); 
        } 
        // doesn't match with ArithmeticException 
        catch(NumberFormatException ex) 
        { 
           System.out.println("NumberFormatException is occured");  
        } 
        return res; 
    } 
      
    // Appropriate Exception handler is found here (catch block). 

    public static void main(String args[]) { 
          
        int a = 1; 
        int b = 0; 
          
        try
        { 
            int i = computeDivision(a,b); 
          
        } 
          
        // matching ArithmeticException 
        catch(ArithmeticException ex) 
        { 
        // message will be printed describing the exception
            System.out.println(ex.getMessage()); 
        } 
    } 
} 

