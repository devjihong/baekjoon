import java.io.*;
import java.util.*;

public class Main_17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int num = array[i];
            if (map.containsKey(num)) map.put(num, (int)map.get(num)+1);
            else map.put(num, 1);
        }

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && map.get(array[i]) > map.get(array[stack.peek()])) {
                array[stack.pop()] = array[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            array[stack.pop()] = -1;
        }
        for (int i = 0; i < n; i++) {
            bw.write(array[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}
