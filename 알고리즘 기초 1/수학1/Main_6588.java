// 골드바흐의 추측
import java.io.*;

public class Main_6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String st = null;
        String result = null;

        while((st = br.readLine()) != null) {
            int n = Integer.parseInt(st);
            if (n == 0) break;
            result =  getPrime(n);
            bw.write(result+"\n");
        }

        bw.flush();
        bw.close();
    }

    static String getPrime(int num) {

        for (int i = 3; i < num; i++) {
            if ( isPrime(i) && isPrime(num-i) ) return num+" = "+i+" + "+(num-i);
        }

        return "Goldbach's conjecture is wrong.";
    }

    static boolean isPrime(int num) {

        if (num == 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
