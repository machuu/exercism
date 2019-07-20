class IsogramChecker {

	private String allowedDuplicateCharacters = " -";

    boolean isIsogram(String phrase) {
        for ( int i = 0; i < phrase.length(); i++ ) {
			if ( countCharInString( phrase.charAt(i), phrase) > 1 ) {
				return false;
			}
		}

		return true;
    }

	private int countCharInString(char targetChar, String searchString) {
		int count = 0;
		for ( int i = 0; i < searchString.length() ; i++ ) {
			char searchChar = searchString.charAt(i);

			// If current character is an allowed duplicate, then skip counting it
			if ( allowedDuplicateCharacters.indexOf(searchChar) > -1 ) {
				continue;
			} else if ( Character.toUpperCase(searchChar) == Character.toUpperCase(targetChar) ) {
				count++;
			}
		}

		return count;
	}

}
