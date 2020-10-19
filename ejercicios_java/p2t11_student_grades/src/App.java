//AUTHOR: Mauricio Bravo
//DATE: 2-10-20
//DESCRIPTION: this program calculate the grades of the students. n1(20%)+n2(25%)+n3(25%)+n4(30%)

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("p2t11: student grades, made by Mauricio Bravo");
        System.out.println("cracking students.");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the first grade (20%),this value should be between 0 and 5");
        float g1 = keyboard.nextFloat();
        System.out.println("input the first grade (25%),this value should be between 0 and 5");
        float g2 = keyboard.nextFloat();
        System.out.println("input the first grade (25%),this value should be between 0 and 5");
        float g3 = keyboard.nextFloat();
        System.out.println("input the first grade (30%),this value should be between 0 and 5");
        float g4 = keyboard.nextFloat();

        if (g1<0 || g1>5 || g2<0 || g2>5 || g3<0 || g3>5 || g4<0 || g4>5 )
        { System.out.println("Erroooooor, the final grade can not calculate because one grade was not between 0 and 5");

         }else{
             double FINALG = (g1*0.2)+(g2*0.25)+(g3*0.25)+(g4*0.3);
             System.out.println("the final grade is "+FINALG);


        }

    }
}
