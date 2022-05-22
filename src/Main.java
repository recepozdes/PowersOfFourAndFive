import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, i = 0;
        double powOfFour, powOfFive;
        System.out.print("Bir sayı giriniz : ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        do {
            powOfFour = Math.pow(4, i);
            if (powOfFour <= n)
                System.out.print(" 4^ " + i + " = " + powOfFour );
            i++;
        } while (powOfFour < n);
        i = 0;
        System.out.println("\n");
        do {
            powOfFive = Math.pow(5, i);
            if (powOfFive <= n)
                System.out.print(" 5^ " + i + " = " + powOfFive );
            i++;
        } while (powOfFive < n);

    }
}
