###############################################################################
#
#   Import required libraries
#
###############################################################################

import pandas as pd

###############################################################################
#
#   Function name   :   DisplayStatisticInformation
#   Description     :   Display Statistic Information
#   Author          :   Sharvari Gorakhnath Bhosale
#   Date            :   20.08.2026
#
###############################################################################

def DisplayStatisticInformation():

    border = "-"*40

    data = {
        'Name':['Amit','Sagar','Pooja'],
        'Math':[85,90,78],
        'Science':[92,88,80],
        'English':[75,85,82]
    }

    dObj = pd.DataFrame(data)

    print(border)
    print("Statistic Information : ")
    print(border)

    print(dObj.describe())
    print(border)

###############################################################################
#
#   Application to display statistic information
#
###############################################################################

def main():
    DisplayStatisticInformation()

if __name__ == "__main__":
    main()