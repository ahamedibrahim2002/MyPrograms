#include <stdio.h>
#include <limits.h>

int getMin(int arr[],int start,int end,int target){
    
    int min=INT_MAX;
    

    for(int i=start;i<=end;i++){
        if(arr[i]<min && arr[i]> target){
            min=arr[i];
        }
    }
    
    return INT_MAX==min? -1 : min;
    
}
int main(){
   
    
    int nums[]={1,9,7,36,91,101};
    int n=sizeof(nums)/sizeof(int);
    
    for(int i=0;i<n;i++){
        int num=nums[i];
        nums[i]=getMin(nums,i+1,n-1,num);
    }
    
    //print array
    for(int i=0;i<n;i++){
        printf("%d ",nums[i]);
    }
    
    return 0;
}
