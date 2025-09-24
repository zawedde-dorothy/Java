
import java.util.Scanner;

public class scanner {
    public static void main (String[] args) {
        Scanner Zowie = new Scanner(System.in);
        System.out.println("Olive: Hey");
        System.out.print("Mercy: ");
        String x = Zowie.next();
        
        System. out.println("Olive: how are you");
        System.out.print("Mercy: ");
        String y = Zowie.next();
        System.out.println("Olive: How old are you");
        System.out.print("Mercy: ");
        int m = Zowie.nextInt();
        System.out.println("Olive: Whats your name?");
        System.out.print("Mercy: ");
        String n = Zowie.next();
        System.out.println("My name is " + n + " and am " + m + " old");
        Zowie.close();

    }
    
}
