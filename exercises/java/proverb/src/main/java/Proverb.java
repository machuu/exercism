class Proverb {

    private String proverbLines = "";

    Proverb(String[] words) {
        // Quit early if there are no words
        if ( words.length == 0 ) {
            return;
        }

        // Only add 'For want of' lines, when there are more than two words
        if ( words.length >= 2 ) {
            for ( int i = 0; i < words.length - 1; i++ ) {
                proverbLines+="For want of a " + words[i] + " the " + words[i+1] + " was lost.\n";
            }
        }

        // Add last line
        proverbLines+="And all for the want of a " + words[0] + ".";
    }

    String recite() {
        return proverbLines;
    }

}
