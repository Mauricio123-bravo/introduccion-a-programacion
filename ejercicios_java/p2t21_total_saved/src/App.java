//AUTHOR: Mauricio Bravo
//DESCRIPTION: determines the total saved per person is N months. Yes A person saves X amount of money each month
//DATE: 22-10-20

import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        f_menu();
        int N_months= f_total_months();
        int sum_total_saved=0;
        double average_total_saved=0;
        for(int i=1; i<=N_months;i++){
            sum_total_saved=f_save_money(i);
            
        }
        average_total_saved= sum_total_saved/N_months;
        System.out.println("the total saved money is: $ "+sum_total_saved+" the average is $"+average_total_saved);



    
    }
    public static void f_menu(){
        //description: show inicial information
        System.out.println("taotalsavedSOFT-----version 1.0-----made by Mauricio Bravo");
    }
    public static int f_total_months(){
        //description: this method returns the total month that user saved money
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the total months");
        int total_months = keyboard.nextInt();
         while(total_months<2 || total_months>12){
             System.out.println("ERROOOOOR, the input values should be beetween 2 and 12, input again the total months");
             total_months = keyboard.nextInt();
         }
         return total_months;
    }
    public static int f_save_money(int i_month){
        //description: this method return the saved money in i month
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("input the saved money $ by the month"+i_month+":");
        int saved_money = keyboard1.nextInt();
        while(saved_money<10000 || saved_money<1000000){
            System.out.println("Erroooooor, the input should be beetween $10000 and $1000000, input again the saved money $ by the month"+i_month+":");
            saved_money = keyboard1.nextInt();
        }
        return saved_money;

    

    }
}
