package com.wrapper;

//DataTypes         Wrapper Class
//byte       -->     Byte   //collection Of Object    //collection of API
//short      -->     Short
//int        -->     Integer
//long       -->     Long
//float      -->     Float
//double     -->    Double
//char       -->     Character
//boolean    -->    Boolean

/*
                                    Object
                                       |
                                     Number                                 |---->Auto Upcasting
                                       |                                    |
         Byte     Short      Integer       Long       Float       Duble     |
                                                                            |
                                                                            ^
         byte      short     int           long       float       double    |   Auto-Boxing
                                                                            |
----------------------->Auto Windening----------------------------------->
*/


public class WrapperDemo {

    static void overloadMethod(Integer i)                 //overloading of method
    {
        System.out.println("Integer Wrapper class type");

    }
    static void overloadMethod(long l)   //autowinding -->because the long is primitive and int is also primitive  due to that it convert int to long not in Integer
                                        // overloading of method
    {

        System.out.println("long primitive type");
    }
    public static void main(String[] args) {
        int i = 21;
        overloadMethod(i);

    }
}
