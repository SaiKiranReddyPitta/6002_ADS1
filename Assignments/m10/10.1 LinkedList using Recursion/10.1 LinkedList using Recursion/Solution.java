import java.util.Scanner;
/**
 * List of linkends.
 */
class LinkedList {
  /**
   * Class for Node.
   */
  private class Node {
    /**
     *It's a variable value.
     */
    private int value;
    /**
     *It's a variable next.
     */
    private Node next;
    /**
     * Constructs the object.
     */
    Node() {

    }
    /**
     * Constructs the object.
     *
     * @param      data  The value
     */
    Node(final int data) {
      this.value = data;
      this.next = next;
    }
  }
  /**
   * varaible head.
   */
  private Node head;
  /**
   * variable tail.
   */
  private Node tail;
  /**
   * variable size.
   */
  private int size;
  /**
   * Constructs the object.
   */
  LinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }
  /**
   * This function is used to insert given value at given index.
   * The Complexity of this function is O(N)
   * as it is a reccursive function.
   *
   * @param      index      The index
   * @param      value      The value
   *
   * @throws     Exception  throws exception if index is not valid.
   */
  public void insertAt(final int index, final int value) throws Exception {

    if (index < 0 || index > size) {
      throw new Exception("Can't insert at this position.");
    }
    head = insertAt(head, new Node(value), index, 0);
    size++;
  }
  /**
   * This is a overloaded method.
   * Complexity of this function is O(N) as
   * it is a reccursive function.
   * @param      curr       The curr
   * @param      newNode    The newNode
   * @param      index      The index
   * @param      currIndex  The currIndex
   *
   * @return     returns a node to its overloaded method.
   */
  private Node insertAt(final Node curr,
                        final Node newNode,
                        final int index, final int currIndex) {
    if (curr == null) {
      return newNode;
    } else if (currIndex == index) {
      newNode.next = curr;
      return newNode;
    }

    curr.next = insertAt(curr.next, newNode, index, currIndex + 1);
    return curr;

  }
  /**
   * this method reverses the present linked list.
   * Time complexity for this method is O(N).
   * @throws     Exception  it throws no element to reverse exception.
   */
  public void reverse() throws Exception {
    if (size == 0) {
      throw new Exception("No elements to reverse.");
    }
    reverse(head, null);

  }
  /**
   * Overloaded method for reverse.
   * @param      curr  The curr
   * @param      prev  The previous
   *
   * @return     returns the Node.
   */
  private Node reverse(final Node curr, final Node prev) {



    if (curr.next == null) {
      head = curr;
      head.next = prev;
      return null;
    }

    Node temp = curr.next;
    curr.next = prev;

    reverse(temp, curr);
    return head;
  }
  /**
   * prints the linked list.
   */
  public void display() {
    Node curr = head;
    String result = "";
    while (curr != null) {
      if (curr.next == null) {
        result += curr.value;
      } else {
        result += curr.value + ", ";
      }
      curr = curr.next;
    }

    System.out.println(result);
  }
}
/**
 * Class for solution.
 */
public final class Solution {
  /**
   * Constructs the object.
   */
  private Solution() {

  }
  /**
   * Main method to handle input, output and switch cases.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    LinkedList object = new LinkedList();
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      String[] tokens = sc.nextLine().split(" ");
      try {
        switch (tokens[0]) {

        case "insertAt" :
          object.insertAt(Integer.parseInt(tokens[1]),
                          Integer.parseInt(tokens[2]));
          object.display();
          // } catch (Exception e) {
          //   System.out.println(e.getMessage());
          break;
        case "reverse":
          // try {
          object.reverse();
          object.display();
          break;
        default:
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());

      }

    }
  }
}