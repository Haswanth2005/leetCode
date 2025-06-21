package Hashing;

import java.util.HashSet;
import java.util.HashMap;
public class leetCode3541 {
    public int maxFreqSum(String s) {
        HashSet<Character> set = new HashSet();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        HashMap<Character ,Integer> map = new HashMap();
        for(int i=0 ; i<s.length() ; i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i) , map.get(s.charAt(i)) + 1);
            }else{
                map.put(s.charAt(i) , 1);
            }
        }
        int a=0 , b=0;
        for(char key : map.keySet()){
            if(set.contains(key)){
                if(a<map.get(key)){
                    a = map.get(key);
                }
            }else{
                if(b<map.get(key)){
                    b = map.get(key);
                }
            }
        }
        return a+b;
    }
}
