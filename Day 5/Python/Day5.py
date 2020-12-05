# Convert Input
input = open("input.txt").readlines()
seats = [line.strip() for line in input]


# Part 1
def binarySeatingHighestID(seatList):
    highestID = 0
    for seat in seatList:
        tempbinary = []
        for char in seat:
            if char == "F" or char == "L":
                tempbinary.append(0)
            else:
                tempbinary.append(1)
        row = tempbinary[:7]
        column = tempbinary[7:]
        rowValue = 0
        columnValue = 0
        for i in range(len(row)):
            rowValue += row[i] * (2 ** (6 - i))
        for i in range(len(column)):
            columnValue += column[i] * (2 ** (2 - i))
        id = rowValue * 8 + columnValue
        if id > highestID:
            highestID = id
    return highestID


# Part 2
def findMySeat(seatList):
    mySeatId = 0
    highestID = 0
    lowestID = 999
    existingSeats = []
    missing = []
    for seat in seatList:
        tempbinary = []
        for char in seat:
            if char == "F" or char == "L":
                tempbinary.append(0)
            else:
                tempbinary.append(1)
        row = tempbinary[:7]
        column = tempbinary[7:]
        rowValue = 0
        columnValue = 0
        for i in range(len(row)):
            rowValue += row[i] * (2 ** (6 - i))
        for i in range(len(column)):
            columnValue += column[i] * (2 ** (2 - i))
        id = rowValue * 8 + columnValue
        if id > highestID:
            highestID = id
        if id < lowestID:
            lowestID = id
        existingSeats.append(id)
    for i in range(lowestID, 865):
        if i not in existingSeats:
            mySeatId = i
    return mySeatId


# Run
print("Answer to Part 1:")
print(binarySeatingHighestID(seats))
print("Answer to Part 2:")
print(findMySeat(seats))
