def days_in_month():
    month = input("Введите название месяца: ").capitalize()

    if month in ("January", "March", "May", "July", "August", "October", "December"):
        print(f"В месяце {month} 31 день.")

    elif month in ("April", "June", "September", "November"):
        print(f"В месяце {month} 30 дней.")

    elif month == "February":
        print(f"В месяце {month} 28 или 29 дней.")

    else:
        print("Ошибкa неверное название месяца.")


days_in_month()