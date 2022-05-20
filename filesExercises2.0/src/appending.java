import java.io.*;

public class appending {

    public static void main(String[] args) {
        File file3 = new File("C:\\test_wr3.txt");
        FileWriter fw3 = null;
        PrintWriter pw = null;

        int data1 = 1234;
        double data2 = 15.4;
        String data3 = "Hello";

        try {

            fw3 = new FileWriter(file3, true);
            pw = new PrintWriter(fw3);

            pw.println(data1);
            pw.println(data2);
            pw.println(data3);
            pw.println();
            pw.printf("%d \t %f \t %s", data1, data2, data3);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            pw.close();
        }

    }

}
