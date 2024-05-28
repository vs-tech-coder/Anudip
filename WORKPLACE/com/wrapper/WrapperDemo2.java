package com.wrapper;

public class WrapperDemo2 {                 //auto up casting
    static void overloadMethod(Number n)    //Unboxing  ---> whrere the int converted into Integer
                                            // overloading of method
    {
        System.out.println("Number type class");

    }
    static void overloadMethod(Double l)          //overloading of method
    {

        System.out.println("long primitive type");
    }
    static void overloadMethod(Long l)          //overloading of method
    {

        System.out.println("long primitive type");
    }
    public static void main(String[] args) {
        int i = 21;
        overloadMethod(i);

    }
}
