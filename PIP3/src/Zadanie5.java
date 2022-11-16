import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {

        Scanner scanner1= new Scanner(System.in);

        System.out.println("Podaj dowolna liczbe calkowita, 3 cyfrowa: ");
        int cyfra= scanner1.nextInt();
        int suma= 0;

        while(cyfra>0){
            int reszta= cyfra% 10;
            suma= suma+ reszta;
            cyfra= cyfra/10; // 123%10=3   123/10=12 12%10=2   12/10=1 1%10=1
        }
        System.out.println("Suma cyfr podanej liczby wynosi: "+suma);



    }
}
