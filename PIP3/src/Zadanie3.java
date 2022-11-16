import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Podaj X: ");
        int x= scanner.nextInt();
        System.out.println("Podaj Y: ");
        int y= scanner.nextInt();

        int z= x;
        x= y;
        y= z;

        System.out.println("Zamienione X: "+x);
        System.out.println("Zamienione Y: "+y);

    }
}
