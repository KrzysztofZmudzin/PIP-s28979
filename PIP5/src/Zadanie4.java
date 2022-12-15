import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x, y, z;
        System.out.println("Podaj liczby calkowite nie ujemne.");
        do {
            System.out.println("x: ");
            x = scanner.nextInt();
            System.out.println("y: ");
            y = scanner.nextInt();
            System.out.println("z: ");
            z = scanner.nextInt();
        }while (x < 0 || y < 0 || z < 0);
        wzor(x, y, z);
    }

    public static void wzor(int x, int y, int z) {

        for (int h = 0; h < x || h < y || h < z; h++) {
            if (x < y || x < z) {
                System.out.print("  ");
                x += 1;
            }else {
                System.out.print("* ");
            }
            if (y < x || y < z){
                System.out.print("  ");
                y += 1;
            }else {
                System.out.print("* ");
            }
            if (z < x || z < y){
                System.out.print("  ");
                z += 1;
            }else {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
