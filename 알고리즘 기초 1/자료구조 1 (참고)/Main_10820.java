import java.io.*;

public class Main_10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] result = {0, 0, 0, 0};

        String st = "";
        while ( (st=br.readLine()) != null ) {
            for (int i = 0; i < st.length(); i++) {
                char c = st.charAt(i);    
                if( c >= 'a' && c <= 'z') {
                    result[0]++;
                } else if (c >= 'A' && c <= 'Z') {
                    result[1]++;
                } else if (Character.isDigit(c)) {
                    result[2]++;
                } else if ( c== ' ') {
                    result[3]++;
                }
            }
            for (int i = 0; i < result.length; i++) {
                bw.write(result[i]+" ");
                result[i] = 0;
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
