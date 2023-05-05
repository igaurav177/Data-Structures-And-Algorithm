package BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
    int arr[]={8,7,6,4,3,2};
    int target=3;
        System.out.println(orderAgnosticBinarySearch(arr,target));


    }

    static int binarySearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int startEnd[] = new int[2];
        if(arr.length<1){
//            startEnd[0]=-1;
//            startEnd[1]=-1;
            return -1;
        }
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int orderAgnosticBinarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        if(arr[start]<arr[end]){
            while(start<end){
                int mid=start+(end-start)/2;
                if(target>arr[mid]){
                    start=mid+1;
                }else if(target<arr[mid]){
                    end=mid-1;
                }else{
                    return mid;
                }
            }
            }
        else if(arr[start]>arr[end]){
            while(start<end){
             int mid=start+(end-start)/2;
             if(target>arr[mid]){
                 end=mid-1;
             }else if(target < arr[mid]){
                 start=mid+1;

             }else{
                 return mid;
             }

         }
        }
        return -1;

    }

}

