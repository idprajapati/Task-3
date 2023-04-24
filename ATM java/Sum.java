import java.util.Scanner;

class Bank {
    int total = 100;

    void withdrawn(String name, int withdrawal) {
        if (total >= withdrawal) {
            System.out.println(name + " withdrawn "
                    + withdrawal);

            total = total - withdrawal;
            System.out.println("Balance after withdrawal: "
                    + total);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(name
                    + " you can not withdraw "
                    + withdrawal);

            System.out.println("your balance is: " + total);
            try {
                Thread.sleep(1000);
            }

            catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }

    void deposit(String name, int deposit) {
        System.out.println(name + " deposited " + deposit);
        total = total + deposit;
        System.out.println("Balance after deposit: "
                + total);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ATM {

    public static void main(String[] args) {
        int total, amt, ch;
        total = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM");
        System.out.println("1.Check Balance");
        System.out.println("2.Withdraw");
        System.out.println("3.Deposit");
        System.out.println("4.Transaction History");
        System.out.println("5.Exit");
        System.out.println("Enter your Choice:");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Your balance is :" + total);
                break;
            case 2:
                System.out.println("Enter amount to withdraw:");
                amt = sc.nextInt();
                if (total >= amt) {
                    total = total - amt;
                    System.out.println("Your new balance is :" + total);
                } else {
                    System.out.println("Insufficient Funds!");
                }
                break;
            case 3:
                System.out.println("Enter amount to deposit:");
                amt = sc.nextInt();
                total = total + amt;
                System.out.println("Your new balance is :" + total);
                break;
            case 4:
                Bank obj = new Bank();

                obj.withdrawn("Rahul", 20);
                obj.withdrawn("Krishna", 40);
                obj.deposit("Sushil", 35);
                obj.withdrawn("Dhawan", 80);
                obj.withdrawn("Shubham", 40);
                break;
            case 5:
                System.out.println("Thank you!");
                break;
            default:
                System.out.println("Enter the correct choice...");
                break;

        }
    }
}
