def solution(chicken):
    answer = 0
    
    while chicken >= 10:
        free_chickens = chicken // 10
        answer += free_chickens
        chicken = free_chickens + (chicken % 10)
    
    return answer
