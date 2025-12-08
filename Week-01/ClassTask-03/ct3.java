import java.util.Scanner;

public class ct3 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N = ");
        int N = sc.nextInt();

        double [] arr = new double [N];

        System.out.println("Please enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextDouble();
        }

        int count = 1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1]) {
                count++;
            }
        }

        double [] new_arr = new double [count];
        int index = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1]) {
                new_arr[index++] = arr[i];
            }
        }
        new_arr[index] = arr[arr.length-1];

        System.out.print("New Array: ");
        for (int i = 0; i < new_arr.length; i++) {
            System.out.print(new_arr[i] + " ");
        }
        System.out.println();
        System.out.println("Removed elements: " + (N-count));

        sc.close();
    }
}
