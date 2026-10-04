###############################################################################
#
#   Import required libraries
#
###############################################################################

import pandas as pd

###############################################################################
#
#   Function name   :   StudentScore
#   Description     :   Display students who's score is more than 85 in Sceince
#   Author          :   Sharvari Gorakhnath Bhosale
#   Date            :   20.08.2026
#
###############################################################################

def StudentScore():

    data = {
        'Name':['Amit','Sagar','Pooja'],
        'Math':[85,90,78],
        'Science':[92,88,80],
        'English':[75,85,82]
    }

    dObj = pd.DataFrame(data)

    for i in range(len(dObj)):
        if(dObj["Science"][i] > 85):
            print(dObj["Name"][i], " : ", dObj["Science"][i])

###############################################################################
#
#   Application to display students who's score is more than 85 in Sceince
#
###############################################################################

def main():
    StudentScore()

if __name__ == "__main__":
    main()