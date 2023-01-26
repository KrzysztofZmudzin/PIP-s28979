package ZadaniaReszta;

import java.util.Scanner;

public class SecretStudent {

    private String name= "Default name";
    private String lastName= "Default last name";
    private int indexNr= 0;

    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public int getIndexNr() {
        return indexNr;
    }

    public String setName() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input name: ");
        name= scanner.next();
        return name;
    }

    public void readFromScanner() {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Name: ");
        name= scanner.next();

        System.out.println("Last name: ");
        lastName= scanner.next();

        System.out.println("Index: ");
        indexNr= scanner.nextInt();
    }

    public void print() {
        System.out.println(name + " " + lastName + ", " + indexNr);
    }
}
