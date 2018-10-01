class LinkedList {
    private int length = 0;
    private Node first = null;
    private Node last = null;
    private class Node {
        private int item;
        private Node next;
    }
    public boolean isEmpty() {
        return first == null;
    }
    /**.
     * This method is used to push an item to the stack.
     * Time complexity is 1 as only one item is pushed into the stack at a time.     
     * @param item int.
     **/
    public void pushAtStart(final int item) {
        if (first == null) {
            first = new Node();
            first.item = item;
            first.next = null;
            last = first;
        } else {
            Node oldfirst = first;
            first = new Node();
            first.item = item;
            first.next = oldfirst;
        }
        length++;
    }
     /**
      *This method is used to push an item to the stack.
      *Time complexity is 1 as only one item is pushed into the stack at a time.
      * @param item int.
      **/
    public void pushAtEnd(final int item) {
        if (last == null || first == null) {
            pushAtStart(item);
        }   else {
            Node temp = last;
            last = new Node();
            last.item = item;
            last.next = null;
            temp.next = last;
        }
        length++;
    }
     /**
      *this is used to pop an item from the stack.
      * Time complexity is 1 as only one item is popped at a time.
      * @param item int.
      **/
    public void popAtStart() {
        if (first != null) {
            first = first.next;
            length--;
        }
    }
     /**
      * This method prints all the elements in the stack.
     * The complexity of the method is N as this method prints all the digits.
     * @param item int.
     **/
    public void displayAll() {
        if (length != 0) {
            String s = "";
            Node temp = first;
            while (temp != null) {
                s += temp.item + ", ";
                temp = temp.next;
            }
            // if(length == 1){
            //     System.out.println(s);
            // }
            System.out.println(s.substring(0, s.length() - 2));
        }
        else{
        System.out.println("Steque is empty.");
    }
    }
}