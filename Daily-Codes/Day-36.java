class Solution {
    public double averageWaitingTime(int[][] customers) {
        int total=customers[0][0];
        
        int wait=0;
        int arr=0;
        double sum=0.0;
        for (int [] i: customers)
        {
            arr=i[0];
            wait=i[1];
            if(total>=arr)
            {
                total+=wait;
                System.out.println(total);
                sum+=total-arr;

            }
            else
            {
                total=arr+wait;
                sum+=wait;
                System.out.println(sum);
                
                
            }
        }
        return (sum/customers.length);
    }
}
//self
