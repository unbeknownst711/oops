import java.util.Scanner;

public class Week3 {
    public Week3(Scanner iptW3){
        System.out.print("Masukkan Nama: ");
        iptW3.nextLine();
        String _name = iptW3.nextLine();
        System.out.println("---------------------");
        System.out.println("String: " + _name);
        String[] choices = {
                "charAt", "length", "substring(n)", "substring(m,n)", "contains",
                "concat", "replace", "split", "lowerCase", "upperCase"
        };
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d. %-16s%d. %s\n", 2*i+1, choices[2*i], 2*i+2, choices[2*i+1]);
        }
        System.out.println("Menu: ");
        int choice = iptW3.nextInt();
        iptW3.nextLine();
        if(choice < 1 || choice > 10) return;
        System.out.println("-----" + choices[choice-1] + "-----");
        System.out.println("Name: " + _name);
        int hasilInt = -1;
        String[] hasilStr = {""};
        int temp1, temp2;
        String tempstr, tempstr2;
        switch (choice){
            case 1:
                System.out.print("Input: ");
                temp1 = iptW3.nextInt();
                hasilStr[0] = "" + _name.charAt(temp1);
                break;
            case 2:
                hasilInt = _name.length();
                break;
            case 3:
                System.out.print("Input: ");
                temp1 = iptW3.nextInt();
                hasilStr[0] = _name.substring(temp1);
                break;
            case 4:
                System.out.print("Mulai: ");
                temp1 = iptW3.nextInt();
                System.out.print("Akhir: ");
                temp2 = iptW3.nextInt();
                hasilStr[0] = _name.substring(temp1, temp2);
                break;
            case 5:
                System.out.print("Input: ");
                tempstr = iptW3.nextLine();
                hasilStr[0] = "" + _name.contains(tempstr);
                break;
            case 6:
                System.out.print("Input: ");
                tempstr = iptW3.nextLine();
                hasilStr[0] = _name.concat(tempstr);
                break;
            case 7:
                System.out.print("Diganti: ");
                tempstr = iptW3.nextLine();
                System.out.print("Ganti: ");
                tempstr2 = iptW3.nextLine();
                hasilStr[0] = _name.replace(tempstr, tempstr2);
                break;
            case 8:
                System.out.print("Input: ");
                tempstr = iptW3.nextLine();
                hasilStr = _name.split(tempstr);
                break;
            case 9:
                hasilStr[0] = _name.toLowerCase();
                break;
            case 10:
                hasilStr[0] = _name.toUpperCase();
                break;
            default:
                break;

        }
        if(hasilInt < 0)
            for(String hasil : hasilStr)
                System.out.println("Hasil: " + hasil);
        else
            System.out.println("Hasil: " + hasilInt);
    }
}
