import java.io.*;

public class Main_2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String st = br.readLine();
        bw.write(st.length()+"");
        bw.flush();
        bw.close();
    }
}
