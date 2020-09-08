public class MultiplicationTable {
    public static void main(String[] args) {
        multiplication(2);
    }
    public static void multiplication(int number){
        for (int i = 1; i <= 10; i++){
            int result = i * number;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
