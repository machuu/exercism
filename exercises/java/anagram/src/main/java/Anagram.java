import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Anagram {

	private String originalString = "";
	private String sortedOriginal = "";

	Anagram(String baseString) {
		originalString = baseString;

		// Sort characters from originalString in alphabetical order
		//
		sortedOriginal = sortStringInAlphaOrder( baseString );
	}

	private String sortStringInAlphaOrder( String stringToSort ) {
		char tempCharArray[] = stringToSort.toLowerCase().toCharArray() ;
		Arrays.sort( tempCharArray );
		return new String( tempCharArray );
	}

	private boolean isAnAnagram( String matchString ) {

		// If matchString and originalString are the same word, it's not an anagram
		if ( matchString.toLowerCase().equals(originalString.toLowerCase()) ) {
			return false;
		}

		// If both strings contain the same letters, it is an anagram
		String sortedMatch = sortStringInAlphaOrder(matchString);
		if ( sortedMatch.equals(sortedOriginal)  ) {
			return true;
		} else {
			return false;
		}
	}

	public List<String> match( List<String> matches ) {
		List<String> matchesList = new ArrayList<String>(); 

		for ( String matchString : matches ) {
			if ( isAnAnagram(matchString) ) {
				matchesList.add(matchString);
			}
		}

		return matchesList;
	}

}
