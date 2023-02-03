import java.util.ArrayList;
import java.util.Comparator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList <String>cart0 = new ArrayList<>();
        //add elements
        cart0.add("mumbai");
        cart0.add("delhi");
        cart0.add("jalandhar");
        cart0.add("kochi");
        String s= cart0.get(2);
        System.out.println("I got "+s);
        System.out.println("ArrayList Size "+cart0.size());
        for(int i = 0;i< cart0.size();i++){
            System.out.println(cart0.get(i));
        }
        //update elements
        cart0.set(2,"vijayawada");
        System.out.println("After Upadtion : "+cart0);
        //Removing elements
        String t =cart0.remove(0);
        System.out.println("String removed "+t);
        System.out.println(cart0);
        //sorting
        //get index of elements
        System.out.println("index of delhi "+cart0.indexOf("delhi"));
        cart0.sort(Comparator.naturalOrder());
        System.out.println("Arrarlist after sorting"+cart0);
        //.contains() method
        System.out.println("is delhi there ?"+cart0.contains("delhi"));
        //you can check if list is empty or not
        System.out.println("Is List empty ? "+cart0.isEmpty());
        cart0.removeAll(cart0);
        System.out.println("Is List empty ? "+cart0.isEmpty());
        
    }
}
