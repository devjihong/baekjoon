import java.io.*;
import java.util.Arrays;

public class Main_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String st = br.readLine();
        int length = st.length();

        String[] array = new String[length];
        
        for(int i = 0 ; i < length; i++) {
            array[i] = st.substring(i, length);
        }
        Arrays.sort(array);
        for (int i = 0; i < length; i++) {
            bw.write(array[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
    
}
