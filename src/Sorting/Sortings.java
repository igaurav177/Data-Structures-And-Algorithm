package Sorting;

import java.util.Arrays;

public class Sortings {
    public static void main(String[] args) {
    int arr[]={2,6,4,8,3,1};
    selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean swapped=false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last =arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0, last);
            swap(arr,maxIndex,last);
        }
    }
    static int getMaxIndex(int arr[],int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }

        }
        return max;
    }
    static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }



}
