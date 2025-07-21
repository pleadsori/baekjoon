import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
	    String number = sc.next();            //띄어쓰기 없는 숫자라, 문자열로 받아 이후 charAt

	    int sum = 0;

	    for (int i = 0; i < N; i++){
		    sum += number.charAt(i) - '0';    // '0' = 48
	    }	
	    System.out.println(sum);
    }
}
