package dev.idion.kakaointernship;

public class Second {
    public long solution(String expression) {
        long answer = 0;
        long a = calculate(expression, '*', '+', '-');

        answer = Math.max(answer, a);
        return answer;
    }

    private long calculate(String exp, char first, char second, char third) {
        int idx = exp.indexOf(first);
        if (idx != -1) {
//            exp.
        }
        return 0;
    }
}
