
import java.util.Scanner;

/**
 * Solution class.
 */
final class Solution {

    /**
     * Constructs the object.
     */
    private Solution() {

    }

    /**
     * main method takes input from client.
     * calls appropriate func.
     * prints output to console.
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        Scanner scan = new Scanner(System.in);
BinarySearchTree<Book, String> bst = new BinarySearchTree<Book, String>();
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(", ");
            switch (tokens[0]) {
            case "put":
                bst.put(new Book(tokens[1], tokens[2], tokens[2 + 1]),
                    tokens[2 + 2]);
                break;
            case "get":
                System.out.println(
                    bst.get(new Book(tokens[1], tokens[2], tokens[2 + 1])));
                break;
            case "max":
                System.out.println(bst.max());
                break;
            case "min":
                System.out.println(bst.min());
                break;
            case "select":
                System.out.println(bst.select(Integer.parseInt(tokens[1])));
                break;
            case "floor":
                System.out.println(
                    bst.floor(new Book(tokens[1], tokens[2], tokens[2 + 1])));
                break;
            case "ceiling":
                System.out.println(
                    bst.ceiling(new Book(tokens[1], tokens[2], tokens[2 + 1])));
                break;
            case "deleteMax":
            bst.deleteMax();
            break;
            case "deleteMin":
            bst.deleteMin();
            break;
            case "delete":
            bst.delete(new Book(tokens[1], tokens[2], tokens[2 + 1]));
            break;
            default:
                System.out.println("default call");
            }
        }
    }
}
