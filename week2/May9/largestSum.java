package MayAssignment.week2.May9;

public class largestSum {
    private static int largestSumSubArray(int[] arr) {
        int currsum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++){
            currsum += arr[i];
            maxSum = Math.max(maxSum, currsum);
            if(currsum <0){
                currsum =0;
            }
        }
        
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(largestSumSubArray(arr));
    }
}
