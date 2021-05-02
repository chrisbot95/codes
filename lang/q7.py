def getGrade():
    print('enter grade:')
    grade = int(input())
    if grade >=0 and grade <= 100:
        return grade
    else:
        raise RuntimeError("Invalid grade was entered.")

while True:
    try:
        grade = getGrade()
        if grade >= 75 and grade <= 100:
            print('first')
        elif grade >= 50 and grade <= 74:
            print('second')
        elif grade >= 25 and grade <= 49:
            print('third')
        else:
            print('fourth')
        break
    except RuntimeError as rtm:
        print(rtm)