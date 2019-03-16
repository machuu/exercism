module Complement
  TRANSCRIPTION_HASH = {
    "G" => "C",
    "C" => "G",
    "T" => "A",
    "A" => "U",
  }

  def self.of_dna(dna)
    dna.gsub(/[GCTA]/, TRANSCRIPTION_HASH)
  end
end
