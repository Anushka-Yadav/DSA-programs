public class UnionArray {
    public static void main(String[] args) {
        int a[] = {1,2,2,4,5,5,6,7,8};
        int b[] = {3,5,6,7,8,9};
        int i = 0;
        int j = 0;
        int m = a.length;
        int n = b.length;
        while(i<m && j<n){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(a[i]<b[j]){
                System.out.print(a[i]+" ");
                i++;
            }
            if(b[j]<a[i]){
                System.out.print(b[j]+" ");
                j++;
            }
            if(a[i]==b[j]){
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
        while(i>m){
            System.out.print(a[i]+" ");
            i++;
        }
        while(j>n){
            System.out.print(b[j]+" ");
            j++;
        }
    }
}
