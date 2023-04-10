package zipcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hamming {
    private String dna1;
    private String dna2;
    public Hamming(String dna1, String dna2) {
        this.dna1 = dna1;
        this.dna2 = dna2;
        if (dna1.length() != dna2.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        int count = 0;
        for (int i = 0; i < dna1.length(); i++) {
            if (dna1.charAt(i) != dna2.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
