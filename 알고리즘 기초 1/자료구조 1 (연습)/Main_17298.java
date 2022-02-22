import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        
        int[] array = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && array[i] > array[stack.peek()] ) { // 현재 원소가 스택의 top 원소를 인덱스로 하는 수열의 원소보다 크게 될 경우
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

/*
    참고 : https://st-lab.tistory.com/196
*/