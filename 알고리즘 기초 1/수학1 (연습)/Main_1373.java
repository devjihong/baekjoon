/**
 * 2진수 8진수
 * ex) 11001100 -> 314
 * - 주어진 수의 길이 제한으로 2진수 -> 10진수 변환 불가
 * - 10진수 거치지 않고 8진수로 변환
 */
import java.io.*;

public class Main_1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

        String st = br.readLine();
        int length = st.length();
        // 세자리씩 끊었을 때 하나
        if (length % 3 == 1) {
            sb.append(st.charAt(0));
        } 
        // 세자리씩 끊었을 때 두개
        if (length % 3 == 2) {
            sb.append((st.charAt(0)-'0') * 2 + (st.charAt(1)-'0'));
        } 
        // 이후 나머지 
        for(int i = length % 3 ; i < length ; i+=3) {
            sb.append((st.charAt(i)-'0') * 4 + (st.charAt(i+1)-'0') * 2 + (st.charAt(i+2)-'0'));
        }
    
        System.out.println(sb);
    }
    
}
