import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class files {
    public static void main(String[] args) {
        File f = new File("/user/ruthvik/Desktop/myTestfile.txt");
        try{
            f.createNewFile();

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("file created succesfully..");
    }
}
