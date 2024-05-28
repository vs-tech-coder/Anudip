import java.util.ArrayList;


interface Employee1
{


}
interface Employee2 extends Employee1   //one interface extendes to another interface   i.e.    interface to interface --> extends
                                        //one interface implements to another class    i.e.     interface to class ---> implements
                                        //one class inheritance extends another class  i.e.     class to class --->extends
{

}
class Employee4
{


}
class Employee5
{

}

class Permenent_emp1 extends  Employee4 implements  Employee1,Employee2
{


}
class Contractual_Employee extends Employee5 implements Employee1,Employee2
{

}

public class InterfaceSample1 {

}

