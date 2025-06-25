package Hashing;

import java.util.HashMap;
import java.util.ArrayList;
public class leetCode347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap();
        for(int i=0; i<nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i]) + 1);
            }else{
                map.put(nums[i] , 1);
            }
        }

        ArrayList<Integer> arr = new ArrayList();
        for(int key : map.keySet()){
            if(map.get(key) >= k){
                arr.add(key);
            }
        }
        int[] array = new int[arr.size()];
        for(int i=0 ; i<array.length ; i++){
            array[i] = arr.get(i);
        }

        return array;
    }
}
