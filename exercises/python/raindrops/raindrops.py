from enum import Enum

class Drop(Enum):
  PLING = 3
  PLANG = 5
  PLONG = 7

  def isIn(self, dropNumber):
    return self.value % dropNumber == 0

def convert(number):
  drops = ""
  for drop in Drop:
    if drop.isIn(number):
      drops+=drop.name

  if drops == "":
    drops = str(number)

  return drops
