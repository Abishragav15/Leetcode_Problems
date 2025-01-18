class Solution{
    public int[] singleNumber(int [] nums){
        HashSet<Integer> input= new HashSet<>();
        for(int zz: nums){
            if(input.contains(zz)){
                input.remove(zz);
            }        
            else{
                input.add(zz);
            }
    }
        Iterator<Integer> a=input.iterator();
        return new int[] {a.next(), a.next()};
}}