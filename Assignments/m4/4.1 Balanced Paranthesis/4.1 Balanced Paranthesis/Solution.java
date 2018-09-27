import java.util.Scanner;
/**.
 * Class for linked list stack of strings.
 */
class LinkedListStackOfStrings {
    /**.
     * { var_description }
     */

    /**.
     * { var_description }
     */
    private Node first = null;
    /**.
     * Class for node.
     */
    private class Node {
        /**.
         * { var_description }
         */
        private char item;
        /**.
         * { var_description }
         */
        private Node nextAddress;
        /**.
         * { item_description }
         */
    }

    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public char top() {
        /**.
         * { item_description }
         */
        return first.item;
    }

    /**.
     * Determines if empty.
     *
     * @return     True if empty, False otherwise.
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**.
     * { function_description }
     *
     * @param      item  The item
     */
    public void push(final char item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.nextAddress = oldfirst;
    }

    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public char pop() {
        char item = first.item;
        first = first.nextAddress;
        return item;
    }
}

/**.
 * . . Class for solution.
 */
final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {
        /**.
         * { item_description }
         */
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
         * { item_description }
         */
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < size; i++) {
            String line = sc.next();
            if (checkingTheParanthesis(line)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    /**.
     * { function_description }
     *
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static boolean checkingTheParanthesis(final String s) {
        /**.
         * { var_description }
         */
        LinkedListStackOfStrings obj = new LinkedListStackOfStrings();
        int sLength = s.length();
        for (int i = 0; i < sLength; i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                obj.push(ch);
            } else {
                if (obj.isEmpty()) {
                    return false;
                }
                if (ch == '}' && obj.top() == '{') {
                obj.pop();
            } else if (ch == ']' && obj.top() == '[') {
                obj.pop();
            } else if (ch == ')' && obj.top() == '(') {
                obj.pop();
            } else {
            return false;
        }
    }

    }
    return obj.isEmpty();
    }
}
