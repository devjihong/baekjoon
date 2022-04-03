// 최소공배수
import java.io.*;
import java.util.StringTokenizer;

public class Main_1934 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = null; 

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");    
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int result = lcm(a,b);
            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();
    }

    static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b, a % b);
    }
    
    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
