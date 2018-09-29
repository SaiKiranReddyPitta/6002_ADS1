class Stack {
    Node first = null;
    int size = 0;

    class Node {
        int num;
        Node nextaddress;
        Node(int num) {
            this.num = num;
        }
    }
    
    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        Node nextnode = new Node(element);
        nextnode.nextaddress = first;
        first = nextnode;
        size++;
    }

    public int pop() {
        int item = first.num;
        first = first.nextaddress;
        size--;
        return item;
    }

    public void printList() {
        Node n = first;
        while (n != null) {
            System.out.print(n.num + " ");
            n = n.nextaddress;
        }
    }
}