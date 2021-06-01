import java.util.*;
public class Customer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome. Please Sign in or Register")
        System.out.println("Enter 1 if you want to Login");
        System.out.println("Enter 2 if you want to Register");
        System.out.print("Input Here -> "); int input = sc.nextInt();

        Facade fac = new Facade();
        switch (input) {
            case 1 -> fac.login();
            case 2 -> fac.reg();
        }
    }
}