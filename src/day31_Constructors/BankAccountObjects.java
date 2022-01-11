package day31_Constructors;

public class BankAccountObjects {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Kaiser Keram",123456789);

        System.out.println(account1);

        account1.deposit(500);
        account1.checkBalance();

        account1.withdraw(200);
        account1.checkBalance();

        account1.deposit(8000);
        account1.checkBalance();

        account1.withdraw(2000);
        account1.checkBalance();

        account1.withdraw(20000);
        account1.checkBalance();

        System.out.println("-----------------------------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Aygun", 123456987);

        account2.deposit(15000);
        account2.checkBalance();

        account2.withdraw(1400);
        account2.checkBalance();


    }

}
