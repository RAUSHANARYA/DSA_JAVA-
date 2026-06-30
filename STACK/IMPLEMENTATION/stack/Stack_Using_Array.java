package stack;

import java.util.*;

public class Stack_Using_Array {

    int[] arr;
    int top;

    Stack_Using_Array(int size) {
        arr = new int[size];
        top = -1;
    }

    // Push
    public void push(int x) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = x;
    }

    // Pop
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        top--;
    }

    // Peek
    public void peek() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println(arr[top]);
    }

    // Display
    public void display() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // Stack Capacity
        int q = sc.nextInt();   // Number of Operations

        Stack_Using_Array st = new Stack_Using_Array(n);

        for (int i = 0; i < q; i++) {

            String op = sc.next();

            if (op.equals("PUSH")) {
                int x = sc.nextInt();
                st.push(x);
            }
            else if (op.equals("POP")) {
                st.pop();
            }
            else if (op.equals("PEEK")) {
                st.peek();
            }
            else if (op.equals("DISPLAY")) {
                st.display();
            }
        }

        sc.close();
    }
}