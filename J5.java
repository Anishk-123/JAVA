public class J5{
    public static void main(String[]args){
  String s1="ABCDEF";
String s2=" ";
int len=s1.length();
for(int i=0;i<=len;i++)
{
s2=s1.substring(0,i);
System.out.println(s2);
}
for(int i=0;i<=len;i++){

s2=s1.substring(0,len-i);
System.out.println(s2);
}


}
}