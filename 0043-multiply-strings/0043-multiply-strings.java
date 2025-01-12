import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger bI = new BigInteger(num1);
        BigInteger bI2= new BigInteger(num2);
        BigInteger result = bI.multiply(bI2); 
        String s=""+result;
        return s;
    }}