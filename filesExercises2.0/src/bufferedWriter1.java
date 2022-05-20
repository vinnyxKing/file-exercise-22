import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//writing a file using buffered writer

public class bufferedWriter1 {

    public static void main(String[] args) {
        File file1 = new File("C:\\text_write.txt");
        FileWriter fr2 = null;
        BufferedWriter bw = null;
        String data1 = "1234567";

        int noOfLines = 10;

        try{
            fr2 = new FileWriter(file1);
            bw = new BufferedWriter(fr2);

            for (int i = noOfLines; i>0; i--)
                bw.write(data1);

            System.out.println("Successfully wrote to a file");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bw.close();
                fr2.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}
