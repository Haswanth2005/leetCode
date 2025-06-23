package contestQuestions;

import java.util.HashMap;
public class checkPrimeFrequency {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap();
        for(int i=0 ;i<nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i])+1);
            }else{
                map.put(nums[i] , 1);
            }
        }
        int cnt = 0;
        for(int key : map.keySet()){
            if(isPrime(map.get(key)) && (map.get(key) != 1)){
                //System.out.println(map.get(key));
                cnt++;
            }
        }
        if(cnt>0){
            return true;
        }else{
            return false;
        }
    }
    public boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
