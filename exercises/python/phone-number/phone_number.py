import re

class Phone(object):
    def __init__(self, input_phone_number):
        self.raw_input = str(input_phone_number)
        self.clean_phone_number()
        self.validate_NNAP_format()

    def clean_phone_number(self):
        # Use raw_input as the starting point for self.number
        self.number = self.raw_input

        # Remove all spaces
        self.number = re.sub("\s","",self.number)
        
        # Remove all valid non-digit characters
        #  - leading '+'
        #  - any '-', '(', ')'
        valid_non_digit_regex = re.compile("(^\+|[\.\-\(\)])")
        self.number = valid_non_digit_regex.sub("",self.number)


        # At this point, remaining characters in self.number are
        #   - digits
        #   - invalid punctuation
        ten_digit_regex = re.compile("^\d{10}$")
        eleven_digits_with_1_country_code = re.compile("^1\d{10}")
        if ten_digit_regex.match(self.number):
            return True
        elif eleven_digits_with_1_country_code.match(self.number):
            # Remove leading 1
            self.number = re.sub("^1","",self.number)
        else:
            raise ValueError(self.number + " contains invalid characters")
            
    def validate_NNAP_format(self):

        NNAP_phone_regex      = re.compile("^([2-9]\d{2})([2-9]\d{2})(\d{4})$")
        ten_digit_phone_regex = re.compile("^\d{10}$")
        long_phone_regex      = re.compile("^\d{10}\d+$")
        short_phone_regex     = re.compile("^\d{0,9}$")

        NNAP_match = NNAP_phone_regex.match(self.number)

        if NNAP_match:
            self.area_code         = NNAP_match.group(1)
            self.exchange_code     = NNAP_match.group(2)
            self.subscriber_number = NNAP_match.group(3)
        elif ten_digit_phone_regex.match(self.number):
            raise ValueError(self.number + " is not NNAP number")
        elif long_phone_regex.match(self.number):
            raise ValueError(self.number + " is more than 10 digits")
        elif short_phone_regex.match(self.number):
            raise ValueError(self.number + " is less than 10 digits")

    def pretty(self):
        "(%3d) %3d-%4d".format(self.area_code,self.exchange_code,self.subscriber_number)
