import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        System.out.println("Podaj wyraz ciagu: ");
        Scanner scanner = new Scanner(System.in);
        int an = scanner.nextInt();
        System.out.println(wyrazCiagu(an));
    }
    public static long wyrazCiagu(int n){

        if (n == 0 || n == 1){
            return 1;
        }
        long a0 = 0;
        long a1 = 1;
        int i = 2;

        while (i < n){
            long nextN = a0 + a1;
            a0 = a1;
            a1 = nextN;
            i++;
        }
        return a1;
    }
}
