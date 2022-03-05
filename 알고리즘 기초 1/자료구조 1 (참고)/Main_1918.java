import java.io.*;
import java.util.Stack;

public class Main_1918 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();
        String st = br.readLine();

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                bw.write(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.pop();
                        break;
                    }
                    bw.write(stack.pop());
                }
            } else {
                while (!stack.isEmpty() && priority(ch) <= priority(stack.peek()) ) {
                    bw.write(stack.pop());
                } 
                stack.push(ch);             
            }
        }
        while(!stack.isEmpty()) {
            bw.write(stack.pop());
        }
        bw.flush();
        bw.close();
    }    

    public static int priority(char operator) {
        if (operator == '(') return 0;
        else if (operator == '+' || operator == '-') return 1;
        else return 2;
    }
}

/*
((A*B)+C)
*/