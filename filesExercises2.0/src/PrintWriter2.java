import java.io.*;

public class PrintWriter2 {

    public static void main(String[] args) {
        File file2 = new File("C:\\test_write3.txt");
        FileWriter fw2 = null;
        PrintWriter pw = null;

        int data2 = 1234;
        double data3 = 15.4;
        String data4 = "Hello";

        try{
            fw2 = new FileWriter(file2);
            pw = new PrintWriter(fw2);

            pw.println(data2);
            pw.println(data3);
            pw.println(data4);
            pw.println();
            pw.printf("%d \t %f \t %s", data2, data3, data4);

            System.out.println("Successfully written to file");

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            pw.close();
        }
    }
}
