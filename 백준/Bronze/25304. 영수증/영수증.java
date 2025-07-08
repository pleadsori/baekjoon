import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();  // 총 금액
        int n = sc.nextInt();  // 항목 개수
        int total = 0;

        for (int i = 0; i < n; i++) {
            int at = sc.nextInt();    
            int an = sc.nextInt();   
            total += (at * an);
        }

        if (x == total) {
            System.out.println("Yes");  // 대소문자 주의
        } else {
            System.out.println("No");
        }
    }
}
