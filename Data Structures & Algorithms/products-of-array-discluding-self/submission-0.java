class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero_count=0;
        int zero_position=-1;
        int multiple_result=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                zero_count++;
                zero_position =i;
            }else{
                multiple_result*=nums[i];
            }
        }
        int ans[] = new int[nums.length];
        if(zero_count >1){
            return ans;
        }

        if(zero_count == 1){
            ans[zero_position] = multiple_result;
            return ans;
        }

        for(int i=0;i<nums.length;i++){
            ans[i] = multiple_result/nums[i];
        }

        return ans;

    }
}  
