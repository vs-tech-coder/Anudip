

public class MethodOverloadingDemo {        //same name method having different parameters with same class

    int result;
    float Result1;

    public  void add(int a,int b){              //override of method

        result = a+b;
        System.out.println(result);
    }
    public void add(int a,int b,int c){          //override of method

        result = a+b+c;
        System.out.println(result);
    }
    public void add(int a, float b,int c,int d){         //override of method

        Result1 = a+b+c+d;
        System.out.println(Result1);
    }
    public static void main(String[] args) {

     MethodOverloadingDemo md = new MethodOverloadingDemo();
     md.add(3,5);
     md.add(2,4,5);
     md.add(3,4.2f,6,7);
    }
}
