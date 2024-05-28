/* inheritance --> single,multiple,multilevel, hierarchical, hybrid
* multiple Inheritance -- 2 parent class cannot be extend by 1 child class
*interface called pure abstraction because no concrete method
*  parmanent emp IS A employee         //IS A relation subclass to superclass relationship    //HAS A relation instance of another class as a field
* Temprory Emp IS A employee
*
* Temperory Emp IS A Employee and Permenent Employee
* one class implement another interface----> Interface
* one class extends another class---->Inheritance
*
* all method in interface are by default abstract method and public
*  */

interface Employee          //by default interface keyword is a abstract
{
    int HRA = 10000;// it is final cannot be change
                    //HRA = 1500;
    int a=1;
                            //alwawys should be initialize not allowed only declare    not declare private by defalult it is public and static
      void salary();     //no concrete method allowed in interface is till java 1.7 version
                        //but after java 1.7 version the defination for interface is change
                         // concrete method allowed in abstract class

    void leave();

}
class Permenent_emp implements Employee
{
    @Override
    public void salary()
    {
        System.out.println("Salary = Basic + "+HRA +" + bonus");
    }

    @Override
    public void leave()
    {
        System.out.println("Leave = 20");
    }
}
class Contractual_emp implements Employee
{
    @Override
    public void salary()
    {
        System.out.println("Salary = Basic + " + HRA);

    }

    @Override
    public void leave()
    {
        System.out.println("Leave = 15");

    }
}

public class InterfaceSample {

    public static void main(String[] args) {

      //  Employee emp = new Employee() {   //compiler error for creating object for interface
                                            //we cannot cretae the object from the interface

        Permenent_emp pe = new Permenent_emp();
        pe.salary();
        pe.leave();

        Contractual_emp ce = new Contractual_emp();
        ce.salary();
        ce.leave();
        }
    }
