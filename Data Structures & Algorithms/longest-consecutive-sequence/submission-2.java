class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> mp = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            mp.add(nums[i]);
        }
        int ans =0;
        for(int itr:mp){
            if(!mp.contains(itr-1)){
                int i = itr;
                while(mp.contains(i)){
                    i++;
                }
                ans = Integer.max(ans, i-itr);
            }
        }

        return ans;

        
    }
}
