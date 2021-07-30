
package javaexample46sortingalgs;


public class SelectionSort {
    
    public static void Sort(int[] array) throws IllegalArgumentException
    {
        if(array.length==0)
            throw new IllegalArgumentException();
        
        int mPos=0;
        int e;
        for (int pos = 0; pos < array.length-1; pos++) {
            
            for (int p = pos; p < array.length; p++) {
                if(array[mPos]>array[p])
                    mPos=p;
            }// end inner-for
            
            e=array[mPos];
            array[mPos]=array[pos];
            array[pos]=e;
        }// end outer-for
    }
}
