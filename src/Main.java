import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iptScanner = new Scanner(System.in);
        System.out.println("Hello and welcome!");
        System.out.print("Week (0 for tutorial): ");
        int x = iptScanner.nextInt();
        iptScanner.nextLine();

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
                new Week4(iptScanner);
                break;
            case 5:
                new Week5(iptScanner);
                break;
            case 6:
                new Week6(iptScanner);
                break;
            case 7:
                new Week7();
                break;
            case 8:
                new Week8(iptScanner);
                break;
            case 9:
                new Week9();
                break;
            case 10:
                new Week10(iptScanner);
                break;
//            case 11:
//                new Week6(iptScanner);
//                break;
//            case 12:
//                new Week6(iptScanner);
//                break;
            default:
                break;
        }
        iptScanner.close();
    }
}