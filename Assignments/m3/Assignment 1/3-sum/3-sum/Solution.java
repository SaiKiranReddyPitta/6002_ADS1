import java.util.Scanner;
import java.util.Arrays;

class Solution {

    private Solution() { 
    }
    public static void main( String[] args) {
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

    public static boolean search(int l, int h,
        int[] b, int s) {
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
                return false ; 
            }
        }
