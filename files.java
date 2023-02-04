import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class files {
    public static void main(String[] args) {
        File f = new File("/user/ruthvik/Desktop/myTestfile.txt");
        if(f.exists()){
            System.out.println("Printing File Details");
            System.out.println("----------------------");

            System.out.println("File Name : "+f.getName());
            System.out.println("File Size : "+f.length());
            System.out.println("File Path : "+f.getAbsolutePath());
            System.out.println("is File Readable : "+f.canRead());
            System.out.println("File Path : "+f.canWrite());
            System.out.println("----------------------");
            // creating directory in Java
            File f1 = new File("/user/ruthvik/Desktop/avengers");
            f1.mkdir();

        }
    }
}
