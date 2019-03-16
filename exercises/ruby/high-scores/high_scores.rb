class HighScores
  def initialize(scores)
    @scores = scores
  end
  
  def scores
    @scores
  end

  def latest
    @scores.last
  end

  def personal_best
    @scores.sort.reverse.first
  end

  def personal_top_three
    @scores.sort.reverse.first(3)
  end
end

