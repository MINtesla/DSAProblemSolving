class Solution {
    public int findMin(int[] nums) {
        int n = nums.length-1;
        int l =0 , r =n;
        int ans = Integer.MAX_VALUE;
        while(l<=r){
            if(nums[l] < nums[r]){
                ans = Integer.min(ans , nums[l]);
            }
            int mid = l+(r-l)/2;
            ans = Integer.min(ans , nums[mid]);
            if(nums[mid]>= nums[l]){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return ans;

    }
}
