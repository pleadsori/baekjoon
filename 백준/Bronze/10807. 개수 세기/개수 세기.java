import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 
		int one = sc.nextInt();
		int [] arr = new int[one];
		
		for(int i = 0; i < one; i++ ){
			arr[i] = sc.nextInt();
		}
		
		int two = sc.nextInt();
		int count = 0;
		
		for (int i = 0; i < one; i++ ){
			if(arr[i] == two){
				count++;
			}
		}
        System.out.println(count);
		sc.close();
	}
}

