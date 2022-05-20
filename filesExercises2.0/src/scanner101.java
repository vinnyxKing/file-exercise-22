import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class scanner101 {

    public static void main(String[] args) {
        File readFile = new File("C:\\test123.txt");
        Scanner fs = null;

        try {
            fs = new Scanner(readFile);
             while (fs.hasNext()){
                 System.out.println(fs.next());
                 System.out.println(fs.nextDouble());
                 System.out.println(fs.next());
                 System.out.println(fs.nextInt());
             }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            fs.close();
        }

    }

}
