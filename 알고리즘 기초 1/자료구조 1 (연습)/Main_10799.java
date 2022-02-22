import java.io.*;
import java.util.Stack;

public class Main_10799 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();
        String tag = br.readLine();
        int result = 0;

        for (int i = 0; i < tag.length(); i++) {
            if(tag.charAt(i)=='(') {
                stack.push('(');
            } else {
                stack.pop();
                if (tag.charAt(i-1)=='(') result += stack.size();
                else result += 1;
            }
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
    }
}

