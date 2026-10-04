###############################################################################
#
#   Import required libraries
#
###############################################################################

import math

def EucDistance(P1, P2):

    Ans = math.sqrt((P1['X'] - P2['X']) ** 2 + (P1['Y'] - P2['Y']) ** 2)

    return Ans


def KNNClassifier(k = 3):

    #load data
    border = "-"*40

    print(border)
    print("Load data")
    print(border)

    Data = [
        {'X' : 2, 'Y' : 60, 'Result' : 'Fail'},
        {'X' : 5, 'Y' : 80, 'Result' : 'Pass'},
        {'X' : 6, 'Y' : 85, 'Result' : 'Pass'},
        {'X' : 1, 'Y' : 50, 'Result' : 'Fail'}
    ]

    for d in Data:
        print(d)

    #accept new point from user

    print(border)
    print("Accept new point from user")
    print(border)

    X = int(input("Enter study hours : "))
    Y = int(input("Enter attendence : "))

    new_point = {'X' : X, 'Y' : Y}

    #display all distances

    print(border)
    print("Display all distances : ")
    print(border)

    for d in Data:
        d['Distance'] = (EucDistance(d, new_point))

    for d in Data:
        print(d)
    print(border)

    #sort the data

    sorted_data = sorted(Data, key=lambda item : item['Distance'])

    print("Sorted data : ")
    print(border)

    for d in sorted_data:
        print(d)

    print(border)

    #Find nearest k value

    nearest = sorted_data[:k]

    print("Nearest 3 values :")
    print(border)

    for d in nearest:
        print(d)

    print(border)

    #predict class

    votes = {}

    for n in nearest:
        label = n['Result']
        votes[label] = votes.get(label, 0)+1

    print("Voting result is : ")
    print(border)

    for label in votes:
        print("Name : ", label, "Number of votes : ",votes[label])

    print(border)

    iMax = 0
    Name = ""

    for label in votes:
        if(votes[label] > iMax):
            iMax = votes[label]
            Name = label

    print("Predicted result : ", Name)
    print(border)

def main():
    KNNClassifier()


if __name__ == "__main__":
    main()