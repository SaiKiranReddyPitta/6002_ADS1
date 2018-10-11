import java.util.Scanner;
/**
 *This Class is for solution.
 */
final class Solution {
    /**
     *This Constructs the object.
     */
    private Solution() { }
    /**
     * The time complexity for the main method is O(n).
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        Binarysearchtree<String, Integer> bs = new Binarysearchtree<String, Integer>();
        while (sc.hasNextLine()) {
            String st = sc.nextLine();
            String[] tokens = st.split(",");
            Book b = new Book(tokens[1], tokens[2],
                Float.parseFloat(tokens[2 + 1]));
            switch (tokens[0]) {
                case "put":
                bs.put(b, Integer.parseInt(tokens[2 + 2]));
                break;
                case "get":
                System.out.println(bs.get(b));
                break;
                default:
                break;
            }
        }
    }
}