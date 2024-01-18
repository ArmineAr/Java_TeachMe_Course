package myPackage;
import myPackage.A;
import static myPackage.A.main1;
//import static myPackage.A.*;
//import static myPackage.A.a;

public class AccessModifiers {
    public static void main(String[] args) {
        main1();
        A aObj= new A();
        aObj.main2();
        System.out.println(A.a);
    }
    public void main3(){

    }
}
