import java.util.*;
public class Main{
    public static int func(int i){
        if(i==1){
            return 1;
        }
        return i * func(i-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(func(n));
    }
}