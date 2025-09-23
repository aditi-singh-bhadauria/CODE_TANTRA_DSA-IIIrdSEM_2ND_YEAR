package C1373586;

import java.util.Scanner;

public class C1373586 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        // Input array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Display array elements
        System.out.print("J:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
            if (i == arr.length - 1) {
                System.out.print("\n");
            }
        }

        // Find maximum element
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        // Output maximum
        System.out.println("Max:");
        System.out.println(max);
        sc.close();
    }
}
