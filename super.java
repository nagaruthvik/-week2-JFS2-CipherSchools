class Superimp{
    Superimp(){
        System.out.println("Constructor of Superimp");
    }
    Superimp(int num){
        System.out.println(num);
    }
}
public class Super extends Superimp {
    Super(){
        super(20);
        System.out.println("Constructor of Super");

    }
    public static void main(String [] args){
        new Super();
    }
}
