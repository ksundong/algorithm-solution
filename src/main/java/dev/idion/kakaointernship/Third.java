package dev.idion.kakaointernship;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Third {
    public int[] solution(String[] gems) {
        Set<String> gemSet = new HashSet<>(Arrays.asList(gems));
        int count = gemSet.size();

        if (count == 1) {
            return new int[]{1, 1};
        }

        for (int i = count; i <= gems.length; i++) {
            for (int j = 0; j <= gems.length - count; j++) {
                if (gemSet.equals(new HashSet<>(Arrays.asList(Arrays.copyOfRange(gems, j, j + count))))) {
                    return new int[]{j + 1, j + count};
                }
            }
        }

        return null;
    }
}
