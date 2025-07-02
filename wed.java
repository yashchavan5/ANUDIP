// Wednesday   package , array 
package Program_Java;

public class Student {

    public static void main(String[] args) {
        int [] arry = new int [5] ;
       
    for (int i =0 ;i<arry.length; i++){
        System.out.println(arry[i]);
       
    }
    }
}


// 2d array 
public class TwoDArrayDemo {

    public static void main(String[] args) {
        // create a 3x3 2D array
        int[][] arr = new int[3][3];

        // fill the array with sample values (for example: i+j)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j;  // or any logic you like
            }
        }

        // print the 2D array
        System.out.println("2D array is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  // new line after each row
        }
    }
}
