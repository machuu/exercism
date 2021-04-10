from enum import Enum

class Drop(Enum):
  Pling = 3
  Plang = 5
  Plong = 7

  def isFactorOf(self, dropNumber):
    return (dropNumber % self.value == 0)

def convert(number):
  drops = ""

  for drop in Drop:
    if drop.isFactorOf(number):
      drops+=drop.name

  # If no drops were added, assign the number
  if drops == "":
    drops = str(number)

  return drops
