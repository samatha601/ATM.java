
import java.util.Scanner;
public class ATM {
    public static void main(String args[]) {
        // declare and initialize balance, withdraw, and deposit
        int balance = 5000, withdraw, deposit;
        // create scanner class object to get choice of user
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("**Automated Teller Machine**");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. EXIT");
            System.out.print("Choose the operation you want to perform:");

            // get choice from user
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn:");

                    // get the withdrawl money from user
                    withdraw = sc.nextInt();

                    // check whether the balance is greater than or equal to the withdrawal amount
                    if (balance >= withdraw) {
                        // remove the withdrawl amount from the total balance
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        // show custom error message
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");

                    // get deposite amount from te user
                    deposit = sc.nextInt();

                    // add the deposit amount to the total balanace
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully depsited");
                    System.out.println("");
                    break;

                case 3:
                    // displaying the total balance of the user
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;

                case 4:
                    // exit from the menu
                    System.exit(0);
                default:
                    //default statement
                    System.out.println("Invalid Choice");
            }
        }
    }
}