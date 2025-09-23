package q37596;
import java.util.Scanner;

public class CT37596 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("[");
        for(int i = 0; i < n; i++){
            arr1[i] = arr[i] * arr[i];
            System.out.print(arr1[i]);
            if(i < n - 1) System.out.print(",");
        }
        System.out.println("]");

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr1[i];
        }
        System.out.println(sum);
    }
}
