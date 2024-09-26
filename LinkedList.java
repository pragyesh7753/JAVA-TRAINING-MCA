class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Node head;

    public LinkedList() {
        head = null;
    }

    public Node addNode(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        return head;
    }

    public int count() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean search(int x){
        Node temp = head;
        while(temp != null){
            if(temp.data == x){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.addNode(0);
        obj.display();
        for (int i = 1; i < 100; i += 5) {
            obj.addNode(i);
            obj.display();
        }
        System.out.println(obj.count());
        System.out.println(obj.search(16
        ));
    }
}
