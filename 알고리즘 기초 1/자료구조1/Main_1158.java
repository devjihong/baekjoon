import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String st = br.readLine();
        String[] arr = st.split(" ");
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);

        for (int i = 1; i < n+1; i++) {
            queue.add(i);
        }
        int check = 1;
        bw.write("<");
        while(!queue.isEmpty()) {
            if(check % k == 0) {
                bw.write(queue.poll()+"");
                if(!queue.isEmpty()) bw.write(", ");
            } else {
                queue.add(queue.poll());
            }
            check++;
        }
        bw.write(">");
        bw.flush();
        bw.close();
    }
    
}
