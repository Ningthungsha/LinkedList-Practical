class DNode {

    int data;
    DNode next, prev;

    DNode(int data) {
        this.data = data;
    }
}

public class CircularDoubly {

    DNode head = null;
    DNode tail = null;

    void insert(int data) {

        DNode newNode = new DNode(data);

        if(head == null) {
            head = tail = newNode;

            head.next = head;
            head.prev = head;
        }
        else {

            tail.next = newNode;
            newNode.prev = tail;

            newNode.next = head;
            head.prev = newNode;

            tail = newNode;
        }
    }

    void display() {

        DNode temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        while(temp != head);
    }

    public static void main(String[] args) {

        CircularDoubly c = new CircularDoubly();

        c.insert(20);
        c.insert(25);
        c.insert(35);

        c.display();
    }
}