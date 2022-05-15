package MayAssignment.week2.May9;
// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/submissions/

class oddlength {
    private static int sumOfOddLength(int[] arr) {
        int n = arr.length, sum =0;
        for (int i =0; i<n; i++){
            sum += (((i+1)*(n-i)+1)/2)*arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] a={1,4,2,5,3};
        System.out.println(sumOfOddLength(a));
    }
}
