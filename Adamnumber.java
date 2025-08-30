package Pratice;

public class Adamnumber {
    public static void main(String[] args) {
        int num=12;
        String str=Integer.toString(num);
        System.out.println(str);
        String reverse=new StringBuilder(str).reverse().toString();
        System.out.println("reversed "+reverse);
        int n1=num*num;
        System.out.println(n1);//144

        int n2 = Integer.parseInt(reverse);
        int n3=n2*n2;//441
        System.out.println(n3);
        String str2=Integer.toString(n3);
        String reverse2=new StringBuilder(str2).reverse().toString();
        int  num2=Integer.parseInt(reverse2);
        if(n1==num2){
            System.out.println("Adam Number");

        }
        else {
            System.out.println("not a adam number");
        }

    }
}
