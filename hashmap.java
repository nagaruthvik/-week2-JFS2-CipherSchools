import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        HashMap mp = new HashMap<>();
        mp.put("vj","vijayawada");
        mp.put("dl","delhi");
        mp.put("kc","kochi");
        mp.put("mb","mumbai");
        System.out.println(mp);
        for(Map.Entry<String, String> e : mp.entrySet()){
            System.out.println(e.getKey()+" ---- "e.getValue());
        }
    }
}
