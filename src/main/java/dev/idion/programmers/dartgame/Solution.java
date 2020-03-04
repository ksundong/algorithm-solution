package dev.idion.programmers.dartgame;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public int solution(String dartResult) {
        Pattern pattern = Pattern.compile("(\\d+\\w[#|*]?)(\\d+\\w[#|*]?)(\\d+\\w[#|*]?)");
        Matcher matcher = pattern.matcher(dartResult);

        int answer = 0;
        while (matcher.find()) {
            String s1 = matcher.group(1);
            String s2 = matcher.group(2);
            String s3 = matcher.group(3);
            int c1 = calculate(s1);
            int c2 = calculate(s2);
            int c3 = calculate(s3);
            if (s1.contains("*")) {
                c1 *= 2;
            }
            if (s1.contains("#")) {
                c1 *= -1;
            }
            if (s2.contains("*")) {
                c1 *= 2;
                c2 *= 2;
            }
            if (s2.contains("#")) {
                c2 *= -1;
            }
            if (s3.contains("*")) {
                c2 *= 2;
                c3 *= 2;
            }
            if (s3.contains("#")) {
                c3 *= -1;
            }
            answer += c1 + c2 + c3;
        }
        return answer;
    }

    private int calculate(String data) {
        Pattern pattern = Pattern.compile("(\\d+)(\\w)");
        Matcher matcher = pattern.matcher(data);

        int score = 0;
        int power = 0;
        while (matcher.find()) {
            score = Integer.parseInt(matcher.group(1));
            power = calculatePower(matcher.group(2));
        }
        return (int) Math.pow(score, power);
    }

    private int calculatePower(String data) {
        if ("S".equals(data)) {
            return 1;
        }
        if ("D".equals(data)) {
            return 2;
        }
        if ("T".equals(data)) {
            return 3;
        }
        return 0;
    }
}
