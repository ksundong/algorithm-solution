package dev.idion.thinking.overlapchar;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean checkOverlapChar(String string) {
        boolean answer = false;
        Map<String, Integer> stringMap = new HashMap<>();
        String[] strings = string.split("");

        for (int i = 0, stringLength = strings.length; i < stringLength; i++) {
            String character = strings[i];
            stringMap.put(character, stringMap.getOrDefault(character, 0) + 1);
        }

        for (String key : stringMap.keySet()) {
            answer = stringMap.get(key) > 1;
            if (answer) {
                return answer;
            }
        }
        return answer;
    }
}
