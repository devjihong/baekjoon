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
/*
문제
문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. \
단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다. 
단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.
*/