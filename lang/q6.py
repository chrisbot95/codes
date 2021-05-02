def combineLists(x, y):
    for i in range(len(y)):
        x.append(y[i])
    return x

array1 = [1,2,3]
array2 = [4,5,6]
array3 = combineLists(array1, array2)
print(array3)