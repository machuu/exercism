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
        List<String> aminoAcidSequence = new ArrayList<String>();
        String aminoAcid = "";

        for (String codon : splitRNASequenceIntoCodons(rnaSequence)) {
            aminoAcid = getAminoAcidFromCodon( codon );
            if ( aminoAcid == "STOP" ) {
                break;
            } else if ( aminoAcid == "UNKNOWN" ) {
                break;
            } else {
                aminoAcidSequence.add(aminoAcid);
            }
        }

        return aminoAcidSequence;
    }

    private static String[] splitRNASequenceIntoCodons(String rnaSequence) {
        if ( rnaSequence == null ) {
           return null;
        }

        // Int codonSequenceLength =
        // String[] codonSequence = new String[
        return rnaSequence.split("(<=\\G[AUGC]{3})");
    }

    private static String getAminoAcidFromCodon(String codon) {
        return codons.getOrDefault(codon, "UNKNOWN");
    }
}
