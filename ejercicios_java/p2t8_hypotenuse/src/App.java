import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("p2t8: hypotenuse, made by Andres Torres and Mauricio Bravo");
        int c1,c2;
        double hypotenuse;
        Scanner keyboard = new Scanner (System.in);
        System.out.println("input hte first value");
        c1 = keyboard.nextInt();
        System.out.println("input the second value");
        c2 = keyboard.nextInt();
        hypotenuse = Math.sqrt((c1*c1)+(c2*c2));
        System.out.println("the hypotenuse is:"+hypotenuse);

    }
}
