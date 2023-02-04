import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("/user/ruthvik/Desktop/pokemon.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        ArrayList<String> pokemons = new ArrayList<String>();
        while ((line= br.readLine())!=null){
            pokemons.add(line);

        }
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        for(String pok : pokemons){
            String ptype = pok.split(",")[1];
            if(ptype.equals(type)){
                System.out.println(pok);
            }
        }
    }
}
