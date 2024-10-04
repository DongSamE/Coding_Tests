import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int last_num = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != last_num) { 
                list.add(arr[i]); 
                last_num = arr[i];
            }
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}