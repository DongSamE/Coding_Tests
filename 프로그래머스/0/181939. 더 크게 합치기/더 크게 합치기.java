class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String c1 = ""+b+""+a;
        String c2 = ""+a+""+b;
            
        int intValue1 = Integer.parseInt(c1);
        int intValue2 = Integer.parseInt(c2); 
        if(intValue1>intValue2){
            answer = intValue1;
        }else{
            answer = intValue2;
        }
        return answer;
    }
}