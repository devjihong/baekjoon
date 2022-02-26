import java.io.*;
import java.util.Stack;

// https://www.acmicpc.net/problem/1935
public class Main_1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Double> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        String st = br.readLine();
        
        double[] num = new double[n];
        for (int i = 0; i < n; i++) {
            num[i] = Double.parseDouble(br.readLine());
        }

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                stack.push(num[ch-'A']);
            } else {
                double operand1 = stack.pop();
                double operand2 = stack.pop();
                switch(ch) {
                    case '*':
                        stack.push(operand2 * operand1);
                        break;
                    case '+':
                        stack.push(operand2 + operand1);
                        break;
                    case '-':
                        stack.push(operand2 - operand1);    
                        break;
                    case '/':
                        stack.push(operand2 / operand1);
                        break;
                }
            }
        }
        String result = String.format("%.2f", stack.pop());
        bw.write(result);
        bw.flush();
        bw.close();
    }
}