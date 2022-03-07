import java.io.*;

public class Main_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String st = br.readLine();
        int alphaSize = 'z'-'a'+1;
        int[] num = new int[alphaSize];
        for (int i = 0; i < alphaSize; i++) {
            num[i] = -1;
        }

        for (int i = 0; i < st.length(); i++) {
            int index = st.charAt(i)-'a';
            if (num[index] == -1) num[index] = i;
        }

        for (int i = 0; i < alphaSize; i++) {
            bw.write(num[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}