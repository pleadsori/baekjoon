import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int X = sc.nextInt();
	int [] arr = new int[N];


	for( int i = 0; i < N; i++ ){
		arr[i] = sc.nextInt();
	} 
	sc.close();

	for( int i = 0; i < N; i++ ){
		if( arr[i] < X ){
			System.out.print(arr[i] + " ");
		}
	}
    }
}
