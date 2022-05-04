/**
 * 숨바꼭질 6
 */
import java.io.*;
import java.util.*;

public class Main_17087 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        long n = Long.parseLong(st1.nextToken()); // 동생 수
        long s = Long.parseLong(st1.nextToken()); // 수빈이 위치
        List<Long> list = new ArrayList(); // (수빈이 위치 - 동생위치) 차이값 리스트

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            list.add(Math.abs(s - Integer.parseInt(st2.nextToken())));
        }
        int d = 0;
        long gcd = list.get(0);
        for (int i = 1; i < n; i++) {
            gcd = gcd(gcd, list.get(i));
        }

        bw.write(gcd+"");
        bw.flush();
        bw.close();
    }

    static long gcd(long a, long b) {
        if (b==0) return a;
        return gcd(b, a%b);
    }
    
}
