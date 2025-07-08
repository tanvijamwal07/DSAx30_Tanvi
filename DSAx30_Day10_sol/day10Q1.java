package DSAx30_Day10_sol;
import java.util.*;
class day10Q1{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());}
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp; }
    public int pop() {
        return q1.remove();}
    public int top() {
        return q1.peek();}
    public boolean empty() {
        return q1.isEmpty();}
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        day10Q1 stack = new day10Q1();
        System.out.println("Enter number of elements to push:");
        int n = a.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            stack.push(a.nextInt()); }
        System.out.println("Top element: " + stack.top());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Is stack empty? " + stack.empty());
        a.close();
    }
}

