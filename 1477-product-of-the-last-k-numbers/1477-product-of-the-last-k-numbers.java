class ProductOfNumbers {
     List<Integer> list;
    public ProductOfNumbers() {
        list = new ArrayList<>();
    } 
    public void add(int num) {
        list.add(num);
    }
    public int getProduct(int k) {
        int f = 1;
        int i = list.size()-1;
        while(k-->0){
            f = f*list.get(i);
            i--;
        }
        return f;
    }
}
