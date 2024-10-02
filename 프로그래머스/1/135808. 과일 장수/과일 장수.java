import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        //score length가 사과 갯수니까 갯수/m하면 몇상자인지 알 수 있음. 최소점수로 상자별 점수가 나오니까
        //p*(score.length/m)*m 나머지가 사라지니까 최솟값 제외하면 됨
        //최대점수 기준으로 위에서부터 score.length/m*m하면 들어가는 사과 갯수를 알 수 있음.
        //sort하고 앞에서부터 score.length/m*m개 어레이 뽑아서 m으로 묶으면 최댓값 나올거 같은데.
        

        // 사과 점수 정렬 (내림차순)
        Arrays.sort(score);
        
        // 상자의 개수 계산
        int numBoxes = score.length / m;

        // 상자의 개수만큼 점수를 더해줌
        for (int i = 1; i <= numBoxes; i++) {
            // 각 상자의 점수는 해당 상자에서 가장 낮은 점수 (점수 배열의 끝에서 m번째 요소)
            answer += score[score.length - i * m]*m;
        }

        return answer;
    }
}