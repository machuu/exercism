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
	private String[] beginMultiCharConsonantSounds = new String[] {
		"ch",
		"qu",
		"rh",
		"th",
		"thr"
	};

	String translate(String word) {
		
		String startsWith = "";
		Integer startSoundLength = 1;
		String translatedWord = "";

		// Check if word starts with a vowel sound
		for ( String vowelSound : beginVowelSounds ) {
			if ( word.startsWith(vowelSound) ) {
				startsWith = "vowelSound";
				startSoundLength = 0;
			}
		}

		// Check if word starts with multi-character consonant
		// but not if 'startsWith' is already assigned
		if ( startsWith == "" ) {
			for ( String multiCharConsonant : beginMultiCharConsonantSounds ) {
				if ( word.startsWith(multiCharConsonant) ) {
					startsWith = "multiCharConsonant";
					startSoundLength = multiCharConsonant.length();
				} else if ( word.startsWith(multiCharConsonant,1) ) {
					startsWith = "multiCharConsonant";
					startSoundLength = multiCharConsonant.length() + 1;
				}
			}
		}

		if ( startsWith == "vowelSound" ) {
			// translate word starting with vowel sound
			// just append 'ay' to word
			translatedWord = word + "ay";
		} else if ( startsWith == "multiCharConsonant" ) {
			// translate word starting with multi-character consonant
			// move length of consonant sound to end of word, then append 'ay'
			translatedWord = word.substring(startSoundLength) + word.substring(0,startSoundLength) + "ay";
		} else {
			// translate word with single-character consonant
			// move first letter to end, then append 'ay'
			translatedWord = word.substring(1) + word.charAt(0) + "ay";
		}

		return translatedWord;
	}
}
