module Acronym
  def self.abbreviate(words)
    # Convert a string containing words into a string of
    # uppercase first letters from each word
    #   - scan for a letter following a word boundary
    #   - join the array of scanned letters into a string
    #   - convert all letters in the string to uppercase
    #   - resulting string is returned
    words.scan(/\b[a-zA-Z]/).join('').upcase
  end
end
