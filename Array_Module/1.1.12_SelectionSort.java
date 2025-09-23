package q38968;
import java.util.Scanner;
public class CTJ38968 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read number of elements
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Step 2: Read n space-separated integers from the next line
        String line = sc.nextLine();
        String[] tokens = line.trim().split("\\s+");

        // Step 3: Validate input count
        if (tokens.length != n) {
            System.out.println("-1");
            sc.close();
            return;
        }

        // Step 4: Parse integers into array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        // Step 5: Selection Sort
        for (int i = 0; i < n; i++) {
            int small = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[small]) {
                    // Swap immediately (as in your C code)
                    int tmp = arr[j];
                    arr[j] = arr[small];
                    arr[small] = tmp;
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
