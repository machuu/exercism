def is_pangram(sentence = ""):
    # list of all letters
    all_letters = "abcdefghijklmnopqrstuvwxyz"

    # iterate through all_letters
    # if a letter is not found in sentence, return False
    for char in all_letters:
        if sentence.lower().find(char) == -1:
            return False

    return True

