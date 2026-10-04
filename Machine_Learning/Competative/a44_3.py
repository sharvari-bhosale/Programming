###############################################################################
#
#   Import required libraries
#
###############################################################################

import pandas as pd

###############################################################################
#
#   Function name   :   Sum
#   Description     :   Add new column to display sum of all subjects
#   Author          :   Sharvari Gorakhnath Bhosale
#   Date            :   20.08.2026
#
###############################################################################

def Sum():

    data = {
        'Name':['Amit','Sagar','Pooja'],
        'Math':[85,90,78],
        'Science':[92,88,80],
        'English':[75,85,82]
    }

    dObj = pd.DataFrame(data)

    dObj["Sum"] = dObj["Math"] + dObj["Science"] + dObj["English"]

    print(dObj)

###############################################################################
#
#   Application to add new column to display sum of all subjects
#
###############################################################################

def main():
    Sum()

if __name__ == "__main__":
    main()