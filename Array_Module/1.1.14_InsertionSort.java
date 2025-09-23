package q38981;
import java.util.Scanner;
public class CTJ38981 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read number of elements
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Step 2: Read space-separated integers
        String line = sc.nextLine();
        String[] tokens = line.trim().split("\\s+");

        // Step 3: Validate input count
        if (tokens.length != n) {
            System.out.println("-1");
            sc.close();
            return;
        }

        // Step 4: Parse input into array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        // Step 5: Perform Counting Sort
        int[] output = countingSort(arr);

        // Step 6: Print sorted array
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + (i < output.length - 1 ? " " : ""));
        }

        sc.close();
    }

    // Helper: Get max value
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
        }
        return max;
    }

    // Helper: Get min value
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int val : arr) {
            if (val < min) min = val;
        }
        return min;
    }

    // Counting Sort implementation
    public static int[] countingSort(int[] arr) {
        int min = getMin(arr);
        int max = getMax(arr);
        int range = max - min + 1;

        int[] count = new int[range];
        for (int val : arr) {
            count[val - min]++;
        }

        int[] output = new int[arr.length];
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i]-- > 0) {
                output[index++] = i + min;
            }
        }

        return output;
    }
}
