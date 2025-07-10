import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();  
	int count = sc.nextInt(); 
	
	int [] arr = new int [a];  
	for ( int i = 0; i < a; i++ ){
		arr[i] = i + 1;  // 0부터 a까지 값을 채우기
	}
	
	for ( int k = 0; k < count; k++ ){
		int i = sc.nextInt ();
		int j = sc.nextInt ();
		
	while ( i < j ){
		int temp = arr[ i - 1 ];
		arr[ i - 1 ] = arr[ j - 1];
		arr[ j - 1] = temp;
		
		i ++;
		j --;
	}
}
	
	for( int i = 0 ; i < arr.length; i++){
        System.out.print( arr[i] + " ");
		}
	}
}

