import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ocen wartosc logiczna podanych zmiennych(true/false): ");

        System.out.println("x: ");
        Boolean x = scanner.nextBoolean();

        System.out.println("y: ");
        Boolean y = scanner.nextBoolean();

        System.out.println("a: ");
        Boolean a = scanner.nextBoolean();

        System.out.println("b: ");
        Boolean b = scanner.nextBoolean();

        boolean rownosc = !((x && y) || (a && b)) == ((!x || !y) && (!a || !b));
        System.out.println("Wartosc logiczna wyrazenia !((x && y) || (a && b)) == ((!x || !y) && (!a || !b)) : "+rownosc);
    }
}
