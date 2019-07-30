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
		
		boolean startsWithVowelSound = false;
		String translatedWord = "";

		// Check if word starts with a vowel sound
		for ( String vowelSound : beginVowelSounds ) {
			if ( word.startsWith(vowelSound) ) {
				startsWithVowelSound = true;
			}
		}

		if (startsWithVowelSound) {
			// translate word starting with vowel sound
			// just append 'ay' to word
			translatedWord = word + "ay";
		}

		return translatedWord;
	}
}
