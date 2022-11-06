import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("x: ");
        int x= scanner.nextInt();
        System.out.println("y: ");
        int y= scanner.nextInt();
        System.out.println("a: ");
        int a= scanner.nextInt();
        System.out.println("b: ");
        int b= scanner.nextInt();


        boolean rownosc= !((x && y) || (a && b)) == ((!x || !y) && (!a || !b));



    }
}