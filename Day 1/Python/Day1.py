#Convert the expenses list into a iterable object
input = open("input.txt").readlines()
expenses = [int(line.strip()) for line in input]

#Part 1
def findPair(numList):
    for valueA in numList:
        for valueB in numList:
            if (valueA+valueB == 2020):
                return valueA*valueB
    return -1

#Run Part 1
print(findPair(expenses))

#Part 2
def findTriplet(numList):
    for valueA in numList:
        for valueB in numList:
            for valueC in numList:
                if (valueA+valueB+valueC == 2020):
                    return valueA*valueB*valueC
    return -1

#Run Part 2
print(findTriplet(expenses))