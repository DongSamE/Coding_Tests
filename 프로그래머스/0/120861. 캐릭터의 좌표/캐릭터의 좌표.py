def solution(keyinput, board):
    
    max_x = (board[0]-1)/2
    max_y = (board[1]-1)/2
    x = 0
    y = 0
    
    for i in keyinput :
        if i == "left" and ( x > -max_x) :
            x -= 1
        if i == "right" and ( x < max_x) :
            x += 1
        if i == "down" and ( y > -max_y) :
            y -= 1
        if i == "up" and ( y < max_y) :
            y += 1
            
    answer = [x,y]
    return answer
            
            