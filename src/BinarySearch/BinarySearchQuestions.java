package BinarySearch;

public class BinarySearchQuestions {
    public static void main(String[] args) {
        int arr[]={1,3,4,6,7,9,12,16,19,20,25};
        int target=15;
        System.out.println(arr[ceilingOfNumber(arr,target)]);
        System.out.println(arr[floorOfNumber(arr,target)]);
    }

    public static int floorOfNumber(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else if(target==arr[mid]){
                return mid;
            }
        }
        return end;
    }

    public static int ceilingOfNumber(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else if(target==arr[mid]){
                return mid;
            }
        }
        return start;
    }

}

