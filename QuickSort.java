public class QuickSort {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
//=======================================LOMUTO PARTITION===========================================================
    public static int partitionL(int arr[],int l,int h){
       int i = l-1;
        int pivot = arr[h];
        for(int j = l;j<=h-1;j++){
            if(arr[j]<pivot){         
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return i+1;
    }
//=======================================QUICK SORT================================================================
public static void Quicksort(int arr[],int l,int h){
    if(l<h){
        int p = partitionL(arr, l, h);
        Quicksort(arr,l,p-1);
        Quicksort(arr,p+1,h);
    }
}
    public static void main(String[] args) {
        int arr[] ={2,4,1,3,6,10,7,9,8,5};
        Quicksort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }  
}
