package MayAssignment.week2.may10;
import java.util.*;
public class anagram {
    private static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1= new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
  
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
  
        for (int i = 0; i < arr1.length; i++) {
  
            if (map1.get(arr1[i]) == null) {
  
                map1.put(arr1[i], 1);
            }
            else {
                Integer c = (int)map1.get(arr1[i]);
                map1.put(arr1[i], ++c);
            }
        }
        for (int j = 0; j < arr2.length; j++) {
  
            if (map2.get(arr2[j]) == null)
                map2.put(arr2[j], 1);
            else {
  
                Integer d = (int)map2.get(arr2[j]);
                map2.put(arr2[j], ++d);
            }
        }
  
        if (map1.equals(map2))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "narmaga";
        System.out.println(isAnagram(s, t));
    }
}
