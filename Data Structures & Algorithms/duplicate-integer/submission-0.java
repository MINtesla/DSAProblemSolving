class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Boolean> map = new HashMap<>();
        for(int itr:nums){
            if(map.containsKey(itr)){
                return true;
            }
            map.put(itr,true);
        }
        return false;
    }
}