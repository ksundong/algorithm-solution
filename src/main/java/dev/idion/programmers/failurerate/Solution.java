package dev.idion.programmers.failurerate;

import java.util.Arrays;

public class Solution {
    public int[] solution(int n, int[] users) {
        int[] answer = new int[n];
        Stage[] stages = new Stage[n];

        // stage 초기화.
        for (int i = 0; i < n; i++) {
            stages[i] = new Stage(i + 1);
        }

        // stage에 유저 넣기 (최대 스테이지를 통과한 사람은 넣지 않음)
        for (int userStage : users) {
            if (userStage <= n) {
                stages[userStage - 1].count++;
            }
        }

        // 전체 user 수 구해서 Stage에 통과한 user수 넣기
        int userCount = users.length;
        for (Stage stage : stages) {
            stage.userCount = userCount;
            userCount -= stage.count;
        }

        // stage 정렬
        Arrays.sort(stages);

        // stage 정렬된 것 answer에 넣기
        for (int i = 0; i < n; i++) {
            answer[i] = stages[i].stageNumber;
        }

        return answer;
    }

    class Stage implements Comparable {
        int stageNumber;
        int count;
        int userCount;

        public Stage(int stage) {
            this.stageNumber = stage;
        }

        @Override
        public int compareTo(Object o) {
            Stage otherStage = (Stage) o;
            // 큰게 먼저와야하므로... e.g.) 3 / 7 < 2 / 4 ==> 3 * 4 < 2 * 7 인데, 내림차순 정렬을 위해 식을 반대로 적용(큰 것이 양수 값)
            long cmp = (long) otherStage.count * this.userCount - (long) this.count * otherStage.userCount;
            if (cmp == 0) {
                return this.stageNumber - otherStage.stageNumber;
            }
            return (int) cmp;
        }
    }
}
