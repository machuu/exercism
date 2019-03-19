module Pangram
  def self.pangram?(sentence)
    letters = ('A'..'Z').to_a

    # Iterate through each ASCII letter and check if letter is in sentence
    letters.each do |letter|
      return false unless sentence.upcase.include?(letter)
    end

    # If all letter were found, return true
    true
  end
end
