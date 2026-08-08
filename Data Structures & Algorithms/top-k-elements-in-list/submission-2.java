class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i] , mp.getOrDefault(nums[i], 0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = 
        new PriorityQueue<>((a,b)-> b.getValue().compareTo(a.getValue()));

        pq.addAll(mp.entrySet());
        while(!pq.isEmpty()){
            if(k==0){
                break;
            }
            l.add(pq.poll().getKey());
            k--;
        }

        int ans[] = new int[l.size()];
        int i =0;
        for(int itr : l){
            ans[i++] = itr;
        }
        return ans;
    }
}
