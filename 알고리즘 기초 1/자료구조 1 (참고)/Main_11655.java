import java.io.*;

public class Main_11655 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String st = br.readLine();

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ((ch-'A'+13) % 26 +'A');
                bw.write(ch);
            } else if (ch >= 'a' && ch <= 'z') {
                ch = (char) ((ch-'a'+13) % 26 +'a');
                bw.write(ch);
            } else {
                bw.write(ch);
            }
        }
        bw.flush();
        bw.close();
    }
    
}
