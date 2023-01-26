package ZadaniaReszta;

public class Main {
    public static void main(String[] args) {

        SecretStudent secretStudent= new SecretStudent();
        System.out.println(secretStudent.getName() + " " + secretStudent.getLastName() + ", " + secretStudent.getIndexNr());

        String name= secretStudent.setName();
        System.out.println(name);

        SecretStudent secretStudent1= new SecretStudent();
        secretStudent1.readFromScanner();
        secretStudent1.print();

        SecretStudent secretStudent2= new SecretStudent();
        secretStudent2.readFromScanner();
        secretStudent2.print();
    }
}
