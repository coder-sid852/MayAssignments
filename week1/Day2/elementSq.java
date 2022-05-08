package MayAssignment.week1.Day2;

public class elementSq {
    public static void elementSquare(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]*arr[i];
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        elementSquare(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
