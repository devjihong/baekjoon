import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Queue<String> queue = new LinkedList<>();
        String num = "";

        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            String comName = command.split(" ")[0];
            
            switch(comName) {
                case "push":
                    num = command.split(" ")[1];
                    queue.add(num);
                    break;
                case "pop":
                    if(queue.isEmpty()) bw.write("-1\n");
                    else bw.write(queue.poll()+"\n");
                    break;
                case "size":
                    bw.write(queue.size()+"\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) bw.write("1\n");
                    else bw.write("0\n") ;
                    break;
                case "front":
                    if (queue.isEmpty()) bw.write("-1\n");
                    else bw.write(queue.element()+"\n");
                    break;
                case "back":
                    if (queue.isEmpty()) bw.write("-1\n");
                    else bw.write(num+"\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
