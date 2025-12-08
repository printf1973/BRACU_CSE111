import java.util.Scanner;

public class ct3y {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N = ");
        int N = sc.nextInt();

        double[] arr = new double[N]; // Initialize the array
        int count = 0; // Keep a duplicate count
        int idx = 1; // Keep an index count

        System.out.println("Please enter the elements of the array: ");
        arr[0] = sc.nextDouble(); // Add the first element manually
        for (int i = 1; i < N; i++) {
            double num = sc.nextDouble();
            if (num == arr[idx - 1]) { // We check the current input with the last element of the array
                count++; // If they match, we increase the duplicate counter
            } else {
                arr[idx++] = num; // If it's not a duplicate, then we simply add it to the array
            }
        }

        System.out.print("New Array: ");
        /*
         * When printing, we only have to iterate till idx because we didn't add the
         * duplicates to our array
         */
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Removed elements: " + count);

        sc.close();
    }
}
