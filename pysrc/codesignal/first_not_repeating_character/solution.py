from collections import Counter


def firstNotRepeatingCharacter(s):
    counts = Counter(s)

    for count in counts:
        if counts[count] == 1:
            return count
    else:
        return '_'
