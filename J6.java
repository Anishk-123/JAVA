import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class J6{
   public static void main(String[]args){
   List<Integer>list1=new ArrayList<>();
   List<Integer>list2=new ArrayList<>();
   List<Character>list3=new ArrayList<>();
   List<Character>list4=new ArrayList<>();
  for(int i=65;i<=90;i++)
{
list1.add(i);
}
for(int i=97;i<=112;i++)
{
list2.add(i);
}
for(int i=65;i<=65+26;i++)
{
list3.add((char)i);
}
for( int i=97;i<=97+26;i++)
{
list4.add((char)i);
}
System.out.println(list1);

System.out.println(list2);

System.out.println(list3);

System.out.println(list4);
}
}



