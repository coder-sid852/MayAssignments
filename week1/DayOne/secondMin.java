package MayAssignment.week1.DayOne;

import java.util.Scanner;

public class secondMin {

    public static int approach1(int[] arr, int n) {
        int first= arr[0] ;
        int second= arr[0] ;

        for (int i = 0; i < n; i++) {
            if(arr[i]<first){
                second = first;
                first= arr[i];
            }
        }
        return second;
    }
    public static int approach2(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        int Result = arr[1];
        return Result;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("With First Approach: ");
        
        System.out.println(approach1(arr, n));

        System.out.println("with Second Aproach: ");

        System.out.println(approach2(arr, n));
        
        sc.close();
        
    }
}
