import java.util.Scanner;

public class ht2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if (letter == 'a') {
                System.out.print('z');
            }
            else {
                System.out.print((char)(letter-1));
            }
        }
        System.out.println();
        sc.close();
    }
}
