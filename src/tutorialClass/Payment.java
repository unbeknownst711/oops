package tutorialClass;

public abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }
    public abstract void processPayment();
    public void paymentDetail(){
        System.out.println("Processing $" + amount);
    }
}
