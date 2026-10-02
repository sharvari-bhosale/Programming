import numpy as np

def Relu(z):
    return max(0, z)

def Marvellous_Neuron_Forward(inputs, weights, bias):

    print("Inputs are (X) : ", inputs)
    print("Weights are (w) : ",weights)
    print("Bias are (b) : ",bias)

    z = 0
    for i in range(len(inputs)):            #Length of inputs and weights should be same
        z = z + (inputs[i] * weights[i])

    z = z + bias

    #z = sum(w * x for w, x in zip(weights, inputs))  + bias    #zip - two columns together

    print("Weighted sum : ",z)

    y = Relu(z)

    return y

def main():

    print("----Marvellous Neural Network----")

    inputs = [1.0,2.0,3.0]
    weights = [0.6,0.4,-0.2]
    bias = 0.5

    result = Marvellous_Neuron_Forward(inputs, weights, bias)

    print("Predicted result : ", result)

if __name__ == "__main__":
    main()

