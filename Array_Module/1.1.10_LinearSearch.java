package q17129;
import java.util.Scanner;
public class CTJ17129 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int[] arr = new int[r];
		for(int i = 0; i < r; i++){
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();

		int index = -1;
		for(int i = 0; i < r; i++){
			if(arr[i] == key){
				index = i;
				break;
			}
		}
		if(index != -1){
			System.out.println(index);
		} else {
			System.out.println("Not found");
		}
	}
}

