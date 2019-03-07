import re

def proteins(strand):
    # Dictionary of Protien Codon Translations
    codon_translations = {
        "AUG": "Methionine",
        "UUU": "Phenylalanine",
        "UUC": "Phenylalanine",
        "UUA": "Leucine",
        "UUG": "Leucine",
        "UCU": "Serine",
        "UCC": "Serine",
        "UCA": "Serine",
        "UCG": "Serine",
        "UAU": "Tyrosine",
        "UAC": "Tyrosine",
        "UGU": "Cysteine",
        "UGC": "Cysteine",
        "UGG": "Tryptophan",
        "UAA": "STOP",
        "UAG": "STOP",
        "UGA": "STOP",
    }

    # Break strand into list of codons
    codons = re.findall('...',strand)

    proteins = []

    for codon in codons:
        translation = codon_translations[codon]
        if translation == "STOP":
            # stop translating
            break
        elif translation != "":
            # Add translated protein to list
            proteins.append(translation)
        else:
            # If protein isn't recognized, add XXX-NotFound
            # This will continue to translate the remaining codons, and
            # make it clear which codon was not found in the lookup
            proteins.append(translation + "-NotFound")

    return proteins
