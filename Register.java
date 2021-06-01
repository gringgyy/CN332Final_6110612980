import java.util.*;
public class Register{
    private String username;
    private String password;
    public String[] unameArr = new String[100];
    public String[] pwordArr = new String[100];
    public int number = 0;

    public Register() {}
    public Register(String unameVal, String pwordVal) {
        username = unameVal;
        password = pwordVal;
        addUser(username, password);
    }

    public boolean addUser(String usernameVal, String passwordVal){
        unameArr[number+1] = usenameVal;
        pwordArr[number+1] = passwordVal;
        return true;
    }

}