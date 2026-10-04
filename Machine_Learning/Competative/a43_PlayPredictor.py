###############################################################################
#
#   Import required libraries
#
###############################################################################

import pandas as pd
import math
from sklearn.preprocessing import LabelEncoder


def EucDistance(P1, P2):

    Ans = math.sqrt(
        (P1['X'] - P2['X']) ** 2 +
        (P1['Y'] - P2['Y']) ** 2
    )

    return Ans


def KNNClassifier(Datapath, k=3):

    border = "-" * 40

    # Load data

    print(border)
    print("Load data")
    print(border)

    df = pd.read_csv(Datapath)

    print(df)

    # Convert text into numbers

    le_weather = LabelEncoder()
    le_temperature = LabelEncoder()
    le_play = LabelEncoder()

    df['Wether'] = le_weather.fit_transform(df['Wether'])
    df['Temperature'] = le_temperature.fit_transform(df['Temperature'])
    df['Play'] = le_play.fit_transform(df['Play'])

    print(border)
    print("After Label Encoding")
    print(border)

    print(df)

    # Accept new point

    print(border)
    print("Accept new point from user")
    print(border)

    print("Weather values:")
    print(le_weather.classes_)

    print("Temperature values:")
    print(le_temperature.classes_)

    X = int(input("Enter weather value : "))
    Y = int(input("Enter temperature value : "))

    new_point = {
        'X': X,
        'Y': Y
    }

    # Calculate distances

    print(border)
    print("Display all distances")
    print(border)

    Data = []

    for index, row in df.iterrows():

        point = {
            'X': row['Wether'],
            'Y': row['Temperature'],
            'Result': row['Play']
        }

        point['Distance'] = EucDistance(point, new_point)

        Data.append(point)

    for d in Data:
        print(d)

    # Sort data

    sorted_data = sorted(
        Data,
        key=lambda item: item['Distance']
    )

    print(border)
    print("Sorted data")
    print(border)

    for d in sorted_data:
        print(d)

    # Find nearest K

    nearest = sorted_data[:k]

    print(border)
    print("Nearest", k, "values")
    print(border)

    for d in nearest:
        print(d)

    # Voting

    votes = {}

    for n in nearest:

        label = n['Result']

        votes[label] = votes.get(label, 0) + 1

    print(border)
    print("Voting result")
    print(border)

    for label in votes:
        print(
            "Result :",
            label,
            "Votes :",
            votes[label]
        )

    # Find maximum vote

    iMax = 0
    Name = ""

    for label in votes:

        if votes[label] > iMax:

            iMax = votes[label]
            Name = label

    print(border)
    print("Predicted result :", Name)
    print(border)


def main():

    KNNClassifier("MarvellousInfosystems_PlayPredictor.csv", 3)


if __name__ == "__main__":
    main()