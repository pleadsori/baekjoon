import java.util.*;

public class Main {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();		//바구니갯수
	int arr[] = new int[N];		
	int M = sc.nextInt();		//교환 횟수
	int num;

	for (int i = 0; i < N; i++ ){
		arr[i] = i + 1;
	}
	for (int j = 0; j < M; j++){
		int I = sc.nextInt();
		int J = sc.nextInt();
		num = arr[I - 1];
		arr[I - 1] = arr[J-1];
		arr[J-1] = num;
	}
	for (int k = 0; k < arr.length; k++){
		System.out.print(arr[k] + " ");
		} 
	}
}