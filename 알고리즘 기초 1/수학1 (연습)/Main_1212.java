import java.io.*;

public class Main_1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

        // int number = Integer.parseInt(br.readLine());
        String st = br.readLine();
        String binary = "";
        for (int i = 0; i < st.length() ; i++) {
            int num = st.charAt(i) - '0';
            binary = Integer.toBinaryString(num);
            if (binary.length() == 2 && i != 0) binary = "0" + binary;
            else if (binary.length() == 1 && i != 0) binary = "00" + binary;

            sb.append(binary);
        }
        System.out.println(sb);
    }
    
}