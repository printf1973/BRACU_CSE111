import java.util.Scanner;

public class ht1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        for (int i = start; i <= end; i++) {
            if (i <= 1) {
                continue;
            }
            count++;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count--;
                    break;
                }
            }
        }

        System.out.println("There are " + count + " prime numbers between " + start + " and " + end);
        sc.close();
    }
}
