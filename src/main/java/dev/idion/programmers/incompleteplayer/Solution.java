package dev.idion.programmers.incompleteplayer;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> participantMap = new HashMap<>();
        int defaultValue = 0;

        for (int i = 0, participantLength = participant.length; i < participantLength; i++) {
            String participantPlayer = participant[i];
            participantMap.put(participantPlayer, participantMap.getOrDefault(participantPlayer, defaultValue) + 1);
        }

        for (int i = 0, completionLength = completion.length; i < completionLength; i++) {
            String completionPlayer = completion[i];
            participantMap.put(completionPlayer, participantMap.getOrDefault(completionPlayer, defaultValue) - 1);
        }

        for (String key : participantMap.keySet()) {
            if (participantMap.get(key) != defaultValue) {
                answer = key;
            }
        }

        return answer;
    }
}
