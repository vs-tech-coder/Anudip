class ArryCpy {
    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5, 6};    //arry  of size 5

        int [] CopyNumbers = numbers;    // copying arrays

        for (int number: CopyNumbers) {
            System.out.print(number + ", ");
        }
    }
}