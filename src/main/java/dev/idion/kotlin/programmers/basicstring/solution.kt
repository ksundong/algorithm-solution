package dev.idion.kotlin.programmers.basicstring

class Solution {
    fun solution(s: String): Boolean {
        if (s.length != 4 && s.length != 6) {
            return false
        }

        for (ch in s) {
            if (!ch.isDigit()) {
                return false
            }
        }

        return true
    }
}
