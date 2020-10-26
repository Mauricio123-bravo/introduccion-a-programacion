//AUTHOR: Mauricio Bravo
//DESCRIPTION: from the keyboard a series of numbers until you get one lower than 100, in the end determine the sum and average of the numbers entered
//DATE: 23-10-20
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
    double v_average_numbers =0, v_sum_numbers=0;
    int v_N_numbers=0;
    System.out.println("input any number:");
    int v_number= keyboard.nextInt();
    while(v_number>100){
        v_sum_numbers=v_sum_numbers+v_number;
        v_N_numbers= v_number+1;
        System.out.println("input other any number : " );
        v_number= keyboard.nextInt();
    }
    if(v_N_numbers!=0){
        v_average_numbers=v_average_numbers/v_N_numbers;

    }
    System.out.println("the sum is "+v_sum_numbers+" , average"+v_average_numbers+" total numbers are "+v_number);

    }
}
