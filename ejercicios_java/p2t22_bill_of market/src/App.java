//AUTHORS: Ana stephanny soto, Mauricio Bravo
//DESCRIPTION: this program calculate the bill of market
//DATE: 22-10-2020

import java.util.Scanner;




public class App {
    public static void main(String[] args) throws Exception {
    f_menu();
    int sum = 0;
    int products = N_products();
    for(int i=1; i<= products;i++){
        sum = sum+ V_products(i);
    }
    double IVA = sum*0.19;
    double TOTAL_BILL= sum + IVA;
    System.out.println("the value bruto is $ "+sum+" the total Iva is $ "+IVA+" the total bill is $ "+TOTAL_BILL);


    }
    public static void f_menu(){
        //description: show the principal information
        System.out.println("billOFmarketSOFT------version 1.0-----made by Mauricio Bravo, Ana stephany soto");

    }
    public static int N_products(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the quantity of products");
        int N_products = keyboard.nextInt();
        while(N_products<1 ){
            System.out.println("ERROOOOOOR, the quantity of products does not exist, input again the quantity of products");
            N_products = keyboard.nextInt();
        
        }
    return N_products;

    }

     public static int V_products(int i){
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("input the value of the product "+i);
        int V_products = keyboard1.nextInt();
        while(V_products<1){
            System.out.println("ERROOOOOOR, the value of the product should be greater than 1, input again the value of the product "+i);
            V_products = keyboard1.nextInt();
        }

    return V_products;
        
        }

    


}
