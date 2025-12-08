import java.util.Scanner;

public class ht3 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N = ");
        int N = sc.nextInt();
        int [] arr = new int [N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            count++;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    count--;
                    break;
                }
            }
        }

        int [] uniArr = new int [count];
        int index = 0;

        for (int i = 0; i < N; i++) {
            boolean flag = true;
            for (int j = 0; j < count; j++) {
                if (arr[i] == uniArr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                uniArr[index++] = arr[i];
            }
        }

        for (int i = 0; i < count; i++) {
            int appears = 0;
            for (int j = 0; j < N; j++) {
                if (uniArr[i] == arr[j]) {
                    appears++;
                }
            }
            System.out.printf("%d - %d times%n", uniArr[i], appears);
        }
        sc.close();
    }
}
