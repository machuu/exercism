import java.util.regex.Pattern;

class PigLatinTranslator {

	// List of beginning letters that make a vowel sound
	private String[] beginVowelSounds = new String[] {
		"a",
		"e",
		"i",
		"o",
		"u",
		"xr",
		"yt"
	};

	String translate(String word) {
		
		String startsWith = "";
		String translatedWord = "";

		// Check if word starts with a vowel sound
		for ( String vowelSound : beginVowelSounds ) {
			if ( word.startsWith(vowelSound) ) {
				startsWith = "vowelSound";
			}
		}

		if (startsWith == "vowelSound" ) {
			// translate word starting with vowel sound
			// just append 'ay' to word
			translatedWord = word + "ay";
		} else {
			// translate word not starting with vowel sound
			// move first letter to end, then append 'ay'
			translatedWord = word.substring(1) + word.charAt(0) + "ay";
		}

		return translatedWord;
	}
}
