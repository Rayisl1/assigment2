def problem7():
    print(f"{'Celsius':<10} | {'Fahrenheit':<10}")
    print("-" * 25)

    for celsius in range(0, 101, 10):
        fahrenheit = (celsius * 9/5) + 32
        print(f"{celsius:<10} | {fahrenheit:<10.1f}")

if __name__ == "__main__":
    problem7()