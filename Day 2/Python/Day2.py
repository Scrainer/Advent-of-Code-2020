#Test Area
#test = ["1-3 a: abcde","1-3 b: cdefg","2-9 c: ccccccccc"]
#---------------------------------------------------------

#Convert the passwords list into a iterable object
input = open("input.txt").readlines()
passwords = [line.strip() for line in input]


#Part 1
def validPasswords(passList):
    numValid = 0
    for policyPass in passList:
        policy,password = tuple(policyPass.split(": "))
        numPolicy,letterPolicy = tuple(policy.split(" "))
        minValue, maxValue = tuple(numPolicy.split("-"))

        count = 0
        for character in password:
            if character == letterPolicy:
                count+=1
        
        if count >= int(minValue) and count<=int(maxValue):
            numValid+=1

    return numValid

#Run Part 1
print("Answer to puzzle 1:")
print(validPasswords(passwords))

#Part 2
def validPasswords2(passList):
    numValid = 0
    for policyPass in passList:
        policy,password = tuple(policyPass.split(": "))
        numPolicy,letterPolicy = tuple(policy.split(" "))
        pos1, pos2 = tuple(numPolicy.split("-"))
        pos1 = int(pos1)-1
        pos2= int(pos2)-1

        if len(password) > pos2:
            if (letterPolicy==password[pos1] and letterPolicy!=password[pos2]) or (letterPolicy!=password[pos1] and letterPolicy==password[pos2]):
                numValid += 1
    
    return numValid

#Run Part 2
print("Answer to puzzle 2:")
print(validPasswords2(passwords))