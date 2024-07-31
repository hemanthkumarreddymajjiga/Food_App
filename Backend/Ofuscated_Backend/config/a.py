def calculate_valency(element):
    return sum(int(digit) for digit in str(ord(element)))

def balance_compound(compound, equivalent_point):
    element1, element2 = compound[0], compound[1]
    valency1 = calculate_valency(element1)
    valency2 = calculate_valency(element2)

    for multiple1 in range(equivalent_point // valency1 + 1):
        remaining_equivalent = equivalent_point - multiple1 * valency1
        if remaining_equivalent % valency2 == 0:
            multiple2 = remaining_equivalent // valency2
            print(f"{element1}{multiple1} {element2}{multiple2}")

    print("Not Possible")


# Input
compound = input().strip()
equivalent_point = int(input().strip())

# Output
balance_compound(compound, equivalent_point)