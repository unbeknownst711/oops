package week8Class;

public class Credit extends Payment{
    private int inst, totinst;
    public Credit(Item item, int inst) {
        super(item);
        this.inst = inst;
        totinst = 0;
    }

    public int pay() {
        if(isPaidOff) return 0;
        totinst += this.item.getPrice()/inst;
        if(totinst>=this.item.getPrice()) isPaidOff = true;
        return this.item.getPrice()/inst;
    }
    public String getClassName(){
        return "CREDIT";
    }
    public int getRemainingAmount(){
        if(isPaidOff) return 0;
        else return item.getPrice() - totinst;
    }
}