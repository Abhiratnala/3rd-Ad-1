public class ass_05_4 {
    public static int bsearch(int []a, int high, int low,int x){
        int mid=low+(high-low)/2;
        if(a[mid]==x)
            return mid;
        else if(a[mid]>x)
            return bsearch(a,mid-1,low,x);
        else
            return bsearch(a,high,mid+1,x);


    }
    //recursive binary search
    public static void main(String[] args) {
        int a[]={1,2,3,4 ,5,13,20};
        System.out.println("found at "+ bsearch(a,a.length-1,0,4));
    }
}
