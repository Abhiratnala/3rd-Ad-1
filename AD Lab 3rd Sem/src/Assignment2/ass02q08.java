import java.util.*;
public class ass02q08{
    public static boolean present( int []a,int x) {
       for(int i=0;i<a.length;i++) {
           if (x == a[i])
               return true;
       }
       return false;
    }
        public static int smallest(int []a, int index){
        if(present(a,index))
            return smallest(a,index+1);
        else
            return index;

        }

    public static void main(String[] args) {
        int a[]={-9,-7,0,1,4,5};
        System.out.println(smallest(a,1));
    }

    }
