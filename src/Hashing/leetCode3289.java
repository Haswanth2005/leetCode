package Hashing;

import java.util.HashMap;
import java.util.ArrayList;
public class leetCode3289 {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap();
        for(int i=0 ; i<nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i])+1);
            }else{
                map.put(nums[i] , 1);
            }
        }

        ArrayList<Integer> arr = new ArrayList();
        for(int key : map.keySet()){
            if(map.get(key)==2){
                arr.add(key);
            }
        }

        int[] arry = new int[arr.size()];
        for(int i=0 ; i<arry.length ; i++){
            arry[i] = arr.get(i);
        }
        return arry;
    }
}
