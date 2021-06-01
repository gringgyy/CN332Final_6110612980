import java.util.*;
public class Payment {
    public Payment(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Which method would you like to use to purchase payment?");
        System.out.println("Promptpay / Cash / Credit");
        System.out.print("Input Here -> "); String input = sc.nextLine();
        getMethod(input);
    }
    public PaymentMethod getMethod(String methodType){
        if(methodType == null){
            return null;
        }
        if(methodType.equalsIgnoreCase("PROMPTPAY")){
            return new Promptpay();
        } else if(methodType.equalsIgnoreCase("CREDIT")){
            return new Credit();
        } else if(methodType.equalsIgnoreCase("CASH")){
            return new Cash();
        }
        return null;
    }
}
