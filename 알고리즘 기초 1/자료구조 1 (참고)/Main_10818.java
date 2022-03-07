import java.io.*;

public class Main_10818 {
    public static final int ALPHABET_SIZE = 26;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] result = new int[ALPHABET_SIZE];
        
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            result[i] = 0;
        }
        String st = br.readLine();

        for (int i = 0; i < st.length(); i++) {
            int index = st.charAt(i)-97;
            result[index]++;
        }
        
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            bw.write(result[i]+" ");
        }
        bw.flush();
        bw.close();
    }
 
}