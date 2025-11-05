package tutorialClass;

public class Bank extends Payment {
    private String bankAccount;
    public Bank (double amount, String bankAccount) {

        super(amount);
        this.bankAccount = bankAccount;}
        @Override
        public void processPayment() {

        System.out.println("Processing bank transfer payment of $" + amount + "for bank account" + bankAccount);}}