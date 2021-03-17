numIn = 0;

def enterNumber():
    global num
    print("enter number: ", end='')
    num = int(input())

enterNumber()

while (num != 0):
    print("Your number squared = " + str(num**2), end='\n')
    enterNumber()