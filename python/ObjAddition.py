class Addition:
    # initialize variables to hold parameter values
    first = 0
    second = 0
    answer = 0

    # parameterized constructor
    # self represents the instance of the class
    def __init__(self, f, s): # three parameters with self necessary
        self.first = f # second parameter behind self
        self.second = s # third parameter behind self

    def display(self): # function to display output calling class instance
        print("First number = " + str(self.first))
        print("Second number = " + str(self.second))
        print("Addition of two numbers = " + str(self.answer))

    def calculate(self): # function to define third variable
        self.answer = self.first + self.second

# creating object of the class
# this will invoke parameterized constructor
obj = Addition(1000, 2000) 

# perform Addition
obj.calculate()

# display result
obj.display()
