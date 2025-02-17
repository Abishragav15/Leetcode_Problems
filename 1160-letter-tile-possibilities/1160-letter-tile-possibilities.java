class Solution {
    private int helper(int[] counts) {
        int totalCount = 0;
        for (int i = 0; i < 26; i++) {
            if (counts[i] > 0) {
                totalCount++;
                counts[i]--;
                totalCount += helper(counts);
                counts[i]++;
            }
        }
        return totalCount;
    }
    public int numTilePossibilities(String tiles) {
        int[] counts = new int[26];
        for (char ch : tiles.toCharArray()) {
            counts[ch - 'A']++;
        }
        return helper(counts);
    }
}