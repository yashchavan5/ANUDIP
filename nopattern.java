/*import java.util.*;
public class hello{

    int add(int a , int b) {
        int add = a + b ;
        return add ;
    }

    
    
    public static void main(String[] args) {
        hello h = new hello();
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = h.add();
        System.out.println("this is my sum "sum);
   
        
    }
}*/




/*import java.util.Scanner;

class Product{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int product = num1 * num2;
        int sum = num1 + num2 ;
        System.out.println("Product is: " + product);
        System.out.println("Product is: " + sum);
    }
}/* */

/*class Pattern {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 4; i++) {
            
            for (int j = i; j < pyramidRows; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nSquare Pattern:");
        for (int i = 1; i <= squareSize; i++) {
            for (int j = 1; j <= squareSize; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} */

/*class Main {
   static void pattern2(int N)
{
    
    for (int i = 0; i < N; i++)
    {
         
        for (int j = 0; j <= i; j++)
        {
            System.out.print("* ");
        }

         
        System.out.println();
    }
      for (int i = 0; i < N; i++)
    {
         
        for (int j = 0; j < N; j++)
        {
            System.out.print("* ");
        }

        
        System.out.println();
    }
}

    public static void main(String[] args) {
        
       
        int N = 5;
        pattern2(N);
    }


}*/




// Square hollow pattern

/*public class hollow{
    
    
    public static void printPattern(int n)
    {
        int i, j;
        
       
        for (i = 0; i < n; i++) {
            
            
            for (j = 0; j < n; j++) {
                
                
                if (i == 0 || j == 0 || i == n - 1
                    || j == n - 1) {
                    System.out.print("*");
                }
                
                
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}*/


// inverted pyramid

/*public class hollow {

    public static void main(String[] args) {
        int n= 4;
        int m= 4;
        for (int i=1; i<=n ; i++){
            for (int j=1; j<n-1 ;j++){
                System.out.print("*");
            }
            for(int j=1; j<n;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}*/
    


/*public class nopattern {
    public static void main(String[] args) {
        int count = 1;  // Start from 1

        for(int i = 1; i <= 4; i++) {       
            for(int j = 1; j <= i; j++) {   
                System.out.print(count + " ");
                count++;  
            }
            System.out.println();  
        }
    }
}*/



// Java Program to print
// Pyramid pattern
/*import java.util.*;

public class Geeks {
    
    
    public static void printPattern(int n)
    {
        int i, j;

        
        for (i = 1; i <= n; i++) {

           
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

           
            System.out.println();
        }
    }

   
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}*/


// Java Program to print pattern
// Reverse Right Half Pyramid
/*import java.util.*;

public class Geeks {
    
    
    public static void printPattern(int n)
    {
        int i, j;

       
        for (i = n; i >= 1; i--) {

            // inner loop to handle columns
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

           
            System.out.println();
        }
    }


    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}*/


// Java Program to print pattern
// Square hollow pattern
/*import java.util.*;

public class Geeks {
    
    public static void printPattern(int n)
    {
        int i, j;
        
       
        for (i = 0; i < n; i++) {
            
            
            for (j = 0; j < n; j++) {
                
               
                if (i == 0 || j == 0 || i == n - 1
                    || j == n - 1) {
                    System.out.print("*");
                }
                
                
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

   
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}*/


