import sys

f1 = open(sys.argv[1], "r")
f2 = open(sys.argv[2], "w")

f2.write(f1.read())