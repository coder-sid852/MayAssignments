package MayAssignment.week1.DayOne;

import java.util.Scanner;

public class stringFreq {
    public static int freq(String[] arr, String str, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) 
            if(str.equals(arr[i]))
                count++;
        
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        System.out.println("enter elements: ");
        
        for (int i = 0; i < n; i++) {
            arr[i]=sc.next();
        }
        System.out.print("Enter string to check :");
        String str = sc.next();
        System.out.println(freq(arr, str, n));
        sc.close();
        
    }
}
