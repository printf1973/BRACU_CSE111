import java.util.Scanner;

public class ct1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();

            if (num > 0 && num % 2 != 0) {
                sum += num;
                count++;
                if (num < min) {
                    min = num;
                } else if (num > max) {
                    max = num;
                }
            }
        }

        if (sum == 0) {
            System.out.println("No odd positive numbers found");
        }

        else {
            System.out.println("Sum = " + sum);
            System.out.println("Minimum = " + min);
            System.out.println("Maximum = " + max);
            System.out.println("Average = " + sum / count);
        }

        sc.close();
    }
}
