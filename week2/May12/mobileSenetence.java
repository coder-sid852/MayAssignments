package MayAssignment.week2.May12;

public class mobileSenetence {
    private static String ConvertTomobileNumeric(String arr[], String s) {
        String t= "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==' '){
                t+='0';
            }else{
                int position = ch - 'A';
                t = t + arr[position];
            }
        }

        return t;
    }
    public static void main(String[] args) {
        String str[] ={"2","22","222",
                    "3", "33","333",
                    "4", "44", "444",
                    "5","55","555",
                    "6","66","666",
                    "7","77","777","7777",
                     "8","88","888",
                    "9","99","999","9999"};
        String s = "SIDRA ZAIDI";
        System.out.println(ConvertTomobileNumeric(str, s));
    }
}
