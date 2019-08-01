import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Anagram {

	private String originalString = "";
	private String sortedBase = "";

	Anagram(String baseString) {
		originalString = baseString;

		// Sort characters from originalString in alphabetical order
		//
		sortedBase = sortStringInAlphaOrder( baseString );
	}

	private String sortStringInAlphaOrder( String stringToSort ) {
		char tempCharArray[] = stringToSort.toLowerCase().toCharArray() ;
		Arrays.sort( tempCharArray );
		return new String( tempCharArray );
	}

	private boolean isAnAnagram( String matchString ) {
		String sortedMatch = sortStringInAlphaOrder(matchString);
		if ( sortedMatch.equals(sortedBase) ) {
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
