/* 
    1. 왼쪽스택, 오른쪽 스택 이용
    2. ListIterator 사용

    #### 시간초과 ####
    1. index : 값을 변화시켜 커서 움직이면 O(n) -> n번 반복하면 O(n^2)
    2. scanner,prinln 이용하면 시간초과 -> BufferedReader, BufferedWriter(or StringBuilder) 이용 
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main_1406 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String st = br.readLine();
        int n = Integer.parseInt(br.readLine());
        Stack<String> left = new Stack<String>();
        Stack<String> right = new Stack<String>();
        
        String[] arr = st.split("");
        for (String s : arr) {
            left.push(s);
        }
        
        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            switch (command) {
                case "L":
                    if(left.isEmpty()) break;
                    right.push(left.pop());
                    break;
                case "D":
                    if(right.isEmpty()) break;
                    left.push(right.pop());
                    break;
                case "B":
                    if(left.isEmpty()) break;
                    left.pop();
                    break;
                default:
                    String ch = command.split(" ")[1];
                    left.push(ch);
                    break;
            }
        }
        while(!left.isEmpty()) {
            right.push(left.pop());
        }
        while(!right.isEmpty()) {
            bw.write(right.pop());
        }  
        bw.flush();
        bw.close();
    }   
}


/* 시간초과1 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String st = sc.nextLine();
        sb.append(st);
        int n = Integer.parseInt(sc.nextLine());
        int cursor = st.length();
        
        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();
            switch (command) {
                case "L":
                    if(cursor == 0) break;
                    cursor--;
                    break;
                case "D":
                    if(cursor == sb.length()) break;
                    cursor++;
                    break;
                case "B":
                    if(cursor == 0) break;
                    sb.deleteCharAt(cursor-1);
                    cursor--;
                    break;
                default:
                    String ch = command.split(" ")[1];
                    sb.insert(cursor, ch);
                    cursor++;
                    break;
            }
        }
        System.out.println(sb);        
        sc.close();
    }
*/