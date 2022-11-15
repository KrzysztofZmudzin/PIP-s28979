import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Podaj X: ");
        int X= scanner.nextInt();
        System.out.println("Podaj Y: ");
        int Y= scanner.nextInt();

        int X1= Y;
        int Y1= X;

        System.out.println("Zamienione X: " + X1);
        System.out.println("Zamienione Y: " + Y1);
    }
}
