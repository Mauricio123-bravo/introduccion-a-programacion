//AUTHOR: Mauricio Bravo
//DESCRIPTION: calculates the average salary, total salary and highest salary of N employees, where salary (salary/30) *working_days
//Date: 23-10-20

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    f_menu();
    double v_salary_average=0, v_salary_total=0, v_salary_higher=0, v_salary_tmp;
    int N_employees = f_N_employees();
    for(int i=1; i<= N_employees;i++){
        v_salary_tmp=f_salary_one_employee(i);
        v_salary_total = v_salary_total+v_salary_tmp;
        if(v_salary_higher<v_salary_tmp){
            v_salary_higher=v_salary_tmp;
        }
    }

    }
    public static void f_menu(){
        //description: show inicial information
        System.out.println("salaryEMSOFT-----version 1.0----made by Muricio Bravo");

    }
    public static int f_N_employees(){
        //description: this method returns the total employees to calculate
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the total employes: ");
        int N_employees = keyboard.nextInt();
        while(N_employees<1 || N_employees>100){
            System.out.println("ERROOOOR, you should be between 1 and 100, input again the total employees: ");
            N_employees = keyboard.nextInt();
        }
        return N_employees;
    }
    public static double f_salary_one_employee(int i){
        //description: this method calculate the salary by one employee
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("input the salary for the employee"+i+"$: ");
        int salary = keyboard1.nextInt();
        while(salary<1){
            System.out.println("ERROOOOOR, this salary should be greater than zero, input again the salary for the employee"+i+"$: ");
            salary = keyboard1.nextInt();
        }
        System.out.println("input the work days in this month for the employee "+i+" $: ");
        int workdays = keyboard1.nextInt();
        while(workdays<1 ||  workdays>30){
            System.out.println("ERROOOOOOR, the work dyas should be between 1 and 30, input again the work days for employee"+i+" $:");
            workdays = keyboard1.nextInt();
        
        }
        double salary_employee =(salary/30)*workdays;
        return salary_employee;
         
    }
       
      
    
}


