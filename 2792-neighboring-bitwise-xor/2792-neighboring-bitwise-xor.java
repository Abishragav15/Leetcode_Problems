class Solution{
    public boolean doesValidArrayExist(int[] derived){
        int xor=0;
        for (int number: derived){
            xor=xor^number;
        }
        return xor==0;
    }
}
