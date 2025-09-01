package Pratice;
import java.util.Arrays;
public class RemoveElement {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4,3, 5, 7};
        int key=3;
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                continue;
            }
            arr[j]=arr[i];
            j++;
        }
  for(int a:arr){
      System.out.print(a+",");
  }
    }
}
