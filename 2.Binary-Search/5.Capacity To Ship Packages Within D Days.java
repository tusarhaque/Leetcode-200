class Solution {
    public int shipWithinDays(int[] weights, int days) {


        int minCap = 0;
        int maxCap = 0;


        for(int weight: weights){

            minCap = Math.max(minCap, weight);

            maxCap += weight;
        }




        while (minCap < maxCap){

            int mid  = minCap + (maxCap - minCap)/2;

            //trying to ship with mid value

            int days = 1;

            int sum = 0;

            for(int weight : weights){

                if(sum  + weight > mid){

                    days++;
                    sum = 0;
                }

                sum += weight;
            }

            if(days > 0){

                minCap = mid + 1;
            }else{

                maxCap  = mid;
            }

            return minCap;

        }
        
    }
}