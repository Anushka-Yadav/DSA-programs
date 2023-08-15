public class InterSecSorted {
    public static void main(String[] args) {
        int a[] = {1,2,2,5,5,6,7,8};
        int b[] = {5,6,7,8,9};
        int i = 0;
        int j = 0;
        while(i<a.length && j<b.length){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(a[i]>b[j])j++;
            if(a[i]<b[j])i++;
            if(a[i]==b[j]){
                System.out.println(a[i]);
                i++;
                j++;
            }
        }
    }
    
}
