import java.util.*;


class Scrabble {

	private static final HashMap<String,Integer> letterScore = initializeLetterScoreMap();
	private String[] wordLetters;
	private Integer scrabbleScore = 0;

	private static HashMap<String,Integer> initializeLetterScoreMap() {
		// Initialize HashMap of scores for each letter
		HashMap<String,Integer> letterScoreMap = new HashMap<String,Integer>();
		letterScoreMap.put("A",1);
		letterScoreMap.put("E",1);
		letterScoreMap.put("I",1);
		letterScoreMap.put("O",1);
		letterScoreMap.put("U",1);
		letterScoreMap.put("L",1);
		letterScoreMap.put("N",1);
		letterScoreMap.put("R",1);
		letterScoreMap.put("S",1);
		letterScoreMap.put("T",1);
		letterScoreMap.put("D",2);
		letterScoreMap.put("G",2);
		letterScoreMap.put("B",3);
		letterScoreMap.put("C",3);
		letterScoreMap.put("M",3);
		letterScoreMap.put("P",3);
		letterScoreMap.put("F",4);
		letterScoreMap.put("H",4);
		letterScoreMap.put("V",4);
		letterScoreMap.put("W",4);
		letterScoreMap.put("Y",4);
		letterScoreMap.put("K",5);
		letterScoreMap.put("J",8);
		letterScoreMap.put("X",8);
		letterScoreMap.put("Q",10);
		letterScoreMap.put("Z",10);

		return letterScoreMap;
	}

    Scrabble(String word) {
		wordLetters = word.toUpperCase().split("");
		calcScrabbleScore();
    }

    int getScore() {
		return scrabbleScore;
    }

	private void calcScrabbleScore() {
		for ( String wordLetter : wordLetters ) {
			scrabbleScore += letterScore.get(wordLetter);
		}
	}
}
