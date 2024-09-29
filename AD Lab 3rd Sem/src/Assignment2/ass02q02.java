import java.util.*;
public class ass02q02 {
    public static int max(int [] array,int index){
        if(index==array.length-1)
            return array[index];
        int max=Math.max(max(array,index+1),array[index]);
        return max;
    }
    public static int min(int [] array,int index){
        if(index==array.length-1)
            return array[index];
        int min=Math.min(min(array,index+1),array[index]);
        return min;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       // Write a JAVA program to find the maximum and minimum elements in an array
        int a[]={-9,-7,0,1,4,5};
        System.out.println("max is "+max(a,0));
        System.out.println("min is "+min(a,0));


    }
}
