import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("x: ");
        Double x= scanner.nextDouble();

        System.out.println("y: ");
        Double y= scanner.nextDouble();

        System.out.println("a: ");
        Double a= scanner.nextDouble();

        System.out.println("b: ");
        Double b= scanner.nextDouble();


        boolean rownosc= !((x && y) || (a && b)) == ((!x || !y) && (!a || !b));



    }
}