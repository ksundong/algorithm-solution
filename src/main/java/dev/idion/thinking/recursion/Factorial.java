package dev.idion.thinking.recursion;

public class Factorial {
    public long get(long number) {
        return get(number, 1);
    }

    private long get(long number, long result) {
        if (number < 2) {
            return result;
        }
        return get(number - 1, result * number);
    }
}
