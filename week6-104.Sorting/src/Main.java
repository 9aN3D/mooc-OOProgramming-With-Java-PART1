
import java.util.Arrays;


public class Main {
    public static int smallest(int[] array) {
        int min = array[0];
        for(int i = 1; i < array.length; ++i){
            if ( min > array[i]) {
                min = array[i];
            } 
        }
        return min;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int index = 0;
        int min = array[0];
        for(int i = 1; i < array.length; ++i){
            if ( min > array[i]) {
                min = array[i];
                index = i;
            } 
        }
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int min = array[index];
        for (int i = index; i < array.length; ++i) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int swap1;
        int swap2;

        swap1 = array[index2];
        swap2 = array[index1];

        array[index1] = swap1;
        array[index2] = swap2;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.println(Arrays.toString(array));
            int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallestIndex);
        }
    }
    
    public static void main(String[] args) {
        // write testcode here
        int[] values = {6, 5, 8, -1, 11};
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
        
        System.out.println("smallest: " + smallest(values));
        
               
    }

}
