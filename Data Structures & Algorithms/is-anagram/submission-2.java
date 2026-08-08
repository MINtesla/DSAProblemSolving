class Solution {
    public boolean isAnagram(String s, String t) {
        int freq[] = new int[26];

        int size1 = s.length() ;
        if(size1 != t.length()){
            return false;
        }

        for(int i = 0 ; i<size1;i++){
            freq[s.charAt(i) - 'a'] ++;
            freq[t.charAt(i) - 'a'] --;
        }
        
        for(int i : freq){
            if(i!=0){
                return false;
            }
        }

        return true;
    }
}
