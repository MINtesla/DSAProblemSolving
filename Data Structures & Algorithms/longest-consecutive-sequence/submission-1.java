class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],1);
        }
        int ans =0;
        for(Map.Entry<Integer , Integer> itr : mp.entrySet()){
            if(!mp.containsKey(itr.getKey()-1)){
                int i = itr.getKey();
                while(mp.containsKey(i)){
                    i++;
                }
                ans = Integer.max(ans, i-itr.getKey());
            }
        }

        return ans;

        
    }
}
