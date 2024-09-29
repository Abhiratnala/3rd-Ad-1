import java.util.*;
//sum of n numbers present in an array
public class q02 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        //maximum and minimum
        int array[]={1,2,-5,8};
        int min=array[0];
        int max=array[0];
        for(int i:array){
            if(i>max)
                max=i;
            if(i<min)
                min=i;
        }
        System.out.println(min+" ");
        System.out.println(max+" ");


    }
}
