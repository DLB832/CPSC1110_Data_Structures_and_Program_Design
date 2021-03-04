/**
 * @author Derek Campbell
 * @version 11/05/2020
 * NOTE: Taken from Big Java 6th ed.
 */

public class MergeSorter {

    /**
     * Sorts an array using the merge sort style.
     * @param a the array to sort.
     */
    public static void sort(int[] a) {

        if (a.length <= 1){
            return;
        }

        int[] first = new int[a.length / 2];
        int[] second = new int[a.length - first.length];

        //copies the first half of array a into first, and the second half of array a into second.
        for (int i = 0; i < first.length; i++){
            first[i] = a[i];
        }

        for (int i = 0; i < second.length; i++){
            second[i] = a[first.length + i];
        }
        sort(first);
        sort(second);
        merge(first, second, a);
    }

    /**
     * merges two sorted arrays into a single array.
     * @param first the first sorted array.
     * @param second the second sorteed array.
     * @param a the array into which to merge first and second.
     */
    public static void merge(int[] first, int[] second, int[] a) {
        
        int iFirst = 0; //next element to consider in the first array.
        int iSecond = 0;    // next element to consider in the second array.
        int j = 0;  //next open position in a.

        //as long as neither iFrist or iSecond past the end, move the smaller element into a.
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]){
                a[j] = first[iFirst];
                iFirst++;
            } else {
                a[j] = second[iSecond];
                iSecond++;

            }
            j++;
        }

        //NOTE: only one of the two loops below copies entries.
        //copy any remaining entries of the first half.
        while (iFirst < first.length) {
            a[j] = first[iFirst];
            iFirst++;
            j++;
        }

        //Copy any remaininf entries of the second half.
        while (iSecond < second.length) {
            a[j] = second[iSecond];
            iSecond++;
            j++;
        }

    }
    
}
