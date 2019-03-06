import string
import random

class Robot(object):

    alpha_qty  = 2
    alpha_pool = string.ascii_uppercase
    digit_qty  = 3
    digit_pool = ''.join(map(str,list(range(0,10))))

    def __init__(self):
        self.generate_new_name()

    def generate_new_name(self):
        new_name = ""

        # Re-seed Random Number Generator
        random.seed()

        # For qty of alpha characters, append a random character from alpha_pool
        for alpha_num in range(0,self.alpha_qty):
            new_name += random.choice(self.alpha_pool)

        # For qty of digit characters, append a random character from digit_pool
        for digit_num in range(0,self.digit_qty):
            new_name += random.choice(self.digit_pool)

        self.name = new_name

    def reset(self):
        self.generate_new_name()
