class MergeSorted{
    public static void main(String[] args) {
        int[] a = {3,4,5,6,7};
        int[] b = {1,2,8,9,10};
        int i = 0;
        int j = 0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
            System.out.print(a[i]+" ");
            i++;
            }
            else{
                System.out.print(b[j]+" ");
                j++;
            }
        }
        while(i<a.length){
            System.out.print(a[i]+" ");
            i++;
        }
        while(j<b.length){
            System.out.print(b[j]+" ");
            j++;
        }
        
    }
}