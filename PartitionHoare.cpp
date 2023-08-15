#include<iostream>
using namespace std;
void swap(int &i,int &j){
        int temp = i;
        i=j;
        j=temp;
    }
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

int main(){
    int arr[] = {5,3,8,4,2,7,1,0};
    int ans = PartitionH(arr,0,8);
    cout<<ans;
    return 0;
}
