import java.util.Scanner;
import java.util.Stack;

public class Stack_10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int number = Integer.parseInt(sc.nextLine());
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < number; i++) {
            String st = sc.nextLine();
            switch (st) {
                case "pop":
                    if(stack.empty()) {
                        sb.append(-1).append('\n');
                        break;
                    } else {
                        sb.append(stack.pop()).append('\n');
                        break; 
                    }
                case "size":
                    sb.append(stack.size()).append('\n'); 
                    break;
                case "empty":
                    sb.append(stack.empty() ? 1 : 0).append('\n'); 
                    break;
                case "top":
                    if (!stack.empty())  {
                        sb.append(stack.lastElement()).append('\n'); 
                        break;
                    }
                    else {
                        sb.append(-1).append('\n');
                        break;
                    }
                default :
                    int x = Integer.parseInt(st.split(" ")[1]);
                    stack.push(x);
                    break;
            }
        }
        System.out.println(sb);
        sc.close();
    }
}