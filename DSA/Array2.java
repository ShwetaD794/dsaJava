public class Array2 {
        //    Max subarray sum(Brute Force)
        public static void maxarrbrute(int numbers[]){
            int currsum = 0;
            int maxsum = Integer.MIN_VALUE;
            for(int i=0;i<numbers.length;i++){
                int start = i;
                for(int j=i;j<numbers.length;j++){
                    int end = j;
                    currsum = 0;
                    for(int k=start;k<=end;k++){
                        //subarray sum
                        currsum += numbers[k];
                    }
                    if(maxsum < currsum){
                        maxsum = currsum;
                    }
                     System.out.println();
                }
                 System.out.println();
            }
             System.out.println("max sum =" + maxsum);
            }
        
        //     Max subarray sum(prefix sum)
        public static void maxarrprefix(int numbers[]){
            int currsum = 0;
            int maxsum = Integer.MIN_VALUE;
            int prefix[] = new int[numbers.length];
        
            prefix[0] = numbers[0];
            //calculate prefix array
            for(int i=1;i<prefix.length;i++){
                prefix[i] = prefix[i-1] + numbers[i];
            }
        
            for(int i=0;i<numbers.length;i++){
                int start = i;
                for(int j=i;j<numbers.length;j++){
                    int end = j;
                   currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                    if(maxsum < currsum){
                        maxsum = currsum;
                    }
                     System.out.println();
                }
                 System.out.println();
            }
             System.out.println("max sum =" + maxsum);
            }
        
        
        //Max subarray sum(kadane's method)
        public static void kadane(int numbers[]){
            int ms = Integer.MIN_VALUE;
            int cs = 0;
        
            for(int i=0;i<numbers.length;i++){
                cs = cs + numbers[i];
                if(cs < 0){
                    cs = 0;
                }
                ms = Math.max(cs,ms);
            }
            System.out.println("max subarray sum is : " + ms);
        }
        
        
        //Trapping rainwater
        public static int trappedRainWater(int height[]){
            int n = height.length;
            //calculate the left max boundary - array
            int leftMax[] = new int[n];
            leftMax[0] = height[0];
            for(int i=1;i<n;i++){
                leftMax[i] = Math.max(height[i],leftMax[i-1]);
            }
        
            //calculate right max boundary
            int rightMax[] = new int[n];
            rightMax[n-1] = height[n-1];
            for(int i=n-2;i>=0;i--){
                rightMax[i] = Math.max(height[i],rightMax[i+1]);
            }
            int trappedwater = 0;
            //loop
            for(int i=0;i<n;i++){
                //waterlevel = min(leftmax bound, rightmax bound)
                int waterlevel = Math.min(leftMax[i],rightMax[i]);
                trappedwater += waterlevel - height[i];
            }
            return trappedwater;
        }
        
        
        //   buy and sell stock
        public static int buyAndSellStocks(int prices[]){
            int buyPrice = Integer.MAX_VALUE;
            int maxProfit = 0;
        
            for(int i=0;i<prices.length;i++){
                if(buyPrice < prices[i]){//profit
                int profit = prices[i] - buyPrice;//today's profit
                maxProfit = Math.max(maxProfit,profit);
                }else{
                    buyPrice = prices[i];
                }
            }
            return maxProfit;
        }
        public static void main(String args[]){
             // int height[] = {4,2,0,6,3,2,5};
        // System.out.println(trappedRainWater(height));

        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(prices));
        }
    
}
