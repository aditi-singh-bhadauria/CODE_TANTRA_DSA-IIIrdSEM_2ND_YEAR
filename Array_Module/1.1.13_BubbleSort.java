package q38978;
import java.util.Scanner;
public class CTJ38978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read number of elements
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline after reading n

        // Step 2: Read the next line of space-separated integers
        String line = sc.nextLine();
        String[] tokens = line.trim().split("\\s+");
        int elements = tokens.length;

        // Step 3: Validate input count
        if (elements != n) {
            System.out.println("-1");
            sc.close();
            return;
        }

        // Step 4: Parse integers into array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        // Step 5: Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Step 6: Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i < n - 1 ? " " : ""));
        }

        sc.close();
    }
}
