module Acronym
  FIRST_CHARACTER_REGEX = /\b[a-zA-Z]/

  def self.abbreviate(words)
    # Convert a string containing words into a string of uppercase first letters from each word
    words.scan(FIRST_CHARACTER_REGEX).join.upcase
  end
end
