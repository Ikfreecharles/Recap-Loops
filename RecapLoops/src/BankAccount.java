import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        accountBalance(300);
    }
    public static void accountBalance (int current){
        Scanner input = new Scanner(System.in);
        int currentBal = current;

        while (currentBal > 0){
            System.out.println("Kindly enter the amount:");
            int amount = input.nextInt();

            System.out.println("Enter 1 to deposit /n Enter 2 to withdraw");
            int option = input.nextInt();

            if (option == 1){
                currentBal += amount;
            } else if(option == 2){
                currentBal -= amount;
            }else{
                System.out.println("Invalid option");
            }
            System.out.println("Your current balance is " + currentBal);
        }
        System.out.println("You have no money in the account. Program stopped.....");
    }
}
