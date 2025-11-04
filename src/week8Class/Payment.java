package week8Class;

public abstract class Payment {
    protected boolean isPaidOff = false;
    protected Item item;
    public abstract int pay();

    public Payment() {
        this.item = null;
    }
    public Payment(Item item) {
        this.item = item;
    }

    public boolean isPaidOff() {
        return isPaidOff;
    }

    public Item getItem() {
        return item;
    }
    public String getItemName(){
        return item.getName();
    }
    public String getStatus(){
        if(isPaidOff) return "FINISHED";
        else return "ON PROGRESS";
    }
    public int getRemainingAmount(){
        if(isPaidOff) return 0;
        else return item.getPrice();
    }
}
