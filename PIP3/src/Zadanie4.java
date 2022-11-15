import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Podaj X: ");
        int x= scanner.nextInt();
        System.out.println("Podaj Y: ");
        int y= scanner.nextInt();

        x= x+y;
        y= x-y; //y=x+y-y y=x
        x= x-y; //x=x+y-x x=y

        System.out.println("Zamienione X: "+x);
        System.out.println("Zamienione Y: "+y);

    }
}
