import java.util.Arrays;

class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10]; // X의 숫자 카운트
        int[] countY = new int[10]; // Y의 숫자 카운트

        // X의 각 숫자 카운트
        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }

        // Y의 각 숫자 카운트
        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }

        // 공통 숫자 조합 생성
        StringBuilder nums = new StringBuilder();
        for (int i = 9; i >= 0; i--) { // 내림차순으로
            int commonCount = Math.min(countX[i], countY[i]); // 최소 개수
            for (int j = 0; j < commonCount; j++) {
                nums.append(i); // 공통 숫자 추가
            }
        }

        // 결과 문자열이 비어 있으면 -1 반환
        if (nums.length() == 0) {
            return "-1";
        }

        // 결과가 "0"으로 시작하면 "0" 반환
        return nums.charAt(0) == '0' ? "0" : nums.toString();
    }
}

