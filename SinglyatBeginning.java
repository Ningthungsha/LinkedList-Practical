class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class SinglyatBeginning {
    Node head = null;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void display() {
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SinglyatBeginning list = new SinglyatBeginning();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.display(); 
    }
}