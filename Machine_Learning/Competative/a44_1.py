###############################################################################
#
#   Import required libraries
#
###############################################################################

import pandas as pd

###############################################################################
#
#   Function name   :   MarvellousDf
#   Description     :   Display basic information like shape, columns, data types
#   Author          :   Sharvari Gorakhnath Bhosale
#   Date            :   20.08.2026
#
###############################################################################

def MarvellousDf():

    data = {
        'Name':['Amit','Sagar','Pooja'],
        'Math':[85,90,78],
        'Science':[92,88,80],
        'English':[75,85,82]
    }

    dObj = pd.DataFrame(data)

    print("Shape is : ", dObj.shape)
    print("Columns : ", dObj.columns)
    print("Data types : ", dObj.dtypes)

###############################################################################
#
#   Application to display basic information like shape, columns, data types
#
###############################################################################

def main():
    MarvellousDf()

if __name__ == "__main__":
    main()