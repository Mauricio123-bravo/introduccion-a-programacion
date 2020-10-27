//AUTHOR: Mauricio Bravo
//DESCRIPTION: records the times of each lap of training and determines the best lap,
//------------the average and the number of laps per training 
//DATE: 27-10-20

import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
    f_introduction()
    Scanner keyboard = new Scanner(System.in);
    double v_total_laps=0, v_Sum_times=0,v_best_lap=0,v_worst_lap=0,v_average_time=0,v_time_lap;
    do{
        v_time_lap=f_time_lap();
        v_total_laps+=1;
        v_Sum_times+=1;
        v_Sum_times+=v_time_lap;
        if(v_total_laps==1){
            v_best_lap=v_time_lap;

        }else{
            if(v_time_lap<v_best_lap){
                v_best_lap=v_time_lap;
            }if(v_time_lap>v_worst_lap){
                v_worst_lap=v_time_lap;
            }
        }
    }while (f_option_continue().equals("Y"));
     v_average_time= v_Sum_times/v_total_laps;
     System.out.println("RESULTS");  
     System.out.println("total laps: "+v_total_laps);
     System.out.println("sum of times (seg): "+v_Sum_times);
     System.out.println("Average time (seg): "+v_average_time);
     System.out.println("the best lap (seg): "+v_best_lap);
     System.out.println("the worst lap (seg): "+v_worst_lap);
    
    }
    public static void f_introduction(){
       //description: show inicial principal
        System.out.println("sportTimeSOFT------version 1.0-----made by Mauricio Bravo");

    }
    public static String f_option_continue(){
        //description: this methd return Y (yes) or N (not)
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Mr/Mrs athlete, do you want continue? (Y/N)");
        String v_opt= keyboard1.nextLine();
        while(!v_opt.equals("Y") || !v_opt.equals("N")){
            System.out.println("ERROOOOOR, you option can not be processed MR/MRS athlete, do you wantcontinue? (Y/N)");
            v_opt=keyboard1.nextLine();
        }
        return v_opt;

    }
    public static double f_time_lap(){
        //description: this method returns a value between 5 seg and 59 seg
        Scanner keyboard2= new Scanner(System.in);
        System.out.println("MR/MRS athlete, input the time lap (seg): ");
        double v_time_lap = keyboard2.nextLine();
        while(v_time_lap<5 || v_time_lap>59){
            System.out.println("ERROOOOOR, you value between 5 seg and 59 seg. mr/mrs athlete, input again the thime lap(seg): ");
            v_time_lap = keyboard2.nextLine();

        }
        return v_time_lap;
    }
}
