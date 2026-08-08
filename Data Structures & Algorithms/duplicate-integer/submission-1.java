class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> set = new HashSet<>();
        for(int itr:nums){
            if(set.contains(itr)){
                return true;
            }
            set.add(itr);
        }
        return false;
    }
}