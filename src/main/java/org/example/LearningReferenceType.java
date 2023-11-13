package org.example;

import java.awt.*;

public class LearningReferenceType {
    static Point obj4;
    public static void main(String[] args) {
        Point obj1= new Point(1,2);
        Point obj2= obj1;
        // obj2.y=3;
        System.out.println(obj1.y); //as obj1 and 3 show on the same object,
        // each one can change the object and it will affect the other one
        //obj2+obj1  only =,!=,== can be used on reference types
        System.out.println(obj1==obj2);
        Point obj3= new Point(1,2);
        System.out.println(obj1==obj3);
        // System.out.println(obj4.getX()); nullpointer as the reference exists but object doesnt

        int[] arr1= new int[2]; //size of the array needs to be defined (ex.2)
        arr1[0]=1;
        arr1[1]=2 ; //if not mentioned by default value will be 0

        for (int i: arr1) {  //i is not an index but the element of array
            System.out.println(i);
        }
        System.out.println(arr1.length);

        String arr2[]={"a","b","c"}; //  [] can be either after type or name of array
        for (int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
        System.out.println(arr2.toString()); //it doesnt return array as string just the address of it
        String arr3[]=arr2; //
        arr3[0]="Armine";
        System.out.println(arr2[0]);
        changeFirstElement(arr3);
        System.out.println(arr2[0]);

    }
        public static void changeFirstElement(String[] array){
        array[0]= "abs";
        }
}
