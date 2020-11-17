//AUTHOR: Mauricio Bravo
//DESCRIPTION: this program of words and ascii
//DATE: 5-11-20

import java.util.Scanner;





public class App {
    public static void main(String[] args) throws Exception {
    f_introduction();
    String v_user_word = f_user_string();

    String[] v_vector_word = new String[v_user_word.length()];
    for(int i=0; i<v_user_word.length();i++){
        v_vector_word[i]=v_user_word.substring(i , 1);
        System.out.println("v_vector_word["+i+"]="+v_vector_word[i]);
    }
    }

    public static void f_introduction() {
        //DESCRIPTION: show information principal
        System.out.println("wordsandasciiSOFT-----version 1.0------made by Mauricio Bravo");

}

public static String f_user_string() {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("input a word ");
    String v_word = keyboard.nextLine();
    while(v_word-Length()<6){
        System.out.println("ERROOOOR, you word should be minimum 6 characters, input againg do you need");
        v_word= keyboard.nextLine();
    }

    return v_word;
}


}
