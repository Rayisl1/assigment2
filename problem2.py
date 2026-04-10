def identify_shape():
    try:
        sides = int(input("Введите количество сторон фигуры (от 3 до 10): "))


        if sides == 3:
            print("Это треугольник")
        elif sides == 4:
            print("Это четырехугольник")
        elif sides == 5:
            print("Это пятиугольник ")
        elif sides == 6:
            print("Это шестиугольник ")
        elif sides == 7:
            print("Это семиугольник ")
        elif sides == 8:
            print("Это восьмиугольник")
        elif sides == 9:
            print("Это девятиугольни")
        elif sides == 10:
            print("Это десятиугольник")
        else:
            print("Ошибка: Количество сторон должно быть в диапазоне от 3 до 10.")

    except ValueError:

        print("Ошибка: Пожалуйста, введите целое число.")

identify_shape()