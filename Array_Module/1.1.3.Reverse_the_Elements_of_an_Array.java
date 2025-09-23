package q37597;
import java.util.Scanner;

public class CTJ37597 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int start=0;
        int end=n-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.print("[");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
            if(i<n-1) System.out.print(",");
        }
        System.out.print("]");
    }
}
