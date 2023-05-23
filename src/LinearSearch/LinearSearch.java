package LinearSearch;



public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,67,23,46};
        int target = 67;
        System.out.println(linearSearch(arr,target));
    }

    // if element is found print the index of that element
    private static int linearSearch(int[] arr, int target) {
        if(arr.length<1){
            return -1;
        }
        for(int index=0; index < arr.length; index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}
