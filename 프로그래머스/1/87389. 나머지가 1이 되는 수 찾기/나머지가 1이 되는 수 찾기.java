class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = n-1;
        int x = 0;
        for(int i = num; i >= 2; i--){
            if(num%i == 0 ){
                x = i;
            }
        }
        return x;
    }
}