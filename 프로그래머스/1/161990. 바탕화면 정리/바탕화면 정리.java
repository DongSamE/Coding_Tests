class Solution {
    public int[] solution(String[] wallpaper) {
        
        int current_x = 0;
        int current_y = 0;
        int max_x= 0;
        int max_y = 0;
        int min_x = wallpaper.length;
        int min_y = wallpaper[0].length();
        // i to Y.length 랑 j to X.length해서 계속 count. Min Max 저장하면서 하면 됨
        for(int i = 0 ; i < wallpaper.length; i++){
            for(int j = 0 ; j < wallpaper[0].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    current_x = i;
                    current_y = j;
                    if(current_x< min_x) min_x = current_x;
                    if(current_y< min_y) min_y = current_y;
                    if(current_x> max_x) max_x = current_x;
                    if(current_y> max_y) max_y = current_y;
                }
            }
        
        }
        int[] answer = {min_x,min_y,max_x+1,max_y+1};    
        return answer;
    }
}