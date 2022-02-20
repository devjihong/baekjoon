import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main_10866 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        int num = 0;
        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            String comName = command.split(" ")[0];
            
            switch(comName) {
                case "push_front":
                    num = Integer.parseInt(command.split(" ")[1]);
                    deque.addFirst(num);
                    break;
                case "push_back":
                    num = Integer.parseInt(command.split(" ")[1]);
                    deque.addLast(num);
                    break;
                case "pop_front":
                    if(deque.isEmpty()) bw.write("-1\n");
                    else bw.write(deque.pollFirst()+"\n");
                    break;
                case "pop_back":
                    if(deque.isEmpty()) bw.write("-1\n");
                    else bw.write(deque.pollLast()+"\n");
                    break;
                case "size":
                    bw.write(deque.size()+"\n");
                    break;
                case "empty":
                    if(deque.isEmpty()) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "front":
                    if(deque.isEmpty()) bw.write("-1\n");
                    else bw.write(deque.peekFirst()+"\n");
                    break;
                case "back":
                    if(deque.isEmpty()) bw.write("-1\n");
                    else bw.write(deque.peekLast()+"\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
