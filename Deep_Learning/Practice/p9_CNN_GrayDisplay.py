from PIL import Image
import numpy as np

img = Image.open("digit_28x28.png")
img = img.convert("L")
img = img.resize((28,28))

pixels = np.array(img)

print("Image size : ",pixels.shape)

print("Pixel values : ")
print(pixels)

"""
    0   :   Pure black
    255 :   Pure white
    50  :   Dark gray
    120 :   Medium gray
    200 :   Light gray
"""