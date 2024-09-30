class Solution {
    public int solution(int[] numbers) {
        int max = numbers[0]*numbers[1];
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int multiple = numbers[i] * numbers[j];
                if (multiple > max) {
                    max = multiple;
                }
            }
        }
        
        return max;
    }
}