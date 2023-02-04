import java.util.ArrayList;

public class StreamProcessing {
    public static void change(String m){
        System.out.println(m.toUpperCase());
    }
    public static void main(String[] args) {
        ArrayList<String> lang = new ArrayList<String>();
        lang.add("java");
        lang.add("csharp");
        lang.add("Python");
        lang.add("PHP");

        lang.forEach(StreamProcessing::change);
        change(lang.get(0));
        change(lang.get(1));
        change(lang.get(2));
        change(lang.get(3));


    }
}
