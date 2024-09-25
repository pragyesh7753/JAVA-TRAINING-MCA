public class LinkedList {

    public static void main(String args[]) {

        Node head = new Node(1);
        Node temp = head;
        int data = 2;
        int n = 50;

        while (n-- > 0) {
            Node newBlock = new Node();
            temp.next = newBlock;
            temp = temp.next;

        }

        System.out.println("Program run Successfully");
    }

}

class Node {
    int data;
    Node next;

    Node() {
    }

    Node(int value) {
        this.data = value;
        this.next = null;
    }
}