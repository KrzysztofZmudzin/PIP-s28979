import java.util.Objects;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        String login= "s28979";
        String haslo= "asd123";

        System.out.println("Podaj login: ");
        Scanner scanner= new Scanner(System.in);
        String podanylogin= scanner.next();

        if (Objects.equals(podanylogin, login)){
            System.out.println("Podaj hasło: ");
            String podanehaslo= scanner.next();
            if (Objects.equals(podanehaslo, haslo)){
                System.out.println("Zalogowano pomyslnie.");
            }else{
                System.out.println("Bledne haslo.");
                scanner.close();
            }
        }else{
            System.out.println("Bledny login.");
            scanner.close();
        }

    }
}
