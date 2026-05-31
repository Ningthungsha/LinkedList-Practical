public class QueueArray {
    int queue[] = new int[5];
    int front = 0, rear = -1;

    void enqueue(int data) {
        if (rear == 4) {
            System.out.println("Queue Full");
        } else {
            rear++;
            queue[rear] = data;
        }
    }
    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Empty");
        } else {
            System.out.println("Deleted: " + queue[front]);
            front++;
        }
    }
    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }
    public static void main(String[] args) {
        QueueArray q = new QueueArray();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();
        q.dequeue();
    }
}
