def problem6():
    total = 0
    count = 0

    first_val = float(input())

    if first_val == 0:
        print("Error: The first value cannot be 0.")
        return

    total += first_val
    count += 1

    while True:
        val = float(input())
        if val == 0:
            break
        total += val
        count += 1

    average = total / count
    print(average)

if __name__ == "__main__":
    problem6()