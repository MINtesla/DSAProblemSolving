class Solution {
    public boolean isAnagram(String s, String t) {
        int arr1[] = new int[26];

        int size1 = s.length() , size2 = t.length();
        if(size1 != size2){
            return false;
        }

        for(int i = 0 ; i<size1;i++){
            arr1[s.charAt(i) - 'a'] ++;
            arr1[t.charAt(i) - 'a'] --;
        }
        
        for(int i = 0 ; i<26;i++){
            if(arr1[i]!=0){
                return false;
            }
        }

        return true;
    }
}
