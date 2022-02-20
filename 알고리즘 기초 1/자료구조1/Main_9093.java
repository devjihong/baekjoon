import java.util.Scanner;

public class Main_9093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int number = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < number; i++) {
            String sentence = sc.nextLine();
            String[] words = sentence.split(" ");
            for (String word : words) {
                int length = word.length();
                for (int j = length; j > 0 ; j--) {
                    sb.append(word.charAt(j-1));
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        sc.close();
    }
}