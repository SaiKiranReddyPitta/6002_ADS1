/**
 * sort method class.
 */
class SortMethod {
/**
* default unused constructor.
*/
    SortMethod() { }

/** time complexity for this method is O(N^2).
 Two for loops can iterate to a maximum of N.
 So, the complexity would be N^2 .
 This worst case could happen if array is sorted.
 **/
 /**
  * Insertion method.
  * @param arr [Comparable type array]
  * @param low [variable low]
  * @param high [variable high]
  */
    public void insertion(final Comparable[] arr, final int low,
     final int high) {
        // int i = low;
        // int j = high;
        for (int i = low; i <= high; i++) {
            for (int j = i; j > low && less(arr[j], arr[j - 1]); j--) {
                swap(arr, j, j - 1);
            }
        }
    }
// time complexity of this method is O(1).
    //Swapping method could swap elements at once.
    /**
     * @brief [brief description]
     * @details [long description]
     *
     * @param arr [Comparable type]
     * @param j [description]
     * @param min [description]
     */

    public void swap(final Comparable[] arr, final int j, final int min) {
        Comparable temp = arr[j];
        arr[j] = arr[min];
        arr[min] = temp;
    }
// time complexity of this method is O(N). It iterates through
// the array to print all the objects in array.
    /**
     * returns a String that prints,
     * according to the given format.
     * @param arr [Comparable type]
     * @return String [description]
     */
    public String toString(final Comparable[] arr) {
        // System.out.println("in print");
        String str = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            str += arr[i] + ", ";
        }
        str += arr[arr.length - 1] + "]";
        return str;
    }
// time complexity is O(log N)
    /**
     * sort method.
     * @param arr [Comparable type]
     * @param low [low]
     * @param high [high]
     * @param cutOff [here it is 7]
     */
    public void sort(final Comparable[] arr, final int low,
     final int high, final int cutOff) {
        if (high <= low + cutOff - 1) {
            insertion(arr, low, high);
            System.out.println("insertionSort called");
            return;
        }
        int k = partition(arr, low, high);
        System.out.println(toString(arr));
        sort(arr, low, k - 1, cutOff);
        sort(arr, k + 1, high, cutOff);
    }
//time complexity is O(1)
/**
 * Sort method overloaded.
 * @param array [Comparable type]
 * @param cutOff [variable]
 */
    public void sort(final Comparable[] array, final int cutOff) {
        sort(array, 0, array.length - 1, cutOff);
    }
// time complexity is O(N).
    /**
     *
     * @param arr [Comparable type]
     * @param low [description]
     * @param high [description]
     * @return int [description]
     */
    public int partition(final Comparable[] arr,
     final int low, final int high) {
        int i = low;
        int j = high + 1;
        while (true) {
            while (less(arr[++i], arr[low])) {
                if (i == high) {
                    break;
                }
            }
            while (less(arr[low], arr[--j])) {
                if (j == low) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            swap(arr, i, j);
        }
        swap(arr, low, j);
        return j;
    }
// time complexity is O(1).
//It runs once and returns bool value.
    /**
     * checks if it less or not.
     * @param a [Comparable type]
     * @param b [Comparable type]
     *
     * @return bool [description]
     */

    public boolean less(final Comparable a, final Comparable b) {
        return a.compareTo(b) < 0;
    }
}
