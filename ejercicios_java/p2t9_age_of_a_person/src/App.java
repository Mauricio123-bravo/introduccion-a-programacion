//AUTHOR: Mauricio Bravo
//DATE : 6-10-2020
//DESCRIPTION: this program show the age of a person

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("p2t9: age of a person, made by Mauricio Bravo");
        Scanner teclado = new Scanner(System.in);
        System.out.println("input the age of the person:");
        int year = teclado.nextInt();
        if(year>=2020){
            System.err.println("errooooor, this year can not process, you should imput a year less than 2020");
        }else{
            int AGE =2020-year;
            if(AGE>=18){
                System.out.println("she/he is a adult");

            }else{
                System.out.println("she/he is a boy/girl");

            }
        }

    }
}
