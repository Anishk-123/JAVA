package Part2;

public class Vowels {
    public static void main(String[] args) {


                String s1 = "Bengaluru is abig city I wonder How do i become IT employee,Its all Gods Plan,now i become HR";
                String s3 = s1.toLowerCase();
                char[] s2 = s3.toCharArray();
                int count = 0;

                for (int i = 0; i < s3.length()-1; i++) {
                    if (s2[i] == 'a' || s2[i] == 'e' || s2[i] == 'i' || s2[i] == 'o' || s2[i] == 'u') {
                        System.out.println(s2[i]);
                        count++;
                    }
                }

                System.out.println("Number of vowels: " + count);
            }

        }