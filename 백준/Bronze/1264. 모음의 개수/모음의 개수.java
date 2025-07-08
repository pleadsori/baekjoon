import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();

            if (str.equals("#")) {  // 종료 조건
                break;
            }

            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char c = Character.toLowerCase(str.charAt(i));  // 대소문자 처리
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }

            System.out.println(count);  // 현재 줄의 모음 개수 출력
        }

        sc.close();
    }
}
