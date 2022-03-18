import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main_10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] array = new String[4];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < 4; i++) {
            array[i] = st.nextToken();
        }
        BigInteger firstNum = new BigInteger(array[0]+array[1]);
        BigInteger secondNum = new BigInteger(array[2]+array[3]);
        BigInteger result = firstNum.add(secondNum);
        bw.write(""+result);
        bw.flush();
        bw.close();
    }
}
