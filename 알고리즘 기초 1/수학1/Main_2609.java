// 최대공약수와 최소공배수
import java.io.*;

public class Main_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String st = br.readLine();
        int num1 = Integer.parseInt(st.split(" ")[0]);
        int num2 = Integer.parseInt(st.split(" ")[1]);

        bw.write(gcd(num1, num2)+"\n");
        bw.write(lcm(num1, num2)+"");

        bw.flush();
        bw.close();
    }

    static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b, a%b);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    
}
