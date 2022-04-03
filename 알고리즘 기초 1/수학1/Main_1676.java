// 팩토리얼 0의 개수
import java.io.*;

public class Main_1676 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        long result = factorial(n);
        bw.write(result+"");
    
        bw.flush();
        bw.close();
    }

    static long factorial(int num) {
        if (num <= 1) return 1;
        else return num * factorial(num-1);
    }
}
