import java.util.Scanner;

public class ct3x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N = ");
        int N = sc.nextInt();

        double[] arr = new double[N];
        int count = 0;

        System.out.println("Please enter the elements of the array: ");
        arr[0] = sc.nextDouble();
        for (int i = 1; i < N; i++) {
            arr[i] = sc.nextDouble();
            if (arr[i] == arr[i - 1]) {
                count++;
            }
        }

        double[] newArr = new double[N - count];
        newArr[0] = arr[0];
        int oldIdx = 1;
        int newIdx = 1;

        while (newIdx != newArr.length) {
            if (arr[oldIdx] != arr[oldIdx - 1]) {
                newArr[newIdx++] = arr[oldIdx];
            }
            oldIdx++;
        }

        System.out.print("New Array: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
        System.out.println("Removed elements: " + count);

        sc.close();
    }
}
