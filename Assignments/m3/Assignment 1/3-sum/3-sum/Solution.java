import java.util.Scanner;
import java.util.Arrays;
/**.
 * Class for solution.
 */
final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {
        /**.
         * { item_description }
         */
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**.
         * { var_description }
         */
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        boolean ans;
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int low = j + 1;
                int high = size - 1;
                ans = search(low, high, arr, -(arr[i] + arr[j]));
                if (ans) {
                    count++;
                }

            }
        }
        System.out.println(count);
    }
    /**.
     * Searches for the first match.
     *
     * @param      l     { parameter_description }
     * @param      h     { parameter_description }
     * @param      b     { parameter_description }
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static boolean search(final int l, final int h,
        final int[] b, final int s) {
                    int middle = 0;
                    int count = 0;
                    int low = l;
                    int high = h;
                    int[] arr = b;
                    int search = s;
                    while (low <= high) {
                    middle = (low + high) / 2;
                    if (search == arr[middle]) {
                        return true;
                    } else if (arr[middle] > search) {
                        high = middle - 1;
                    } else {
                        low = middle + 1;
                    }
                }
                return false;
            }
        }
