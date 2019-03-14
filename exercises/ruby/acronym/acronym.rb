module Acronym
  def self.abbreviate(original_words)
    # Manipulate 'words' so we can break it down into an array
    # of single words
    # Planning to split on spaces. 
    #   - all non-letter characters will be replaced with a space
    #   - consecutive spaces will be replaced with a single space
    #   - split string into an array, delimited by a single space

    # Start with a new variable
    sanitized_words = original_words

    # Replace non-letters with space, but keep existing spaces too
    sanitized_words.gsub!(/[^a-zA-Z\s]/, ' ')

    # Replace consecutive spaces with a single space
    sanitized_words.gsub!(/\s+/, ' ')

    # Split into array
    words = sanitized_words.split(' ')

    acronym = ""
    words.each do |word|
      acronym += word.chars.first.upcase
    end

    acronym
    
  end
end
