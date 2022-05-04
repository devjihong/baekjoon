/**
 * <조합 0의 개수>
 */
import java.io.*;
import java.util.StringTokenizer;

public class Main_2004 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        int count_five = count_five(n) - count_five(n-m) - count_five(m);
        int count_two = count_two(n) - count_two(n-m) - count_two(m);

        bw.write(Math.min(count_five, count_two)+"");
        bw.flush();
        bw.close();
    }

    static int count_five(long n) {
        int count = 0;
        while(n >= 5){
            count += n / 5;
            n /= 5;
        }
        return count;
    }

    static int count_two(long n) {
        int count = 0;
        while(n >= 2){
            count += n / 2;
            n /= 2;
        }
        return count;
    }
}

