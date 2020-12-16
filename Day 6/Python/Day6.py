# Convert input
input = open("input.txt").read()
questions_per_group = input.split("\n\n")

#Part 1
def sumQuestionCount(questions):
    count = 0
    cleanedQuestions = ["".join(line.split("\n")) for line in questions]
    for group in cleanedQuestions:
        reducedQuestion=set(group)
        count += len(reducedQuestion)
    return count

#Part 2
def sumSameQuestionCount(questions):
    count = 0
    cleanedQuestions = [line.split("\n")for line in questions]
    for group in cleanedQuestions:
        repeated = []
        allQuestions = set("".join(group))
        for question in allQuestions:
            isRepeated = True
            for individualAns in group:
                if question not in individualAns:
                    isRepeated=False
            if isRepeated:
                repeated.append(question)
        count += len(repeated)
    return count

#Run
print("Answer to part 1")
print(sumQuestionCount(questions_per_group))

print("Answer to part 2")
print(sumSameQuestionCount(questions_per_group))