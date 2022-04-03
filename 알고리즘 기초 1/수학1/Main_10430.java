/**
 * 나머지
 */
import java.io.*;
import java.util.StringTokenizer;

public class Main_10430 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long[] num = new long[3];
        long result = 0L;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 3; i++) {
            num[i] = Long.parseLong(st.nextToken());
        }

        long a = num[0];
        long b = num[1];
        long c = num[2];
        result = (a+b)%c;
        bw.write(result+"\n");
        result = ((a%c)+(b%c))%c;
        bw.write(result+"\n");
        result = (a*b)%c;
        bw.write(result+"\n");
        result = ((a%c)*(b%c))%c;
        bw.write(result+"");

        bw.flush();
        bw.close();
    }
}