class DNode {

    int data;
    DNode prev, next;

    DNode(int data) {
        this.data = data;
    }
}

public class DoublyDelete {

    DNode head;

    void insert(int data) {

        DNode newNode = new DNode(data);

        if(head == null) {
            head = newNode;
        } else {

            DNode temp = head;

            while(temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    void deleteEnd() {

        DNode temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    void display() {

        DNode temp = head;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        DoublyDelete d = new DoublyDelete();

        d.insert(15);
        d.insert(20);
        d.insert(40);
        d.insert(45);

        d.deleteEnd();

        d.display();
    }
}