package MayAssignment.week2.May11;

public class removeSpecial {
    private static String remSpecial(String str) {
        String s ="";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                s += ch;
            }
        }

        return s;
    }
    public static void main(String[] args) {
        String str = "afgt%y^u#";
        System.out.println(remSpecial(str));
    }
}
