def is_armstrong(number):
    str_number = str(number)
    num_digits = len(str_number)

    armstrong_sum = 0

    for str_digit in str_number:
        digit = int(str_digit)
        armstrong_sum += digit ** num_digits

    if armstrong_sum == number:
        return True
    else:
        return False
