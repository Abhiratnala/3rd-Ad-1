public class ass_01_4 {
    public static void main(String[] args) {
        int a[]={-2,-3,4,-1,2,1,5,4};
        int cs=0,ls=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                cs+=a[j];
                if(cs>ls){
                    ls=cs;

                }

            }
            cs=0;
        }
        System.out.println(ls);
    }
}
