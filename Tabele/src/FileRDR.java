import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRDR {
    public static void main(String[] args) throws IOException {
        FileReader fr= new FileReader("C:\\Users\\Chris\\Desktop\\imiona.txt");
        BufferedReader br= new BufferedReader(fr);
        //String imie1= br.readLine();
        //String imie2= br.readLine();


        String line= " ";
        //line= br.readLine();
        while(line != null){
            System.out.println(line);
            line= br.readLine();
        }

    }
}
