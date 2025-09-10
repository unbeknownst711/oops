import java.util.Scanner;

public class Tutorial {
    public Tutorial(Scanner iptTutorial){
        int week;
        System.out.println("Week: ");
        week = iptTutorial.nextInt();
        switch (week){
            case 1: T1();break;
            case 2: T2(iptTutorial);break;
            case 3: T3();break;
            case 4: T4();break;
            case 5: T5();break;
            case 6: T6();break;
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
    private void T3(){

    }
    private void T4(){

    }
    private void T5(){

    }
    private void T6(){

    }
}
