def problem8():
    total = 0

    while True:
        line = input()
        if line == "":
            break

        age = int(line)

        if age <= 2:
            price = 0.00
        elif 3 <= age <= 12:
            price = 14.00
        elif age >= 65:
            price = 18.00
        else:
            price = 23.00

        total += price

    print(f"{total:.2f}")


if __name__ == "__main__":
    problem8()