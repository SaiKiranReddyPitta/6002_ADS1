import java.util.Scanner;
/**.
 * solution class.
 */
public final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {
        //unused.
    }
    /**.
     * main method.
     * @param args  The arguments
     */
    // while loop iterates until it has next line i.e N times.
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        while (sc.hasNext()) {
            String lines = sc.nextLine();
            String[] method = lines.split(",");
            switch (method[0]) {
            case"put":
                bst.put(new Book(method[1], method[2],
                        Float.parseFloat(method[2 + 1])),
                        Integer.parseInt(method[2 + 2]));
                break;
            case"get":
                System.out.println(bst.get(new Book(method[1],
                    method[2],
                  Float.parseFloat(method[2 + 1]))));
                break;
            case"max":
                System.out.println(bst.max());
                break;
            case"min":
                System.out.println(bst.min());
                break;
            case"floor":
    System.out.println(bst.floor(new Book(method[1], method[2],
                                Float.parseFloat(method[2 + 1]))));
                break;
            case"ceiling":
    System.out.println(bst.ceil(new Book(method[1], method[2],
                                 Float.parseFloat(method[2 + 1]))));
                break;
            case"select":
    System.out.println(bst.select(Integer.parseInt(method[1])));
                break;
            default:
                break;
            }
        }
    }
}
