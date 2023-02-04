import java.io.FileWriter;
import java.io.IOException;

public class file1
{
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/user/ruthvik/Desktop/TestFile.txt");
        fw.write("I am the Earth \n");
        fw.write("I am the Forest Green \n");
        fw.write("I am the Four Winds Blowing \n");
        fw.write("I am the Earth \n");
        fw.flush();
        fw.close();
        System.out.println("File Prepared Succesfully!");
    }
}
