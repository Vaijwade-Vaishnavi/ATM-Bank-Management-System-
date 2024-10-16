import java.util.Scanner;

class AtmProject {
    float balance;
    int PIN = 1511;

    AtmProject() {
        System.out.println("*********************************************************************************************************************************");
    }

    public void checkPin() {
        System.out.println("Enter your PIN:");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if (enteredPin == PIN) {
            menu();
        } else {
            System.out.println("Entered an invalid PIN.");
            checkPin();
        }
    }

    public void menu() {
        System.out.println("Enter your choice:");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                checkBalance();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                deposit();
                break;
            case 4:
                System.out.println("Exit");
                System.out.println("THANK YOU.....!");
                break;
            default:
                System.out.println("Entered an invalid choice.");
                menu();
                break;
        }
    }

    void checkBalance() {
        System.out.println("Total Balance: " + balance);
        menu();
    }

    void withdraw() {
        System.out.println("Enter amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn successfully.");
        } else {
            System.out.println("Insufficient Balance.");
        }
        checkBalance();
    }

    void deposit() {
        System.out.println("Enter amount to deposit:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance += amount;
        System.out.println("Deposited successfully.");
        System.out.println("After deposite your Total Balance is: " + balance);
        menu();
    }

    public static void main(String[] args) {
        AtmProject obj = new AtmProject();
        obj.checkPin();
    }
}


