import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        Scanner scanner1=new Scanner(System.in);

        System.out.println("Czy pada? :");
        boolean czyPada= scanner1.nextBoolean();

        System.out.println("Czy swieci slonce? :");
        boolean czySwieciSlonce= scanner1.nextBoolean();

        if(czyPada==true){
            if(czySwieciSlonce==true){
                System.out.println("Tecza");
            }else {
                System.out.println("Plucha");
            }

        }if (czyPada==false) {
            if (czySwieciSlonce==true){
                System.out.println("Slonecznie");
            }else {
                System.out.println("Pochmurno");
            }

        }


    }
}
