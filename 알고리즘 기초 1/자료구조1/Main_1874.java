import java.util.Scanner;
import java.util.Stack;

public class Main_1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(sc.nextLine());
        Stack<Integer> stack = new Stack<Integer>();
        int[] arrayNum = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.nextLine());
            arrayNum[i] = num;
        }
        stack.push(0);
        for (int i = 1; i <= n+1; ) {
            if ( stack.peek() == arrayNum[index] ) {
                stack.pop();
                sb.append("-").append("\n");
                index++;
                if (index == n) break;
            } else {
                stack.push(i);
                sb.append("+").append("\n");
                i++;
            }
        }
        if (stack.size() != 1) System.out.println("NO");  
        else System.out.println(sb);        
        sc.close();
    }

}
