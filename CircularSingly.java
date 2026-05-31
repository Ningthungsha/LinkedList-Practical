class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class CircularSingly {

    Node head = null;
    Node tail = null;

    void insert(int data) {

        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            tail.next = head;
        }
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    void display() {

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        while(temp != head);
    }

    public static void main(String[] args) {

        CircularSingly c = new CircularSingly();

        c.insert(10);
        c.insert(20);
        c.insert(30);

        c.display();
    }
}