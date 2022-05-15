package MayAssignment.week2.May12;

public class substring {
    private static void printSubstrings(String str, int n) {
        
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    System.out.print(str.charAt(k));
                }
 
                System.out.print(" ");
            }
        }
    }
    public static void main(String[] args) {
        //char s[] = {'a', 'b', 'c'};
        String s = "abcde";
        printSubstrings(s, s.length());
    }
}
