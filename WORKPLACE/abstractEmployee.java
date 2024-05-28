abstract class abstractEmployee {
    int id;
    public  abstractEmployee(){

    }
    public abstractEmployee(int a){

    }
    abstract void salary();
    abstract  void leave();

    class ContractEmp extends abstractEmployee{
        @Override
        void salary() {
            System.out.println("16000");
        }

        @Override
        void leave() {
            System.out.println("no leave");
        }
        public class AbstractDemo1{
            public  void main(String[] args) {
                ContractEmp em = new ContractEmp();
                em.salary();
                em.leave();
            }
        }
    }
}
