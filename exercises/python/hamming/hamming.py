def distance(strand_a, strand_b):
  if ( len(strand_a) != len(strand_b) ):
    raise ValueError("Strands are not equal length")

  if ( strand_a == strand_b ):
    return 0

  distance = 0
  for char_index in range(0,len(strand_a)):
    if (strand_a[char_index] != strand_b[char_index] ):
      distance+=1

  return distance
