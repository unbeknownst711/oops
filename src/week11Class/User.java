package week11Class;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {
    private String firstname;
    private String lastname;
    private char gender;
    private String address;
    private String username;
    private String password;
    private MessageDigest digest;
    private static final int maxLoginAtmp = 3;
    private static int loginAtmp;

    public User(String firstname, String lastname, char gender, String address, String username, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.address = address;
        this.username = username;
        this.password = hash(password);
    }
    private String hash(String str){
        try{
            digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : hash){
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (Exception e){
            System.err.println(e.toString());
        }
        return "";
    }
    public boolean login(String usrn, String pass) throws ExcessiveTryException{
        if(username.equals(usrn)){
            if(loginAtmp >= maxLoginAtmp){
                throw new ExcessiveTryException();
            }
            if(password.equals(hash(pass))){
                loginAtmp = 0;
                return true;
            } else{
                System.out.println("Password salah");
                loginAtmp++;
            }
        }

        return false;
    }
}
