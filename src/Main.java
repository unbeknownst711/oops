import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iptScanner = new Scanner(System.in);
        System.out.println("Hello and welcome!");
        System.out.print("Week: ");
        int x = iptScanner.nextInt();

        switch (x) {
            case 1:
                Week1 objWeek1 = new Week1();
                break;
            case 2:
                Week2 objWeek2 = new Week2();
                break;
            case 3:
                Week3 objWeek3 = new Week3(iptScanner);
                break;
            case 4:
                Week4 objWeek4 = new Week4();
                break;
            case 5:
//                Week5 objWeek5 = new Week5();
                break;
            default:
                break;
        }
        iptScanner.close();
    }
}