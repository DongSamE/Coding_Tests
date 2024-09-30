def gcd(a, b):
    # 유클리드 호제법을 사용하여 최대공약수(GCD) 계산
    while b != 0:
        a, b = b, a % b
    return a

def solution(numer1, denom1, numer2, denom2):
    numer_1 = numer1 * denom2
    numer_2 = numer2 * denom1
    denom = denom1 * denom2
    numer = numer_1 + numer_2
             
    gcd_value = gcd(numer, denom)
    
    # 기약분수로 변환
    reduced_numer = numer // gcd_value
    reduced_denom = denom // gcd_value
    
    return [reduced_numer, reduced_denom]