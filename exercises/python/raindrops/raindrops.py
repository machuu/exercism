from enum import Enum

class Drop(Enum):
  Pling = 3
  Plang = 5
  Plong = 7

  def isIn(self, dropNumber):
    return (dropNumber % self.value == 0)

def convert(number):
  drops = ""

  for drop in Drop:
    if drop.isIn(number):
      drops+=drop.name

  if drops == "":
    drops = str(number)

  return drops
