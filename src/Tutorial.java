import tutorialClass.*;
import java.util.Scanner;

public class Tutorial {
    public Tutorial(Scanner iptTutorial){
        int week;
        System.out.print("Week: ");
        week = iptTutorial.nextInt();
        switch (week){
            case 1: T1();break;
            case 2: T2(iptTutorial);break;
            case 3: T3(iptTutorial);break;
            case 4: T4Main.start(iptTutorial);break;
            case 5: T5(iptTutorial);break;
            case 6: T6();break;
            case 7: break;
            case 8: T8();break;
            default: break;
        }
    }
    private void T1(){
        System.out.println("¯\\(ツ)/¯");
    }
    private void T2(Scanner iptT2){
        String[] IF = {"a", "b", "c"};
        String[] CE = {"d", "e", "f"};
        String[] IS = {"g", "h", "i"};
        System.out.println("kategori matkul");
        System.out.println("1. if\n2. ce\n3. is");
        System.out.print("pilih: ");
        int ipt = iptT2.nextInt();
        switch (ipt){
            case 1: show(IF);break;
            case 2: show(CE);break;
            case 3: show(IS);break;
            default: break;
        }
    }
    private void show(String[] matkuls){
        for(String matkul : matkuls){
            System.out.println("- " + matkul);
        }
    }
    private void T3(Scanner iptT3){
        String[] IF = {"a", "b", "c"};
        String[] CE = {"d", "e", "f"};
        String[] IS = {"g", "h", "i"};
        System.out.println("kategori matkul");
        System.out.println("1. if\n2. ce\n3. is");
        System.out.print("pilih: ");
        int ipt = iptT3.nextInt();
        switch (ipt){
            case 1: show(IF);break;
            case 2: show(CE);break;
            case 3: show(IS);break;
            default: break;
        }
    }
    private void T5(Scanner iptT5){
        System.out.print("Jari-jari lingkaran: ");
        double radius = iptT5.nextDouble();
        iptT5.nextLine();
        System.out.print("Warna: ");
        String warna = iptT5.nextLine();

        Circle circle = new Circle(warna, radius);
        System.out.println("----Lingkaran----");
        System.out.printf("%-20s: %s\n%-20s: %f\n%-20s: %f\n%-20s: %f\n", "Warna", circle.get_color(),
                "Jari-jari",circle.get_radius(),"Keliling",circle.getPerimeter(), "Luas", circle.getArea());

    }
    private void T6(){

    }
    public void T8() {
        Payment creditCardPayment = new Credit(100.0, "1234-5678-9012-3456");
        Payment bankTransferPayment = new Bank(300.0, "9876543210");

        creditCardPayment.paymentDetail();
        creditCardPayment.processPayment();

        bankTransferPayment.paymentDetail();
        bankTransferPayment.processPayment();
    }

}
