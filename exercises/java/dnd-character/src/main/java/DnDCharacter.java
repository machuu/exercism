import java.util.Random;

class DnDCharacter {

	int rollDie(int numSides) {
		Random random = new Random();
		return random.nextInt( numSides) + 1;
	}

	int ability() {

		Integer sumOfAllRolls = 0;

		// Roll 4d6
		Integer rolls[] = {
			rollDie(6),
			rollDie(6),
			rollDie(6),
			rollDie(6)
			};
		
		// Iterate through array
		//   - Add all rolls
		//   - Get lowest Roll
		Integer lowestRoll = rolls[0];
		for ( Integer roll : rolls ) {
			sumOfAllRolls += roll;
			if ( roll < lowestRoll ) {
				lowestRoll = roll;
			}
		}

		// Return the sum of all rolls, subtracting the lowest
		return sumOfAllRolls - lowestRoll;
	}

	int modifier(int input) {
		return (int)Math.floor( ( input - 10 - (input % 2 ) ) / 2 );
	}

	int getStrength() {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	int getDexterity() {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	int getConstitution() {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	int getIntelligence() {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	int getWisdom() {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	int getCharisma() {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

	int getHitpoints() {
		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
	}

}
