module FlattenArray

  def FlattenArray.flatten(array)
    # Recursive method to: 
    #   - flatten nested arrays into a 1-D array
    #   - strip nil elements

    # use local variable to store flattened/cleaned array
    flattened_array = []

    # for each element in the given array, append the element to local array variable
    array.each do |element|
      if element.is_a? Array
        # If element is an array, flatten it before adding to local array variable
        flattened_array.push(*FlattenArray.flatten(element))
      elsif not element.nil?
        # If element is not nil, add to local array variable
        flattened_array.push(element)
      end
      # If element is nil, it will be skipped
    end

    return flattened_array
  end

end

