package Hashing;

public class leetcode238 {
    public int[] productExceptSelf(int[] nums) {
        int mul;
        int[] array = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++){
            mul = 1;
            for(int j = 0 ; j<nums.length ; j++){
                if(j!=i){
                    mul = mul * nums[j];
                }
            }
            array[i] = mul ;
        }

        return array;
    }
}
