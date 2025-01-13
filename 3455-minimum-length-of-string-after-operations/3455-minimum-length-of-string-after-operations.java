class Solution {
    public int minimumLength(String s) {
        if(s.length() <= 2) {
            return s.length();
        }
        int[] right = new int[26];
        int cnt=0;
        for(int i=0;i<s.length();i++){
            right[s.charAt(i)-'a']++;
        }
        int[] left = new int[26];
        for(int i=0;i<s.length();i++)
        {
            int ch = s.charAt(i)-'a';
            if(left[ch]>0 && (right[ch]-1)>0)
            { 
                left[ch]-=1;
                right[ch]-=1;
            }
            if(right[ch]>0){
                left[ch]++;
                right[ch]--;
            }}
        for(int i=0;i<26;i++){
            cnt+=left[i]+right[i];
        }
        return cnt; 
    }}