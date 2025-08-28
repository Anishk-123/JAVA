package Part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gmail {
    public static void main(String[] args) {
        String mail="anishk@gmail.com";
        String s2="[a-zA-Z0-9][a-zA-Z0-9_.]* @Gmail[.]com";
        Pattern p=Pattern.compile(s2);
        Matcher m=p.matcher(mail);
        while(m.find()){
            System.out.println("Matched:"+m.group());

        }




    }
}
