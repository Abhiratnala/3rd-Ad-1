public class ass_01_6 {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[]={1,2,3,4,5};

        for(int i=1;i<=a.length-1;i++){
            for(int j=a.length-1;j>=i;j--)
                if(a[j]<a[j-1]) {
                    int temp = a[i];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }}
        int l=0, r=a.length-1;
        int i=1;
        while(l<r)
        {

            System.out.println((i)+" th min= "+a[l]);
            l++;
            System.out.println((i)+" th max= "+a[r]);
            r--;
            i++;

        }


        }
    }
