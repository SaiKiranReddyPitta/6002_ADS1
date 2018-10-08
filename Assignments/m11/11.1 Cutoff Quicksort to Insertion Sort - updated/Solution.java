import java.util.Scanner;
/**
 * Solution class.
 */
public final class Solution {
    /**
     * default private and unused constructor.
     */
    private Solution() { }
    /**
     *main method.
     *complexity is N because of presence of one for loop.
     * @param args [description]
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        SortMethod sort = new SortMethod();
        int testcases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testcases; i++) {
            int j = Integer.parseInt(sc.nextLine());
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            if (tokens[0].equals("")) {
                System.out.println("[]");
            } else {
                sort.sort(tokens, j);
                System.out.println(sort.toString(tokens));
            }
        }
    }
}
