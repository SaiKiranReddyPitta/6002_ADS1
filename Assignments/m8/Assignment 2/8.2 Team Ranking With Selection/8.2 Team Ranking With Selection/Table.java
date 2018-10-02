/**.
 * Class for table.
 */
public class Table {
    /**.
     * Constructs the object.
     */
    public Table() {

    }
    /**.
     * It's a Selection Sort function for an array.
     * The complexity for the big Oh is N^2.
     * The complexity for omega is N^2.
     * @param      array  The array
     * @param      size   The size
     */
    public void Sort(Comparable[] array, int size) {
        int n = size;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (less(array, i, j)) {
                    swap(array, j, min);
                }
            }
        }
    }
    /**.
     *It Finds the lower value.
     *
     * @param      arr   The arr
     * @param      ind1  The ind 1
     * @param      ind2  The ind 2
     *
     * @return     { description_of_the_return_value }
     */
    public boolean less(Comparable[] arr, int ind1, int ind2) {
        return arr[ind1].compareTo(arr[ind2]) < 0;
    }
    /**.
     *It Swaps the values in the array.
     *
     * @param      a     { parameter_description }
     * @param      ind1  The ind 1
     * @param      ind2  The ind 2
     */
    public void swap(Comparable[] a, int ind1, int ind2) {
        Comparable temp = a[ind1];
        a[ind1] = a[ind2];
        a[ind2] = temp;
    }
    /**.
     *It finds the Leaderboard and returns leaderboard string.
     *
     * @param      array  The array
     * @param      size   The size
     *
     * @return     { description_of_the_return_value }
     */
    public String leaderboard(Comparable[] array, int size) {
        Sort(array, size);
        String s = "";
        for (int i = 0; i < size; i++) {
            s += array[i].toString() + ",";
        }
        return s.substring(0, s.length() - 1);
    }
}