class Solution {
    public int eatingSpeed(int[] piles , int m ){
        int ans=0;
        for(int i=0;i<piles.length;i++){
            int t =piles[i];
            int r =0;
            if(t>m){
                r = t%m;
                ans+= (t/m);

                if(r>0){
                    ans++;
                }
            }else{
                if(t>0){
                    ans++;
                }
            }
            
        }

       return ans;
    }

    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length;
        int l =1, r = piles[n-1];
        int ans = Integer.MAX_VALUE;
        while(l<=r){
            int mid = (l +r)/2;

            if(eatingSpeed(piles,mid)>h){
                l = mid+1;
            }else{
                ans = mid;
                r = mid-1;
            }
        }

       return ans;
    }
}
