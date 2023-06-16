package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={2,6,4,8,3,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean isSwapped = false;
       for(int i=0;i<arr.length;i++){
           for(int j=1;j<arr.length-i;j++){
               if(arr[j-1]>arr[j]){
                   int temp =arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
                   isSwapped=true;
               }
           }
           if(!isSwapped){
               break;
           }
       }
    }
}
