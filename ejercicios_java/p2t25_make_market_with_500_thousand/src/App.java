//AUTHOR: Mauricio Bravo
//DESCRIPTION: algorithm that captures the price of each and adds it until the account reaches the maximum limit (500000), 
//              in the end determine how many products you buy and when it was the total value you paid.
//DATE: 26-10-20

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    f_introduction();
    Scanner keyboard = new Scanner(System.in);
    int v_bill_market=0, v_tmp_product, v_total_product=0;
    do{
        System.out.println("please, pass the product trought the billing machine");
        v_tmp_product= keyboard.nextInt();
        v_bill_market= v_bill_market+v_tmp_product;
        v_total_product+=1;
        System.out.println("your invoice is: $ "+v_bill_market+"whit"+v_total_product+"products");
        }while(v_bill_market<=500000);
        if(v_bill_market>5000000){
            v_bill_market=v_bill_market-v_tmp_product;
            v_total_product=v_total_product-1;
        }
        System.out.println("your final invoice is: $"+v_bill_market+"whit"+v_total_product+"products");

    }
    public static void f_introduction(){
        //description: show incial information
        System.out.println("makemarketwith5000000SOFT------version 1.0-----made by mauricio barvo");
        
    }
}
