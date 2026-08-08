class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            char[] st = strs[i].toCharArray();
            Arrays.sort(st);
            String s = new String(st);
            List<String> key;
            if(mp.containsKey(s)){
               key = mp.get(s);
               key.add(strs[i]);
            }else{
                key = new ArrayList<>();
                key.add(strs[i]);
            }
            mp.put(s,key);
        }

        return new ArrayList<>(mp.values());
    }
}
