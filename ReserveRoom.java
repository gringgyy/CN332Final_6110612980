import java.util.*;
public class ReserveRoom{
    Scanner sc = new Scanner(System.in);
    System.out.print("single bed room left: ");
    System.out.println(SingleBed.getInstance().getAvaliable());
    System.out.print("double bed room left: ");
    System.out.println(BoubleBed.getInstance().getAvaliable());
    System.out.println("Enter 1 if you want to single bed room");
    System.out.println("Enter 2 if you want to double bed room");
    System.out.print("Input Here -> "); int input = sc.nextInt();
}