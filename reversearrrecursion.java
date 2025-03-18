import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static void reverse(int i,int j, int[] arr){
        if(i>=j){
            return ;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        reverse(i+1, j-1, arr);
    

    }
    public static void main(String[] args) {
        int[] n={5,247,7457,4,74,5742,8786};
        reverse(0,6,n);
        System.out.println(Arrays.toString(n));
    }
}