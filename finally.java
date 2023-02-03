public class Finally {
    int getNextno(int n){
        try{
            if(n==5){
                return n+1;
            }
        }
        finally {
            System.out.println("this is important code");
        }
        return n-1;
    }

    public static void main(String[] args) {
        Finally obj = new Finally();
        System.out.println(obj.getNextno(5));
    }
}
