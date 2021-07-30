
package javaexample46sortingalgs;


public class InsertionSort {
    
    
    
    public static void Sort(int[] array) throws IllegalArgumentException
    {
        if(array.length==0)
            throw new IllegalArgumentException();
        
        
        int extraPlace=0;
        int holePos=0;
        
        for (int pos = 1; pos < array.length; pos++) {
            
            extraPlace=array[pos];
            holePos=pos;
            
            while (holePos>0 && extraPlace<array[holePos-1]) {                
                array[holePos]=array[holePos-1];
                holePos--;
            }// end while
            array[holePos]=extraPlace;
        }// end for
    }
}
