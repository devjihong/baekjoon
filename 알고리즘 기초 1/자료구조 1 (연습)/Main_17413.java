import java.io.*;
import java.util.Stack;

public class Main_17413 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String strings = br.readLine();
        String[] arr = strings.split("");
        Stack<String> stack = new Stack<>();

        boolean tag_open = false;
        for (String ch : arr) {
            if(ch.equals("<")) {
                isEmptyCheck(stack, bw);
                tag_open = true;
                bw.write(ch);
            }else if(tag_open) {
                bw.write(ch);
                if(ch.equals(">")) tag_open = false;
            } else {
                if(!ch.equals(" ") ) {
                    stack.push(ch);
                } else {
                    isEmptyCheck(stack, bw);
                    bw.write(ch);
                }
            }
        }
        isEmptyCheck(stack, bw);
        bw.flush();
        bw.close();
    }

    static void isEmptyCheck(Stack<String> stack, BufferedWriter bw) throws IOException {
        while(!stack.isEmpty()) {
            bw.write(stack.pop());
        }
    }
    
}
