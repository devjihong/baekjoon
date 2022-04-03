// 소수 찾기
import java.io.*;
import java.util.StringTokenizer;

public class Main_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 0;

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());

            if (isPrime(a)) result++;
        }
        bw.write(result+"");

        bw.flush();
        bw.close();
    }

    static boolean isPrime(int num) {

        if (num == 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
