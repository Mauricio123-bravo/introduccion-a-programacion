import java.util.Scanner;
public class App {
 public static void main(String[] args) throws Exception {
        System.out.println("p2t5; subtract of two numbers; made by Mauricio Bravo");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("imput the first number:");
        int num1=keyboard.nextInt();
        System.out.println("input the second number:");
        int num2=keyboard.nextInt();
        int resu= num1-num2;
        System.out.println("the subtract od the two number is:"+resu);

    }
}
