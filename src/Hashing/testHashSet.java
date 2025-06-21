package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class testHashSet {
    public void hashSet(){
        //HashSet notation
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(2);
        set.add(2);
        set.add(48);
        set.add(7);
        System.out.println(set);

        //Iterator usage
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
