import java.util.InputMismatchException;
import java.util.Scanner;

class trycatch {
    int n1,n2,result;
    Scanner sc = new Scanner(System.in);

    void cal(){
        try{
            System.out.println("Enter first number");
            n1=sc.nextInt();
            System.out.println("Enter second number");
            n2=sc.nextInt();
            result =n1+n2;
            System.out.println(result);

        }
        catch(InputMismatchException e){
            System.out.println("IM EXCEPTION");
        }
        catch(ArithmeticException e){
            System.out.println("AM EXCEPTION");
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        trycatch obj = new trycatch();
        obj.cal();
    }
}
