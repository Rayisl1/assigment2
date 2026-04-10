def problem10():
    valid_input = False
    while not valid_input:
        user_input = input("Enter a number: ")
        if user_input.replace('.', '', 1).isdigit():
            number = float(user_input)
            valid_input = True
        else:
            print("Invalid input. Please enter a numeric value.")

    for i in range(1, 11):
        result = number * i
        print(f"{number} x {i} = {result}")

if __name__ == "__main__":
    problem10()