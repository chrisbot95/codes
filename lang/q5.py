array = []

for i in range(10):
    print("add a number to the list: ", end='')
    array.append(int(input()))

for i in range(10):
    print(array[i], end=' ')

print()

for i in reversed(range(10)):
    print(array[i], end=' ')

print()

for i in range(10):
    print(array.pop(), end=' ')
print("\n");