package dev.idion.programmers.year2016;

public class Solution {
    public String solution(int a, int b) {
        String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int dateCount = 5;
        int[] monthDayArray = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < a - 1; i++) {
            dateCount += monthDayArray[i];
        }
        dateCount += b - 1;

        return dayOfWeek[dateCount % 7];
    }
}
