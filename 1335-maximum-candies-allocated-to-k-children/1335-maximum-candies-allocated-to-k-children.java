class Solution {
    public int maximumCandies(int[] candy, long k) {
        long sum=0;
        int ans=0;
        for(var x:candy) sum+=x;
        if(sum<k) return 0;
        int l=1;
        int r=(int)(sum/k); 
        while(l<=r){
            int mid=l +(r-l)/2;
            if(can(candy,mid,k)){
                ans=mid;
                l=mid+1;
            }else{
                r=mid-1; 
            }
        }
        return ans;
    }
    public boolean can(int[] candy, int pile, long k){
        long children=0;
        for(var x: candy) children +=x/pile;
        
        return children>=k;
    }
}