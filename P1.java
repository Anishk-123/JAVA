package Part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1 {
    public static void main(String[] args) {
        String s3="anishkbc";

        Pattern h=Pattern.compile("[^abc]");
        Matcher i=h.matcher(s3);
        while(i.find()){
            System.out.println(i.group());
        }
    }
}
