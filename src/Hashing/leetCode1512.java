package Hashing;
//Count how many times each number appears. If a number appears n times, then n * (n – 1) / 2 good pairs can be made with this number.

import java.util.HashMap;

public class leetCode1512 {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap();
        for(int i=0 ; i<nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i])+1);
            }else{
                map.put(nums[i] , 1);
            }
        }
        int pairs = 0;
        for(int key : map.keySet()){
            int n=map.get(key);
            pairs = pairs + n*(n-1)/2;
        }

        return pairs;
    }
}
