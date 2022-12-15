import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        System.out.println("Podaj liczbe calkowita: ");
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        wzor2(n);
    }

    public static void wzor2(int n) {

        if (n % 2 == 0) {
            n -= 1;
        }
        int z= 1;
        for (int i= 0; i < n; i++) {
            if ((n - i) % 2 != 0) {
                for (int j = 0; j < n - z; j++) {
                    System.out.print(" ");
                }
                z++;
                for (int k= n - i; k <= n; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


    public static void wzor1(int n) {
        if (n % 2 == 0) {
            n -= 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

