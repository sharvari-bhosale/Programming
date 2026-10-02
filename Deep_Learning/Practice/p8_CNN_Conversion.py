from PIL import Image

img = Image.open("digit.png")
print(img.size)        # Display no. of rows and columns of image

img = img.convert("L")  # convert into greyscale
img = img.resize((28, 28))  # (1024, 1024) convert into (28, 28)

img.save("digit_28x28.png")

print(img.size)      # size of updated image

