
package javaexample46sortingalgs;

import java.util.Arrays;


public class JavaExample46SortingAlgs {

    
    public static void main(String[] args) {
        
        int[] a=new int[] {2,5,3,1,6,9,0,4,7,8};
        int[] b=new int[] {2,5,3,1,6,9,0,4,7,8};
        int[] c=new int[] {2,5,3,1,6,9,0,4,7,8};
        
        System.out.print("The array is: "); PrintArray(a);
        SelectionSort.Sort(a);
        System.out.print("The array (selection sort) is: "); PrintArray(a);
        
        System.out.println();
        System.out.println();
        
        System.out.print("The array is: "); PrintArray(b);
        InsertionSort.Sort(b);
        System.out.print("The array (insertion sort) is: "); PrintArray(b);
        
        System.out.println();
        System.out.println();
        
        System.out.print("The array is: "); PrintArray(c);
        InsertionSortAnotherWay.mySort(c);
        System.out.print("The array (insertion sort) is: "); PrintArray(c);
        
        
        
        
    }
    private static void PrintArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    
}
