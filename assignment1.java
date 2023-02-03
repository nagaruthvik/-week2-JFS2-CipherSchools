class A{
    public void displayofa(){
        System.out.println("Class A");
    }
}
class B extends  A{
    public void displayofb(){
        System.out.println("Class B");
    }
}
class C extends B{
    public void displayofc(){
        System.out.println("Class C");
    }
}
public class assignment1 {
    public static void main(String [] args){
        B b = new B();
        b.displayofa();
        b.displayofb();
        C c = new C();
        c.displayofb();
        c.displayofc();

    }
}
