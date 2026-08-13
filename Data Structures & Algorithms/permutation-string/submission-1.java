class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] s1char = s1.toCharArray();
        Arrays.sort(s1char);
        int sub = s1.length();
        int n = s2.length();
        if(sub > n){
            return false;
        }

        for(int i=0;i<=n-sub;i++){
            String subString = s2.substring(i, i+sub);
            char[] s2char = subString.toCharArray();
            Arrays.sort(s2char);
            if(Arrays.equals(s1char , s2char)){
                return true;
            }
            continue;
        }

        return false;
    }
}
