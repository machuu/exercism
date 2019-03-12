def slices(series, length):

    ## Argument validation
    if   (series == ""):
        raise ValueError("series can not be empty")
    elif (length > len(series)):
        raise ValueError("length is longer than series")
    elif (length == 0):
        raise ValueError("length can not be 0")
    elif (length < 0):
        raise ValueError("length can not be negative")

    # Get the first slice
    slices_list = [ series[:length] ]

    # If series is longer than length, call slices() again
    # with a shortened 'series'
    # This recusively adds to the list until 'series' is
    # not longer than 'length'
    if len(series) > length:
        slices_list.extend(slices(series[1:],length))

    # Return the list of slices
    return slices_list

