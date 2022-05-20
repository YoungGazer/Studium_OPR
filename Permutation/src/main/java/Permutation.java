import java.util.Arrays;

public class Permutation {
    private final int[] permutation;

    public Permutation(int n) {
        this.permutation = new int[n];

        for (int i = 0; i < n; i++) {
            this.permutation[i] = i;
        }
    }

    public String gibAlsText() {
        String text = "";

        for (int i = 0; i < this.permutation.length - 1; i++) {
            text = text.concat(this.permutation[i] + "-");
        }

        text = text.concat(String.valueOf(this.permutation[this.permutation.length - 1]));

        return text;
    }

    public boolean naechstePermutation() {
        boolean naechstePermutationsGefunden = false;

        for (int i = this.permutation.length - 1; i > 0 && !naechstePermutationsGefunden; i--) {
            int[] aktuellesZahlenpaar = {this.permutation[i - 1], this.permutation[i]};

            if (aktuellesZahlenpaar[0] < aktuellesZahlenpaar[1]) {
                naechstePermutationsGefunden = true;
                int naechstHoehereZahl = aktuellesZahlenpaar[1];
                int naechstHoehereZahlIndex = i;

                for (int j = i; j < this.permutation.length; j++) {
                    if (this.permutation[j] > aktuellesZahlenpaar[0] && this.permutation[j] < naechstHoehereZahl) {
                        naechstHoehereZahl = this.permutation[j];
                        naechstHoehereZahlIndex = j;
                    }
                }

                this.permutation[i -1] = naechstHoehereZahl;
                this.permutation[naechstHoehereZahlIndex] = aktuellesZahlenpaar[0];

                int[] subArray = Arrays.copyOfRange(this.permutation, i, this.permutation.length);
                Arrays.sort(subArray);

                System.arraycopy(subArray, 0, this.permutation, i, subArray.length);
            }
        }

        return naechstePermutationsGefunden;
    }
}
