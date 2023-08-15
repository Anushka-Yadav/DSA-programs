public class MergeFunc {
    static void Merge(int a[],int low,int mid,int high){
        int n1[] = new int[mid-low+1];
        int n2[] = new int[high-mid];
        for(int i = 0;i<mid-low+1;i++){
            n1[i] = a[low+i];
        }
        for(int i = 0;i<n2.length;i++){
            n2[i] = a[mid+1+i];
        }
        int i = 0,j=0,k=0;
        while(i<n1.length && j<n2.length){    //
            if(n1[i]<n2[j]){
                a[k]= n1[i];
                i++;
                k++;
            }
            else{
                a[k] = n2[j];
                j++;
                k++;
            }
        }
        while(i<n1.length){
            a[k] = n1[i];
            i++;
            k++;
        }
        while(j<n2.length){
            a[k] = n2[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int a[] = {12,13,14,15,16,1,2,3,4,5};
        int low = 0;
        int high = a.length-1;
        int mid = (high+low)/2;
        Merge(a,low,mid,high);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
