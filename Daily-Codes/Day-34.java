class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int r=numBottles;
        while(numBottles>=numExchange)
        {
            r+=numBottles/numExchange;
            numBottles=numBottles/numExchange+numBottles%numExchange;

        }
        return r;
    }
}
//self
