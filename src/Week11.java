import week11Class.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week11 {
    List<User> users = new ArrayList<>();
    public Week11(Scanner iptW11){
        int chc;
        users.add(new User("John", "Doe", 'L',"Banten","admin","admin"));
        while(true){
            menu();
            chc = iptW11.nextInt();
            if(chc == 1){
                handleLogin(iptW11);
            } else if (chc == 2) {
                try {
                    handleSignup(iptW11);
                } catch (SignupException e) {
                    System.out.println(e.getMessage());
                }
            } else break;
        }
    }
    private void menu(){
        System.out.println("1. Login");
        System.out.println("2. Sign up");
        System.out.print(": ");
    }
    private void handleLogin(Scanner ipt){
        boolean logged = false;
        System.out.print("Username: ");
        String usrn = ipt.next();
        System.out.print("Password: ");
        String pass = ipt.next();

        try {
            for (User u : users) {
                logged = u.login(usrn, pass);
                if(logged) {
                    System.out.println("Logged in");
                    return;
                }
            }
        } catch (ExcessiveTryException e) {
            System.out.println(e.getMessage());
        }
    }
    private void handleSignup(Scanner ipt) throws SignupException {
        ipt.nextLine();
        System.out.print("fname: ");
        String firstname = ipt.nextLine();
        if(firstname.contains(" ")) throw new SignupException("No spasi");
        System.out.print("lname: ");
        String lastname = ipt.nextLine();
        if(lastname.contains(" ")) throw new SignupException("No spasi");
        System.out.print("Gender(L/P): ");
        char gender = ipt.next().charAt(0);
        ipt.nextLine();
        if(gender != 'L' && gender != 'P') throw new SignupException("Gender invalid");
        System.out.print("Alamat: ");
        String address = ipt.nextLine();
        System.out.print("Username: ");
        String username = ipt.nextLine();
        if(username.contains(" ")) throw new SignupException("No spasi");
        if(username.length() < 6) throw new SignupException("username kurang panjang");
        System.out.print("Password: ");
        String password = ipt.nextLine();
        if(!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{6,16}$"))
            throw new SignupException("Password butuh huruf besar, huruf kecil, angka, panjang antar 6-16");
        users.add(new User(firstname,lastname,gender,address,username,password));
        System.out.println("Berhasil signup");
    }
}
