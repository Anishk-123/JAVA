package Part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClasses {
    public static void main(String[] args) {
        String s1="a%h#g@23 jlmgh";
        Pattern p=Pattern.compile(".");
        Matcher m=p.matcher(s1);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
