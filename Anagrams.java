package Pratice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.nio.file.Files.find;

public class Anagrams
{
    public static void main(String[] args) {
          String s1="listen carefully";
          String regex="listen";
          Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(s1);
        while(m.find()){
            System.out.println("Matched:"+m.group());
        }

    }
}
