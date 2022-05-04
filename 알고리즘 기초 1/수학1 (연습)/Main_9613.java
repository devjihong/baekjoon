/**
 * GCD 합
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_9613 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        List<Integer> list = new ArrayList();
        long result = 0; // int하면 실패.

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            for (int j = 0; j < n; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            for (int j = 0; j < list.size(); j++) {
                for (int k = j+1; k < list.size(); k++) {
                    result += gcd(list.get(j), list.get(k));
                }
            }
            bw.write(result+"\n");
            list.clear();
            result = 0;
        }
        
        bw.flush();
        bw.close();
    }

    static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b, a%b);
    }
    
}
