class Solution {
    record Pair (int key , boolean value){};
    public Pair counterCheck(int k , Map<Character,Integer> mp){
        int total_count =0;
        int max_count =0;
        for(Map.Entry<Character,Integer> itr : mp.entrySet()){
            max_count = Integer.max(max_count , itr.getValue());
            total_count += itr.getValue();
        }

        return new Pair(total_count - max_count , total_count - max_count <=k ? true : false );
    }
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> mp = new HashMap<>();
        int l =0, r=0;
        int ans = 0;
        while(r<s.length()){
            Character ch = s.charAt(r);
            mp.put(ch, mp.getOrDefault(ch,0)+1);
            while(!counterCheck(k , mp).value()){
                ch = s.charAt(l);
                mp.put(ch, mp.get(ch)-1);
                l++;
            }
            ans = Integer.max(ans, r-l+1);
            r++;
        }
        return ans;
    }
}
