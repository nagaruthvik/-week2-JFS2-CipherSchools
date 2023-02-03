class Thiskeyword{
    int arg = 5;
    public int num(int arg){
        return this.arg = arg;
    }
}
public class This {
    public static void main(String[] args){
        int arg = 10;
        Thiskeyword ibj = new Thiskeyword();
        ibj.num(arg);
        System.out.println(ibj.arg);
    }
}
