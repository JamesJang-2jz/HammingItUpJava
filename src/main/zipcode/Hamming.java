package zipcode;

public class Hamming {
    private String dna1;
    private String dna2;
    public Hamming(String dna1, String dna2) {
        this.dna1 = dna1;
        this.dna2 = dna2;
        if (dna1.length() != dna2.length()){
            throw new IllegalArgumentException();
        }
    }

    public int getHammingDistance() {
        return -1;
    }
}
