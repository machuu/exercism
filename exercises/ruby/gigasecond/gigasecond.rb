# Gigasecond exercise

module Gigasecond
  @@seconds_in_gigasecond = 10 ** 9

  def Gigasecond.from(from_time = 0)
    return from_time + @@seconds_in_gigasecond
  end
end
