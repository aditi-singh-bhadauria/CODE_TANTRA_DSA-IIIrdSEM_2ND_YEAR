package q14028;
import java.util.Scanner;
public class CTJ14028 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

        int target = sc.nextInt();

        // sorting -- bubble sorting
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // binary search for last occurrence
        int low = 0;
        int high = n - 1;
        int result = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target){
                result = mid;
                low = mid + 1;
            } else if(arr[mid] < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(result);
        sc.close();
	}
}
