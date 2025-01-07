import java.util.*;
public class ass_06_02 {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5,6,7,1};
        System.out.println("og array");
        for(int i:a){
            System.out.print(i+"  ");
        }
        System.out.println();
        System.out.println("duplicates are");
        printDuplicate(a);
    }
    public static void printDuplicate(int []a){
        boolean hasduplicates=false;
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1])
            {
                hasduplicates=true;
                System.out.print(a[i]+"  ");
                while(i<a.length-1 && a[i]==a[i+1])
                    i++;

            }

        }
        if(!hasduplicates)
            System.out.println("no duplicates founds");

    }
}
