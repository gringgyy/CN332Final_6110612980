import java.util.*;
public class Facade {
    public Facade() {}
    public void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input username:"); String uname = sc.nextLine();
        System.out.println("Input password:"); String pword = sc.nextLine();
        boolean check = Login(uname,pword);
        if (check){
            ReserveRoom reserve = new ReserveRoom();
        }
        else {
            System.out.println("Login not successful!!");
        }
    }
    public void reg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input username:"); String uname = sc.nextLine();
        System.out.println("Input password:"); String pword = sc.nextLine();
        boolean check = Register(uname,pword);
        if (check){
            ReserveRoom reserve = new ReserveRoom();
        }
        else {
            System.out.println("Register not successful!!");
        }
    }
}