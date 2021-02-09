import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

class ProteinTranslator {

    private static HashMap<String, String> codons;

    static {
        codons = new HashMap<>();
        codons.put("AUG","Methionine");
        codons.put("UUU","Phenylalanine");
        codons.put("UUC","Phenylalanine");
        codons.put("UUA","Leucine");
        codons.put("UUG","Leucine");
        codons.put("UCU","Serine");
        codons.put("UCC","Serine");
        codons.put("UCA","Serine");
        codons.put("UCG","Serine");
        codons.put("UAC","Tyrosine");
        codons.put("UAU","Tyrosine");
        codons.put("UGU","Cysteine");
        codons.put("UGC","Cysteine");
        codons.put("UGG","Tryptophan");
        codons.put("UAA","STOP");
        codons.put("UAG","STOP");
        codons.put("UGA","STOP");
    }

    public List<String> translate(String rnaSequence) {
        List<String> proteinSequence = new ArrayList<String>();
        String protein = "";

        for (String codon : splitRNASequenceIntoCodons(rnaSequence)) {
            protein = getProteinFromCodon( codon );
            if ( protein == "STOP" ) {
                break;
            } else if ( protein == "UNKNOWN" ) {
                break;
            } else {
                proteinSequence.add(protein);
            }
        }

        System.out.format("Translate: %s -> %s\n", rnaSequence, String.join(",", proteinSequence));
        return proteinSequence;
    }

    private static String[] splitRNASequenceIntoCodons(String rnaSequence) {
        if ( rnaSequence == null ) {
           return null;
        }

        return rnaSequence.split("(?<=\\G[AUGC]{3})");
    }

    private static String getProteinFromCodon(String codon) {
        String protein = codons.getOrDefault(codon, "UNKNOWN");
        System.out.format("Translate: %s -> %s\n", codon, protein);

        return protein;
    }
}
