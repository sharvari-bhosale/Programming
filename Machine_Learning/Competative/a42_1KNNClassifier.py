###############################################################################
#
#   Import required libraries
#
###############################################################################

import math

###############################################################################
#
#   Function name   :   EucDistance
#   Description     :   Calculate the euclidean distance
#   Author          :   Sharvari Gorakhnath Bhosale
#   Date            :   11.08.2026
#
###############################################################################

def EucDistance(P1, P2):

    Ans = math.sqrt((P1['X'] - P2['X']) ** 2 + (P1['Y'] - P2['Y']) ** 2)

    return Ans

###############################################################################
#
#   Function name   :   KNNClassifier
#   Description     :   Load the data, calculate euclidean distance,
#                        predict class
#   Author          :   Sharvari Gorakhnath Bhosale
#   Date            :   11.08.2026
#
###############################################################################

def KNNClassifier(k = 3):

    border = "-"*40
    print(border)
    print("KNN Classifier")
    print(border)

    Data = [
        {'Point' : 'A', 'X' : 1, 'Y' : 2, 'Label' : 'Red'},
        {'Point' : 'B', 'X' : 2, 'Y' : 3, 'Label' : 'Red'},
        {'Point' : 'C', 'X' : 3, 'Y' : 1, 'Label' : 'Blue'},
        {'Point' : 'D', 'X' : 6, 'Y' : 5, 'Label' : 'blue'}
    ]

    for d in Data:
        print(d)

    print(border)

    #Accept X and Y coordinates as new point from user
    X = int(input("Enter X coordinate : "))
    Y = int(input("Enter Y coordinate : "))

    new_point = {'X' : X, 'Y' : Y}

    print(border)

    #Euclidean distance from all dataset points

    print("Distances of all points : ")
    for d in Data:
        d['Distance'] = (EucDistance(d, new_point))

    for d in Data:
        print(d)

    print(border)

    #Sort distance 

    sorted_distance = sorted(Data, key=lambda item : item['Distance'])

    print("Sorted distance is : ")
    print(border)

    for d in Data:
        print(d)

    print(border)

    #select k nearest neighbours

    nearest = sorted_distance[:k]

    print("Nearest k neighbours : ")
    print(border)
    for d in nearest:
        print(d)

    print(border)

    #predict class label

    votes = {}

    for n in nearest:
        label = n['Label']
        votes[label] = votes.get(label, 0) + 1

    print(border)
    print("Voting result is : ")
    print(border)

    for label in votes:
        print("Name : ",label , "Number of votes : ", votes[label])

    print(border)

    iMax = 0
    Name = ""

    for label in votes:
        if(votes[label] > iMax):
            iMax = votes[label]
            Name = label

    print("Prediction class : ", Name)

###############################################################################
#
#   Application to display Load the data, calculate euclidean distance,
#                        predict class
#
###############################################################################

def main():
    KNNClassifier()


if __name__ == "__main__":
    main()