import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("p2t7: thw supermarket, made by Mauricio Bravo");
        int p1, p2, p3, p4, VALBR;
        double IVA, BILL;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the 1° product:");
        p1 = keyboard.nextInt();
        System.out.println("input the 2° product:");
        p2 = keyboard.nextInt();
        System.out.println("input the 3° product:");
        p3 = keyboard.nextInt();
        System.out.println("input the 4° product:");
        p4 = keyboard.nextInt();
        VALBR = p1+p2+p3+p4;
        IVA = VALBR *0.19;
        BILL = VALBR + IVA;
        System.out.println("the total bill is $"+ BILL+"with iva 19% $"+IVA);
        

    }
}
