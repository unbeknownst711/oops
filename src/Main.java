import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iptScanner = new Scanner(System.in);
        System.out.println("Hello and welcome!");
        System.out.print("Week (0 for tutorial): ");
        int x = iptScanner.nextInt();
//        iptScanner.nextLine();

        switch (x) {
            case 0:
                new Tutorial(iptScanner);
                break;
            case 1:
                new Week1();
                break;
            case 2:
                new Week2(iptScanner);
                break;
            case 3:
                new Week3(iptScanner);
                break;
            case 4:
                new Week4();
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