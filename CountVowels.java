package Pratice;

import java.util.Locale;
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {

        System.out.println("Enter a word");
        Scanner sc1=new Scanner(System.in);
        String s=sc1.nextLine();
   String s1=s.toLowerCase();
   int count=0;
   for(int i=0;i<s.length();i++){
       char letter = s1.charAt(i);


           if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
               count = count + 1;

               System.out.println("vowels are: "+letter);
           }

       }

        System.out.println("total number of vowels are :"+count);

    }
}
