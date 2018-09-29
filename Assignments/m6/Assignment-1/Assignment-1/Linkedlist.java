class LinkedList {
    Node first = null;
    Node last = null;
    int size = 0;
    class Node {
        String element;
        Node nextaddress;
        Node (String element) {
            this.element = element;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(String element) {
        Node nextnode = new Node(element);
        if (isEmpty()) {
            first = nextnode;
            last = first;
            last.nextaddress = null;
            size++;
            return;
        }
        Node oldlast = last;
        last = nextnode;
        oldlast.nextaddress = last;
        last.nextaddress = null;
        size++;

    }

    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String item = first.element;
        first = first.nextaddress;
        size--;
        return item;
    }

    public void printList() {
        Node n = first;
        while (n != null) {
            System.out.print(n.element + " ");
            n = n.nextaddress;
        }
        System.out.println();
    }
}