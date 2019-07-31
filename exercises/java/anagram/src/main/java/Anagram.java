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
		return String( Arrays.sort( inputString.toLowerCase().toCharArray() ) );
	}

	public List<String> match( List<String> matches ) {
		List<String> matchesList = new ArrayList<String>(); 
		String sortedMatch = "" ;

		for ( matchString : matches[] ) {
			sortedMatch = sortStringInAlphaOrder(matchString);
			if ( sortedMatch.equals(sortedBase) ) {
				matchesList.add(matchString);
			}
		}

		return matchesList;
	}

}
