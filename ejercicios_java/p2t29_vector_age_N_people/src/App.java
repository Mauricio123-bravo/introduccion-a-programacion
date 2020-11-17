//AUTHOR: Mauricio Bravo
//DESCRIPTION: GENERATES THE AGE THE RANDOMLY FOR n PEOPLE AND SAVE THEM IN A VECTOR
//DATE: 29-10-20

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    f_introduction();
    int N_people = f_total_people();
    int[] v_vector_age = f_fill_vector_age_people(N_people);

    int v_total_children = 0, v_total_adults = 0, v_total_seniors = 0, v_sum_age=0;
    for(int i=0; i<N_people; i++){
        if(v_vector_age[i]<18){
            v_total_children+=1;
        }else if(v_vector_age[i]>18 && v_vector_age[i]<60){
            v_total_adults+=1;
        }else{
            v_total_seniors+=1;
        }
        v_sum_age=v_sum_age+v_vector_age[i];
        System.out.println("age person ["+i+"] : "+v_vector_age[i]);

    }
    double v_average_age= v_sum_age/N_people;
    System.out.println("totals");
    System.out.println("total children: "+v_total_children);
    System.out.println("total adults: "+v_total_adults);
    System.out.println("total senior: "+v_total_seniors);
    System.out.println("the age average is: "+v_average_age);
    
    }

    public static void f_introduction() {
        //description: show the inicial menu
        System.out.println("vectoraageNpeopleSOFT-----version 1.0-----made by Mauricio Bravo");
        
    }
    public static int f_total_people() {
        //description: this method returns the total person for the exercise
    Scanner keyboard = new Scanner(System.in);
    System.out.println("input the total people do you need?");
    int v_total_people = keyboard.nextInt();
    while(v_total_people<1 || v_total_people>1000){
        System.out.println("ERROOOOR, the value should be between 1 to 1000, input again the total people do you want: ");
        v_total_people = keyboard.nextInt();
    }
    return v_total_people;
        
    }
    public static int[] f_fill_vector_age_people(int N) {
        //description: this method return a vector with age for N people
        int[] v_vector_age = new int[N];
        for(int i=0; i<N; i++){
            v_vector_age[i]= (int) (Math.random()*100)+1;
        }
        return v_vector_age;
    }
}
