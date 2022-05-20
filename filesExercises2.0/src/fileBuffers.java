import java.io.*;

public class fileBuffers {

    public static void main(String[] args) {

        String from_filename = args[0];
        String to_filename = args[1];

        File copy_from = new File(from_filename);
        File copy_to = new File(to_filename);

        FileInputStream read_from = null;
        FileOutputStream write_to = null;

        long startTime = System.currentTimeMillis();
        try {
            read_from = new FileInputStream(copy_from);

            write_to = new FileOutputStream(copy_to);

            int data;
            byte[] buffer = new byte[4096];

            while((data = read_from.read(buffer)) != -1 )
                write_to.write(buffer);

            }catch(FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                try {
                    read_from.close();
                    write_to.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
        }
        long endtime = System.currentTimeMillis();
        long timeelapsed = endtime - startTime;

        System.out.println("Execution time in milliseconds " + timeelapsed);
    }

}
