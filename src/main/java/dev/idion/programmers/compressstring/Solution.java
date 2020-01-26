package dev.idion.programmers.compressstring;

public class Solution {
    public int solution(String input) {
        int answer = input.length(); // 기본 길이를 세팅
        int repeatCount = answer / 2; // 반복 횟수는 글자 길이의 절반(그 이상이면 연속될 수 없음)

        for (int i = 1; i <= repeatCount; i++) {
            int count = countSplitInput(input, i); // countSplitInput을 호출하면, input을 i만큼 나누어서 개수 반환
            if (count != 0) {
                answer = Math.min(answer, count);
            }
        }

        return answer;
    }

    private int countSplitInput(String input, int splitCount) {
        int repeat = input.length() / splitCount; // 반복 가능한 횟수 지정

        String beforeString = "";
        int count = 1;
        StringBuilder splitStringBuilder = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            String splitInput = input.substring(i * splitCount, (i + 1) * splitCount);
            if (beforeString.equals(splitInput)) {
                count++;
            } else {
                if (count > 1) splitStringBuilder.append(count);
                splitStringBuilder.append(beforeString);
                count = 1;
            }

            beforeString = splitInput;
        }
        if (count > 1) splitStringBuilder.append(count);
        return splitStringBuilder.append(beforeString).append(input.substring(splitCount * repeat)).toString().length();
    }
}
