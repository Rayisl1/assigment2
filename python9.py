def problem9():
    total_cost = 0.0

    while True:
        line = input().strip()
        if line == "":
            break

        age = int(line)

        if age <= 2:
            cost = 0.00
        elif 3 <= age <= 12:
            cost = 14.00
        elif age >= 65:
            cost = 18.00
        else:
            cost = 23.00

        total_cost += cost

    print(f"The total admission cost for the group is {total_cost:.2f}")


if __name__ == "__main__":
    problem9()