import java.util.*;
public class ass_06_1
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter");
        int [] s={1,2,3,4,4};
        for(int i=0;i<s.length;i++){
            for(int j=i+1;j<s.length;j++){
                if(s[i]==s[j]){
                    System.out.println("first repeated character is= "+s[i]);
                return;
                }
            }
        }
        System.out.println("not found");


    }
}
