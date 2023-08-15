#include<iostream>
using namespace std;

void swap(int &i,int &j){
        int temp = i;
        i=j;
        j=temp;
    }
    //=============================================Hoares Partition================================================
int PartitionH(int arr[],int l,int h){
   int pivot = arr[l];
   int i = l-1;
   int j = h+1;
   while(true){
    do{
        i++;
    }while(arr[i]<pivot);
     do{
        j--;
    }while(arr[j]>pivot);
    if(i>=j)return j;
    swap(arr[i],arr[j]);
   }
}
 //===============================================QUICK SORT===========================================================
void Quicksort(int arr[],int l,int h){
    if(l<h){
        int p = PartitionH(arr, l, h);
        Quicksort(arr,l,p);
        Quicksort(arr,p+1,h);
    }
}

int main(){
    int arr[] = {2,4,3,1,5};
    Quicksort(arr,0,5);
    for(int i: arr){
        cout<<i<<" ";
    }
}