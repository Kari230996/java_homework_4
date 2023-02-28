import java.util.Arrays;

/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
 * вернет “перевернутый” список.
 */
public class task1 {
    public static void main(String[] args) {
        int[] array = { 3, 5, 2, 6, 3, 7, 4, 11, 8 };
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    private static void mergeSort(int[] array, int begin, int end) {
        if (begin == end)
            return;

        int mid = (begin + end) / 2;

        mergeSort(array, begin, mid);
        mergeSort(array, mid + 1, end);

        int[] sorted = new int[array.length];
        int inLeft = begin, inRight = mid + 1, inSorted = begin;
        int endLeft = mid + 1, endRight = end + 1;

        while (inLeft < endLeft || inRight < endRight) {
            if (inLeft < endLeft && inRight < endRight) {
                if (array[inLeft] < array[inRight]) 
                    sorted[inSorted++] = array[inLeft++];
                 
                else 
                    sorted[inSorted++] = array[inRight++];
                
            }   
            else if (inLeft < endLeft)
                sorted[inSorted++] = array[inLeft++];
            else if (inRight < endRight) 
                sorted[inSorted++] = array[inRight++];
            
            else 
                throw new IllegalStateException("It's not possible to land here");
        }    
                
        
        for (int i = begin; i < end; i++) 
            array[i] = sorted[i];
        
    }
}
