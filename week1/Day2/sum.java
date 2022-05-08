package MayAssignment.week1.Day2;

import java.util.*;

public class sum {
    public static int sumOfUnique(int[] nums) {
        int sum =0;
        
        for (int i = 0; i < nums.length; i++) {
            int flag = 0;
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    flag =1;
                    nums[j] =-1;
                }
            }
            if(flag == 0 && nums[i] != -1){
                sum+=nums[i];
            }
        }
        
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
 
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("//////" + sumOfUnique(arr));
        
        sc.close();
    }
}
