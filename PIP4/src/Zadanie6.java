import java.util.Random;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj 2 liczby rzeczywiste (a<b): ");
        double a= scanner.nextDouble();
        double b= scanner.nextDouble();
        if (a>=b){
            double c= a;
            a= b;
            b= c;
        }
        System.out.println("a= "+a+", "+"b= "+b);

        Random random= new Random();
        double d1= random.nextDouble(b-a)+a;
        double d2= random.nextDouble(b-a)+a;
        double d3= random.nextDouble(b-a)+a;
        System.out.println("d1= "+d1+", "+"d2= "+d2+", "+"d2= "+d3);

        if (d1<d2 && d2<d3){
            System.out.println(d1+" < "+d2+" < "+d3);
        }else if (d1<d3 && d3<d2){
            System.out.println(d1+" < "+d3+" < "+d2);
        }else if (d2<d1 && d1<d3){
            System.out.println(d2+" < "+d1+" < "+d3);
        }else if (d2<d3 && d3<d1){
            System.out.println(d2+" < "+d3+" < "+d1);
        }else if (d3<d1 && d1<d2){
            System.out.println(d3+" < "+d1+" < "+d2);
        }else if (d3<d2 && d2<d1){
            System.out.println(d3+" < "+d2+" < "+d1);
        }
    }
}
