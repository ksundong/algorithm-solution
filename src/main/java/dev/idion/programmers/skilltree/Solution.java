package dev.idion.programmers.skilltree;

public class Solution {
  public int solution(String skill, String[] skillTrees) {
    int sum = 0;
    for (String skillTree : skillTrees) {
      if (skill.indexOf(skillTree.replaceAll("[^" + skill + "]", "")) == 0) {
        sum++;
      }
    }

    return sum;
  }
}
