//AUTHOR: Mauricio Bravo
//DESCRIPTION: this programe is for calculate the height of a group of N children
//DATE: 21-10-2020

import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
        f_menu();
    int user_tot_children = f_total_children();
    double sum_height=0, average_height;
    for(int i=1; i<=user_tot_children; i=i+1){
        System.out.println("height by children number:"+i);
        sum_height+=f_height_child();

         }
         average_height = sum_height/user_tot_children;
         System.out.println("the average total children"+user_tot_children+"is"+average_height);
    }
    public static void f_menu(){
        //description: show inicial menu/ information of program
    System.out.println("AverageHeightSOFT-----version 1.0-----made by Mauricio Bravo");

    }

    public static int f_total_children(){
        //description: this method return the total children than user input by keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the total children");
        int total_children = keyboard.nextInt();
        while(total_children<=0 || total_children>10000){
            System.out.println("ERROOOOOR, the total children should be beetween 1 and 10000, input again the total children");

            total_children = keyboard.nextInt();
        } 
        return total_children;
    }
    public static double f_height_child(){
        //description: this method will return the height by child than user input by keyboard 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the height child (meters)");
        double height_child = keyboard.nextDouble();
        while(height_child<0.30 || height_child>2){
            System.out.println("ERROOOOOR, the height should be beetween 0.30 and 2 meters, input again the total children");
            height_child = keyboard.nextInt();
        } 
        return height_child;
    }
}
