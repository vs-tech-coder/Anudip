//1- Abstraction is the process of separating ideas from their action
/*2- In the computer science, Abstraction is used to separate
    ideas from their implementation
 3- Abstraction in java is used to define only ideas in one class so that the
    idea can be implemented by its sub classes according to their requirements
4- Abstraction in java is implemented using Abstract classes and interfaces.
5 - class which declare as abstract notnecessary it must have abstarct method, but if u declare
method as abstact class must b abstrat class
*/


abstract class AbstractAnimal {
    abstract void SoundOfAnimal();  //abstract method
    abstract  void colorOfAnimal();     //abstract method
    public void speak(){                //concrete method

        System.out.println("he sepak");
    }

    class Dog extends  AbstractAnimal{
        @Override
        void SoundOfAnimal() {
            System.out.println("Bark");
        }

        @Override
        void colorOfAnimal() {
            System.out.println("Black");
        }
    }
    class Cat extends AbstractAnimal{
        @Override
        void colorOfAnimal() {
            System.out.println("meo meo");
        }

        @Override
        void SoundOfAnimal() {
            System.out.println("White");
        }
    }
    public static void main(String[] args) {

    }
}
