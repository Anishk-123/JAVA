package Part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
word Strats with N and Ends With A
*/
public class NA {
    public static void main(String[] args) {
        String name="naveena";
        Pattern p=Pattern.compile("[n][a-z]*[a]");
        Matcher m=p.matcher(name);
        while(m.find()){
            System.out.println(m.group());

        }



    }
}
