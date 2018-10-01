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

    public void popAtStart() {
        if (first != null) {
            first = first.next;
            length--;
        }
    }

    public void popAtEnd() {
        if (last != null) {
            Node temp = first;
            while (temp.next.next != null) {

                temp = temp.next;
            }
            temp.next = null;
            last = temp;
            length--;
        }
    }

    public int top() {
        return first.item;
    }
    public int size() {
        return length;
    }

    public void displayAll() {
        if (length != 0) {
            String s = "";
            Node temp = first;
            while (temp != null) {
                s += temp.item + ", ";
                temp = temp.next;
            }

            System.out.println(s.substring(0, s.length() - 2));
        }
        else{
        System.out.println("Steque is empty.");
    }
    }
}