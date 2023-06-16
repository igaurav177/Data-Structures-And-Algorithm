package Sorting;

import java.util.Arrays;

public class InserstionSort {
    public static void main(String[] args) {
    int arr[]={5,4,3,1,2};
    inserstionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void inserstionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j>0;j--){
               if(arr[j]<arr[j-1]){
                   swap(arr,j,j-1);
               }else{
                   break;
               }
            }
        }
    }
    static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}
