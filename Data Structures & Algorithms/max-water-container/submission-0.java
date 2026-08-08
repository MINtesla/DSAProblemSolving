class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int max_water = 0;
        while(l<r){
            max_water = Integer.max(max_water, (r-l)*Integer.min(heights[l],heights[r]));

            if(heights[l] > heights[r]){
                r--;
            }else{
                l++;
            }
        }
        return max_water;
    }
}
