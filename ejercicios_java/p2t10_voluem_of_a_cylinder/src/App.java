import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("p2t10; volume of a cylinder, made by Mauricio Bravo");
        Scanner keyboard = new Scanner (System.in);
        System.out.println("input the radius in cm");
        double r1 = keyboard.nextInt();
        System.out.println("input the heigth in cm");
        double h1 = keyboard.nextInt();
        if(r1>=0 || h1>=0) {
            System.out.println(" ERROOOOR: this radius or heigth can not less than or equal to zero");
        
        }else{
            double  VOL = 3.1416+(r1+r1)+h1;
            System.out.println("Volume is"+VOL+"cm3");
        
        }

    }
}
