import java.util.Scanner;
import java.util.Stack;

public class Main_9012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int number = Integer.parseInt(sc.nextLine());
        Stack<String> stack = new Stack<String>();

        Loop1:
        for (int i = 0; i < number; i++) {
            String st = sc.nextLine();
            String[] strArray = st.split("");
            for (String s : strArray) {
                if(s.equals("(")) stack.push(s);
                else if(s.equals(")")) {
                    if( stack.empty() ) {
                        sb.append("NO").append("\n");
                        continue Loop1;
                    } else {
                        stack.pop();
                    }
                }
            }
            if(stack.empty()) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
            stack.clear();
        }

        System.out.println(sb);
        sc.close();
    }
    
}
