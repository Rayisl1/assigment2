def problem4():
    month = input("Enter the name of the month: ").strip().capitalize()
    day = int(input("Enter the day: "))

    if month == "January" or month == "February":
        season = "Winter"
    elif month == "March":
        season = "Winter" if day < 20 else "Spring"
    elif month == "April" or month == "May":
        season = "Spring"
    elif month == "June":
        season = "Spring" if day < 21 else "Summer"
    elif month == "July" or month == "August":
        season = "Summer"
    elif month == "September":
        season = "Summer" if day < 22 else "Fall"
    elif month == "October" or month == "November":
        season = "Fall"
    elif month == "December":
        season = "Fall" if day < 21 else "Winter"
    else:
        season = "Invalid input"

    print(season)

if __name__ == "__main__":
    problem4()