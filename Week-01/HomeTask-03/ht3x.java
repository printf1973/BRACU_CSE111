import java.util.Scanner;

public class ht3x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N = ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (arr[i] == arr[j]) {
                    if (j < i) {
                        break;
                    } else {
                        count++;
                    }
                }
            }
            if (count != 0) {
                System.out.println(arr[i] + " - " + count + " times");
            }
        }
        sc.close();
    }
}
