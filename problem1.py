def letter():
    letter = str(input("Enter the letter: "))
    #a, e, i, o, u
    if letter == "a" or letter == "e" or letter == "i" or letter == "o" or letter == "u":
        print("letter is vowel")
    elif letter == "y":
        print("y sometimes vowel , sometimes consonant")
    else:
        print("letter is consonant")
letter()