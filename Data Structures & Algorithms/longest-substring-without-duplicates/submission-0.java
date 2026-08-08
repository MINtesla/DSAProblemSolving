class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        int ans=0;
        Map<Character,Integer> mp = new HashMap<>();
        while(l<s.length()){
            mp.put(s.charAt(l), mp.getOrDefault(s.charAt(l), 0)+1);
            while(mp.get(s.charAt(l)) > 1){
                mp.put(s.charAt(r), mp.getOrDefault(s.charAt(r), 0)-1);
                r++;
            }
            ans = Integer.max(ans, l-r+1);
            l++;
        }
        return ans;
    }
}
