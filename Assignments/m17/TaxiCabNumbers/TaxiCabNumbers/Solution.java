import java.util.Scanner;
/**
This is the class Solution.
 */
final class Solution {
    /**
    It's a default constructor.
     */
     private Solution() {

     }
    /**
     *The Main method.
     * @param args String.
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int cases = sc.nextInt();
        final int n = 1000;
        MinPQ<CubeSum> pq = new MinPQ<CubeSum>();
        for (int i = 1; i <= n; i++) {
            pq.insert(new CubeSum(i, i));
        }

        int pair = 1;
        int nth = 0;

        CubeSum previous = new CubeSum(0, 0);
        while (!pq.isEmpty()) {
            CubeSum current = pq.delMin();
            if (current.sum == previous.sum) {
                pair++;
                if (pair == cases) {
                    nth++;
                }
                if (number == nth) {
                    System.out.println(current);
                    break;
                }
            } else {
                pair = 1;
            }

            previous = current;
            if (current.j < n) {
                pq.insert(new CubeSum(current.i, current.j + 1));
            }
        }
    }

}
