import java.io.File;

public class filehandling {
    public static void main(String[] args) {
        File f = new File("/user/ruthvik/Desktop/datasets.txt");
        String [] files = f.list();
        for(String file : files){
            System.out.println(files);

        }
        File[] files_arr = f.listFiles();
        for(File ff : files_arr){
            ff.delete();
        }

    }
}
