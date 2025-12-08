import java.util.Scanner;

public class ct2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String str = s1 + ' ' + s2;
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if (('a' <= letter && letter <= 'z') || ('A' <= letter && letter <= 'Z')) {
                sum += (int) letter;
            }
        }

        System.out.println(str);
        System.out.println(sum);

        sc.close();
    }
}
