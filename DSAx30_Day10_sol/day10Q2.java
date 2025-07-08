package DSAx30_Day10_sol;

import java.util.*;
class day10Q2 {
    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for (int s : students) {
            q.add(s);
        }
        int i = 0, round = 0;
        while (!q.isEmpty() && round < q.size()) {
            if (q.peek() == sandwiches[i]) {
                q.remove();
                i++;
                round = 0;
            } else {
                q.add(q.remove());
                round++;
            }
        }
        return q.size();
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter number of students/sandwiches: ");
        int n = a.nextInt();
        int[] students = new int[n];
        int[] sandwiches = new int[n];
        System.out.println("Enter student preferences (0 or 1):");
        for (int i = 0; i < n; i++) {
            students[i] = a.nextInt();
        }
        System.out.println("Enter sandwich types (0 or 1):");
        for (int i = 0; i < n; i++) {
            sandwiches[i] = a.nextInt();
        }
        int result = day10Q2.countStudents(students, sandwiches);
        System.out.println("Students unable to eat: " + result);
        a.close();
    }
}

