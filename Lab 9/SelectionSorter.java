/**
 * @author Derek Campbell
 * @version 11/05/2020
 * NOTE: Taken from Big Java 6th ed.
 */

public class SelectionSorter {

    public static void sort(int[] a) {
        
        for (int i = 0; i < a.length; i++){
            int minPos = minimumPosition(a, i);
            ArrayUtil.swap(a, minPos, i);
        }
    }

    /**
     * finds the smallest elemetn in a tail range of the array.
     * @param a the array to sort.
     * @param from the first position in a to compare.
     * @return the position of the smallest element in the range from a[from] ... a[a.length-1].
     */
    public static int minimumPosition(int[] a, int from) {
       
        int minPos = from;
        for (int i = from + 1; i < a.length; i++){
            if(a[i] < a[minPos]) {
                minPos = i;
            }
        }
        return minPos;
    }
}