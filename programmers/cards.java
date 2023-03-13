class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int c1Idx = 0;
        int c2Idx = 0;

        for (int i = 0; i < goal.length; i++) {
            if(c1Idx < cards1.length && goal[i].equals(cards1[c1Idx])) {
                c1Idx++;
                continue;
            }

            if(c2Idx < cards2.length && goal[i].equals(cards2[c2Idx])) {
                c2Idx++;
                continue;
            }

            answer = "No";
            return answer;
        }

        return answer;
    
    }
}