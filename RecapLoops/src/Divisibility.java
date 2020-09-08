public class Divisibility {
    public static void main(String[] args) {
        divisible(16,5);
    }
    public static void divisible (int firstNum, int secondNum){
        for (int i = 1; i <= firstNum; i++){
            if (i%secondNum == 0){
                System.out.println(i + " is divisible by " + secondNum);
            }
        }
    }
}
