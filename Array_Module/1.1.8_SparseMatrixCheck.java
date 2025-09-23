package q37649;
import java.util.Scanner;
public class CTJ37649 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int zeroCount = 0;
        int nonzeroCount = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == 0){
                    zeroCount++;
                }else{
                    nonzeroCount++;
                }
            }
        }
        boolean isSparse = zeroCount > nonzeroCount;
        System.out.println(isSparse ? "True" : "False");
        if(isSparse){
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(arr[i][j] != 0){
                        System.out.println(i + "," + j + "," + arr[i][j]);
                    }
                }
            }
        }
    }
}

