package dev.idion.programmers.compressstring;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int solution(String s) {
        ArrayList<Integer> lengthList = new ArrayList<>();
        int answer;

        for (int i = 0, stringLength = s.length(); i < stringLength; i++) {
            lengthList.add(getSplitStringCount(i, s));
        }
        answer = Collections.min(lengthList);

        return answer;
    }

    public int getSplitStringCount(int i, String s) {
        ArrayList<String> arrayList = new ArrayList<>();
        int size = s.length();
        int splitIndex = i + 1;
        int repeat = size / splitIndex + 1;
        String prevStr = "";
        int count = 1;

        for (int j = 0; j < repeat; j++) {
            int beginIndex = j * splitIndex;
            int endIndex = (j + 1) * splitIndex;
            if (endIndex > size) {
                endIndex = size;
            }
            String slice = s.substring(beginIndex, endIndex);

            if (prevStr.equals(slice)) {
                count++;
            } else {
                arrayList.add((count == 1 ? "" : count) + slice);
                count = 1;
            }
            prevStr = slice;
        }

        StringBuilder shortedString = new StringBuilder();

        for (String slice : arrayList) {
            shortedString.append(slice);
        }

        return shortedString.toString().length();
    }
}
