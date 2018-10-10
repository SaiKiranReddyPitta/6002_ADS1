import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //constructor.
    }
    /**
     * { main function }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] keys = sc.nextLine().split(" ");
        BinarySearchSymbolTable s = new BinarySearchSymbolTable(
            keys.length);
        for (int i = 0; i < keys.length; i++) {
            s.put(keys[i], i);
        }
        while (sc.hasNext()) {
            String[] input = sc.nextLine().split(" ");
            switch (input[0]) {
            case "max":
            System.out.println(s.max());
            break;
            case "floor":
            System.out.println(s.floor(input[1]));
            break;
            case "contains":
            System.out.println(s.contains(input[1]));
            break;
            case "get":
            System.out.println(s.get(input[1]));
            break;
            case "keys":
            s.keys();
            break;
            case "rank":
            System.out.println(s.rank(input[1]));
            break;
            case "deleteMin":
            s.deleteMin();
            default:
            break;
            }
        }
    }
}
