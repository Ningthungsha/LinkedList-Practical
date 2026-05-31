public class Stackoperation {
    static int[] stack = new int[10];
    static int top = -1;

    void push(int val) {
        if (top == 9)
            System.out.println("Stack Overflow");
        else
            stack[++top] = val;
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else
            System.out.println("Popped: " + stack[top--]);
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        Stackoperation s = new Stackoperation();
        
        s.push(10);
        s.push(20);
        s.push(30);
        
        s.display();
        
        s.pop();
    }
}