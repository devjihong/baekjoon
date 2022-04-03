// 팩토리얼
import java.io.*;

public class Main_10872 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());

        // int result = factorial(n);
        int count = 0;

        while(n >= 5){
            count += n / 5;
            n /= 5;
        }

        bw.write(count+"");


        bw.flush();
        bw.close();
    }
    
    // static int factorial(int num) {
    //     if (num <= 1) return 1;
    //     else return num * factorial(num-1);
    // }
}
