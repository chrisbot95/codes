
def getGrade():
    print('enter grade:')
    grade = int(input())
    if grade >= 75 and grade <= 100:
        print('first')
    elif grade >= 50 and grade <= 74:
        print('second')
    elif grade >= 25 and grade <= 49:
        print('third')
    elif grade >= 0 and grade <= 24:
        print('fourth')
    else:
        RuntimeError
    print()

while True:
    grade = getGrade()
    if grade >