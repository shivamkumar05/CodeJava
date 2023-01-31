def leapyear(num):
    if((num%400 ==0 or num % 100!=0 ) and num% 4 ==0):
        print('leap year')
    else:
        print('not leap year')
    #modified

n=2018
leapyear(n)
