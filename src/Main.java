public class Main {
    public static void main(String[] args) {

        Account salaryAccount = new Account();
        Account savingAccount = new Account(1000.0);

        salaryAccount.deposit(100.0);
        savingAccount.deposit(200.0);

        double money = salaryAccount.withdraw(100);
        System.out.println("Uttag: " + money);


        System.out.println("Lönkont: " + salaryAccount.getBalance());
        System.out.println("Sparkonto: " + savingAccount.getBalance());



    }
}