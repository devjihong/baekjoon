// 소수 구하기
import java.io.*;
import java.util.StringTokenizer;

public class Main_1929 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for (int i = m; i <= n; i++) {
            if(isPrime(i)) bw.write(i+"\n");
        }

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
