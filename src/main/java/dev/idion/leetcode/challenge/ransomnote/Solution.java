package dev.idion.leetcode.challenge.ransomnote;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.equals("")) { return true; }
        Map<String, Integer> magazineMap = new HashMap<>();

        for (String m : magazine.split("")) {
            magazineMap.put(m, magazineMap.getOrDefault(m, 0) + 1);
        }


        for (String ransom : ransomNote.split("")) {
            if (!magazineMap.containsKey(ransom)) {
                return false;
            }

            int ransomCount = magazineMap.get(ransom);
            if (ransomCount == 0) {
                return false;
            }
            magazineMap.put(ransom, ransomCount - 1);
        }
        return true;
    }
}
