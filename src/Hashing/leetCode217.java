package Hashing;

import java.util.HashMap;
public class leetCode217 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer ,Integer> set = new HashMap();
        for(int i=0 ; i<nums.length ; i++){
            if(set.containsKey(nums[i])){
                set.put(nums[i] , set.get(nums[i])+1);
            }else{
                set.put(nums[i] , 1);
            }
        }
        int cnt=0;
        for(int key: set.keySet()){
            if(set.get(key)>1){
                cnt++;
            }
        }
        if(cnt>0){
            return true;
        }else{
            return false;
        }
    }
}
