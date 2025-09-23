package q37601;
import java.util.Scanner;

public class CTJ37601 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        boolean trueorfalse = true;
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                trueorfalse = false;
                break;
            }
        }
        System.out.print(trueorfalse ? "True" : "False");
    }
}
