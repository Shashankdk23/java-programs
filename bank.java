import java.util.Scanner;

class Account {
    Scanner s = new Scanner(System.in);
    public String name;
    long accountnum;
    int accountType;
    
}

class currentAccount extends Account {
    double penaltyPercent = 0.1;
    double balance = 0;

    void creation() {
        System.out.println("enter your name");
        name = s.nextLine();
        System.out.println("enter account number");
        accountnum = s.nextLong();
        System.out.println("enter amount greater than 5000 rupees");
        balance = s.nextDouble();
    }
    void balance() {
        if (balance < 5000) {
            Double penalty = balance * penaltyPercent;
            balance -= penalty;
            System.out.println("penalty amount reduced because of low balance " + penalty + " rupees");
        }
        System.out.println("your account balance is " + balance);
    }

    void chequeBook() {
        System.out.println("you can avail chequeBook");
    }

    void deposit() {
        System.out.println("enter amount you want to deposit");
        balance += s.nextDouble();
    }

    void withdraw() {
        if (balance < 5000) {
            System.out.println("your account balance is lower than 5000 rupees so you can't withdraw");
        } else {
            System.out.println("enter amount you want to withdraw");
            balance -= s.nextDouble();
        }
        balance();
    }
}

class savingAccount extends Account {
    double interest = 6;
    int year;
    double balance = 0;

    void creation() {
        System.out.println("enter your name");
        name = s.nextLine();
        System.out.println("enter account number");
        accountnum = s.nextLong();
        System.out.println("enter amount greater than 5000 rupees");
        balance = s.nextDouble();
    }
    void chequeBook() {
        System.out.println("you can't avail chequeBook");
    }

    void balance() {
        System.out.println("enter the year passed after deposition of amount");
        year = s.nextInt();
        balance += (balance * interest * year / 100);
        System.out.println("your account balance is " + balance);
    }

    void deposit() {
        System.out.println("enter amount you want to deposit");
        balance += s.nextDouble();
    }

    void withdraw() {
        if (balance < 5000) {
            System.out.println("your account balance is lower than 5000 rupees so you can't withdraw");
        } else {
            System.out.println("enter amount you want to withdraw");
            balance -= s.nextDouble();
        }
        balance();
    }
}

public class bank {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter account type you want to have 1 for currentAccount\n2 for savingAccount");
        int n = s.nextInt();
        if (n == 1) {
            currentAccount c = new currentAccount();
            c.creation();
            Boolean b = true;
            while (b) {
                System.out.println("enter 1 for deposit\n2 for withdraw\n3 for balance\n4 for cheque book\n5 to exit");
                int ch = s.nextInt();
                switch (ch) {
                    case 1:
                        c.deposit();
                        break;
                    case 2:
                        c.withdraw();
                        break;
                    case 3:
                        c.balance();
                        break;
                    case 4:
                        c.chequeBook();
                        break;
                    case 5:
                        System.out.println("Successfully logged out of your account");
                        b = false;
                        break;
                    default:
                        System.out.println("invalid input");
                        break;
                }
            }
        } else {
            Boolean b = true;
            savingAccount sa = new savingAccount();
            sa.creation();
            while (b) {
                System.out.println("enter 1 for deposit\n2 for withdraw\n3 for balance\n4 for cheque book\n5 to exit");
                int ch = s.nextInt();
                switch (ch) {
                    case 1:
                        sa.deposit();
                        break;
                    case 2:
                        sa.withdraw();
                        break;
                    case 3:
                        sa.balance();
                        break;
                    case 4:
                        sa.chequeBook();
                        break;
                    case 5:
                        System.out.println("Successfully logged out of your account");
                        b = false;
                        break;
                    default:
                        System.out.println("invalid input");
                        break;
                }
            }
        }
        s.close();
    }
}