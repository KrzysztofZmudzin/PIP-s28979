import java.util.Objects;
import java.util.Scanner;

public class Logowanie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String login = "ABC";
        String haslo = "123";
        int i= 0;
        int j= 3;

        while (i < 3) {
            System.out.println("Podaj login: ");
            String login1= scanner.nextLine();
            if (Objects.equals(login, login1)) {
                System.out.println("Podaj haslo: ");
                String haslo1= scanner.nextLine();
                if (Objects.equals(haslo, haslo1)) {
                    System.out.println("Zalogowano");
                    break;
                } else {
                    System.out.println("Bledne haslo");
                    i++;
                    j--;
                    System.out.println("Liczba pozostalych prob: " + j);
                    continue;
                }
            } else {
                System.out.println("Bledny login");
                i++;
                j--;
                System.out.println("Liczba pozostalych prob: " + j);
                continue;
            }
        }
        if (i >= 3) {
            System.out.println("Konto zablokowane.");
        }

    }
}
