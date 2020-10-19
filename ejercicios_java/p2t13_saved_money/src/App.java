import java.util.Scanner;

//AUTHOR: Mauricio Bravo
//DESCRIPTION: this program calculate the save money that a person saved N money
//DATE:9-10-20
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        f_menu();
        System.out.println("input the total months");
        int mo = keyboard.nextInt();
        double save_money = 0;
        if (mo<=0){
            System.out.println("Erroooor, the months should be greater than 0");

        }else{
            save_money - f_money(mo);
            System.out.println("the money saved during"+mo+"months is"+save_money);
        }
        
    }


    public static void f_menu(){
    //DESCRIPTION: show inicial menu
     
        System.out.println("savedmoneysoft,made by Mauricio Bravo");
    
    }
    
    public static double f_money (int months){
        //Description: this subprogram 
        Scanner keyboard1 = new Scanner(System.in);
        double tot_save;
        System.out.println("input the monthly salary");
        double salary= keyboard1.nextDouble();
        if (salary<=0){
            System.out.println("Errooooor, the salary should be greater than 0");
            tot_save=0;


        }else{
            tot_save=(salary*0.6)*months;
            
        }
        return tot_save;
    }


}
