package Hashing;


import java.util.HashSet;
public class leetCode1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet();
        for(int i=0 ; i<allowed.length() ; i++){
            set.add(allowed.charAt(i));
        }
        int cnt = 0;
        for(int i=0 ; i<words.length ;i++){
            if(words(words[i] , set)){
                cnt++;
            }
        }
        return cnt;
    }
    public boolean words(String word , HashSet<Character> set){
        int a=0;
        for(int i=0 ; i<word.length() ; i++){
            if(set.contains(word.charAt(i))){
                a++;
            }
        }
        if(a == word.length()){
            return true;
        }else{
            return false;
        }
    }
}
