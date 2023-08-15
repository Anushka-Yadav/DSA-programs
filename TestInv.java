public class TestInv {
    static int CountIn(int a[],int l,int r){
        int out = 0;
        if(l<r){
            int mid = l+(l-r)/2;
            out +=CountIn(a,l,mid);
            out +=CountIn(a,mid+1,r-1);
          ++  
        }
        return out;
    }
    public static void main(String[] args) {
        int a[] = {4,5,2,3,7,1};
        int l = 0;
        int r = a.length;
        CountIn(a,l,r-1);
    }   
}
