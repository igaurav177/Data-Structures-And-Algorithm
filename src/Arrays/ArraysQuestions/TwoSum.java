package Arrays.ArraysQuestions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
//        int sum = 0;
//        int[] targetIndex= new int[2];
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                sum=nums[i]+nums[j];
//                if(sum==target){
//                    targetIndex[0]=i;
//                    targetIndex[1]=j;
//
//                }
//            }
//        }
//        return targetIndex;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int cur = nums[i];
            int x = target-cur;
            if(map.containsKey(x)){
                return new int[] {i,map.get(x)};
            }
            map.put(cur,i);
        }
        return null;

    }
}
