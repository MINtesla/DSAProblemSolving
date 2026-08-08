class Solution {
    public boolean hasDuplicate(int[] nums) {
      Set<Integer> set = new HashSet<>();
        return 
        Arrays.stream(nums)
        .anyMatch(itr -> !set.add(itr));

    }
}

// SOLUTION 1 - 

//  Set<Integer> set = new HashSet<>();
//         for(int itr:nums){
//             if(set.contains(itr)){
//                 return true;
//             }
//             set.add(itr);
//         }
//         return false;

// SOLUTION 2 - 

