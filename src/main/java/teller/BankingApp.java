package teller;
import java.util.Scanner;
public class BankingApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Bank myBank = new Bank();
        BankAccount account1 = new BankAccount("1111", "Checking", 500);
        BankAccount account2 = new BankAccount("2222", "Savings", 1000);

        myBank.add(account1);
        myBank.add(account2);

        String userChoice;

        do {
            System.out.println("These are your accounts with us");
            myBank.showAccounts();

            System.out.println("What would you like to do?");
            System.out.println("Choose an option");
            System.out.println("Press 1 to deposit funds");
            System.out.println("Press 2 to withdrawal funds");
            System.out.println("Press 3 to check your balance");
            System.out.println("Press 4 to close an account");
            System.out.println("Press 5 to exit");
            userChoice = input.nextLine();

            if (userChoice.equals("1")) {
                System.out.println("You want to deposit");
                System.out.println("Here are your accounts");
                myBank.showAccounts();

                System.out.println("Select an account by (account number) to make a transaction");
                String accountNum = input.nextLine();
                System.out.println("Enter the amount to deposit");
                int amountToDeposit = input.nextInt();
                input.nextLine();
                myBank.deposit(accountNum, amountToDeposit);
                System.out.println("Your current balance is " + myBank.findAccount(accountNum).getBalance());
            } else if(userChoice.equals("2")){
                System.out.println("You want to withdrawal");
                System.out.println("Here are your accounts");
                myBank.showAccounts();

                System.out.println("Select an account by (account number) to make a transaction");
                String accountNum = input.nextLine();
                System.out.println("Enter the amount to withdrawal");
                int amountToWithdrawal = input.nextInt();
                input.nextLine();
                myBank.withdrawal(accountNum, amountToWithdrawal);
                System.out.println("Your current balance is " + myBank.findAccount(accountNum).getBalance());
            }else if (userChoice.equals("3")){
                System.out.println("You want to check your balance");
                System.out.println("Here are your accounts");
                myBank.showAccounts();
            }

        } while (!userChoice.equals("5"));
        System.out.println("Thank you for banking with us!");

    }


}
