import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedWriter2 {

    public static void main(String[] args){

        File file2 = new File("C:\\test_wr2.txt");
        FileWriter fr3 = null;
        BufferedWriter bw1 = null;

        String data2 = "1234567";
        String dataWithNewLine = data2 + System.getProperty("line.separator");

        int noOflines = 10;

        try {
            fr3 = new FileWriter(file2);
            bw1 = new BufferedWriter(fr3);

            for (int i = noOflines; i>0; i--){
                bw1.write(dataWithNewLine);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {

            try {
                bw1.close();
                fr3.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
