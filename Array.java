package Array;

public class Array {
    int[] a;

    Array(int a[]){
        this .a=a;
    }
    void Print(){
        for(int x:a)
            System.out.println(x);


    }
void reverse(){
       int  j=a.length;
    for(int i=0;i<j;i++){
          int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
          j--;

        }
    }
}
