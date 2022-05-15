package MayAssignment.week2.may10;

import java.util.HashMap;
import java.util.Map;

// check pangram using hashing
public class pangram {
    private static boolean checkIfPangram(String sentence) {
        
        Map<Character, Integer> mp = new HashMap<Character, Integer>();
        int n = sentence.length();
        for(int i = 0; i<n; i++){
            char ch = sentence.charAt(i);
            mp.put(ch, i);  
        }
        if(mp.size()==26)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println("String "+str+" is a Pangram: "+checkIfPangram(str));
        String str2 = "sidraZaidi";
        System.out.println("String "+str2+" is a Pangram: "+checkIfPangram(str2));
    }
}
