package dev.idion.programmers.camouflage;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> partMap = new HashMap<>();
        int answer = 1;
        for (int i = 0; i < clothes.length; i++) {
            String part = clothes[i][1];
            partMap.put(part, partMap.getOrDefault(part, 0) + 1);
        }
        for (String part : partMap.keySet()) {
            answer *= partMap.get(part) + 1;
        }
        return answer - 1;
    }
}
