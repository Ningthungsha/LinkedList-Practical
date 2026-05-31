import java.util.Scanner;

public class ArrayOperations {
    static int[] arr = new int[10];
    static int n = 0;

    static void insert(int pos, int val) {
        for (int i = n; i > pos; i--)
            arr[i] = arr[i - 1];
        arr[pos] = val;
        n++;
    }

    static void delete(int pos) {
        for (int i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];
        n--;
    }

    static void display() {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements? ");
        int count = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < count; i++) {
            int val = sc.nextInt();
            insert(n, val);
        }

        System.out.print("Array: ");
        display();

        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();
        delete(pos);

        System.out.print("After Delete: ");
        display();

        System.out.print("Enter position and value to insert: ");
        int ipos = sc.nextInt();
        int ival = sc.nextInt();
        insert(ipos, ival);

        System.out.print("After Insert: ");
        display();

        sc.close();
    }
}