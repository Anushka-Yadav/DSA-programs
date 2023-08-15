public class PartitionLomuto {
    public static void swap(int i,int j){
        int temp = i;
        i=j;
        j=temp;
    }
    //=======================================LOMUTO PARTITION================================================================
    public static int partitionL(int arr[],int l,int h){
       int i = l-1;
        int pivot = h;
        for(int j = l;j<=h-1;j++){
            if(arr[j]<pivot){         
                i++;
                swap(arr[i],arr[j]);
            }
        }
        swap(i+1,h);
        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,1};
        System.out.println(arr[partitionL(arr, 0, arr.length)]);
    }
    
}
