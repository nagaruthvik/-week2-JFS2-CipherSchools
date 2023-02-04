import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class hashset {
    public static void main(String[] args) {
        HashSet myset = new HashSet();
        myset.add("green");
        myset.add("red");
        myset.add("orange");
        myset.add("red");
        myset.add("orange");
        System.out.println(myset);
        LinkedList lg= new LinkedList();
        lg.add("green");
        lg.add("red");
        lg.add("orange");
        lg.add("red");
        lg.add("orange");
        System.out.println(lg);
        TreeSet ts = new TreeSet();
        ts.add("cat");
        ts.add("Apple");
        ts.add("Ball");
        //does not allow null
        //ts.add(null);
        System.out.println(ts);

    }
}
