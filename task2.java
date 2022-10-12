import java.util.Scanner;

public class task2 {

    public static void main(String args[]) {

        int bal = 0, withdrawal, deposits;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(" WELLCOME TO ATM Machine\n");

            System.out.println(" WHAT YOU WANT \n");
            System.out.println("Enter/chooes 1 for Withdraw");
            System.out.println("ENTER/Choose 2 for Deposit");
            System.out.println("Enter/Choose 3 for Check Balance");
            System.out.println("Enter/Choose 4 for EXIT\n");
            System.out.print("Choose the operation:");

            int pick = sc.nextInt();
            switch (pick) {
                case 1:
                    System.out.print("Enter  the money you want  to be Withdrawal:");

                    withdrawal = sc.nextInt();

                    if (bal >= withdrawal) {

                        bal = bal - withdrawal;
                        System.out.println("Please collect your money");
                    } else {

                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");

                    deposits = sc.nextInt();

                    bal = bal + deposits;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:

                    System.out.println("Balance is : " + bal);
                    System.out.println("");
                    break;

                case 4:

                    System.exit(0);
            }
        }
    }
}