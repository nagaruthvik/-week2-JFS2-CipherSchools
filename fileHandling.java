import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class file2 {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("/user/ruthvik/Desktop/rhyme.txt");
        BufferedReader br = new BufferedReader(fr);


        String line;
        ArrayList<String> pokemons = new ArrayList<String>();
        br.readLine();
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        System.out.println("Total Pokemons "+pokemons.size());
        ArrayList<String> pokemonsTitles = new ArrayList<>();
        for(String pok : pokemons){

            String title = pok.split(",")[0];
            pokemonsTitles.add(title);
        }
        System.out.println(pokemonsTitles);
        br.close();
        fr.close();
    }
}
