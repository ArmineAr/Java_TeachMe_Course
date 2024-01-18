package myPackage;

public class Person {
    String name;
    int age;

{
    System.out.println("new object");
    //        System.out.println(name + " "+ age); TODO ???

}

   public Person(String name,int age){
        this.name=name;
        this.age=age;
        //TODO ?? can i print here ?

    }

    public void print1(){
        System.out.println(name +" "+ age); //??? todo
    }
}
