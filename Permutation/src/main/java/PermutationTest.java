public class PermutationTest {
    public static void main(String[] args) {
        Permutation testPermutation = new Permutation(10);
        System.out.println(testPermutation.gibAlsText());
        System.out.println(testPermutation.naechstePermutation());
        System.out.println(testPermutation.gibAlsText());
        for (int i = 0; i < 362878; i++) {
            testPermutation.naechstePermutation();
        }
        System.out.println(testPermutation.gibAlsText());
        System.out.println(testPermutation.naechstePermutation());
        System.out.println(testPermutation.gibAlsText());
        for (int i = 0; i < 3265918; i++) {
            testPermutation.naechstePermutation();
        }
        System.out.println(testPermutation.gibAlsText());
        System.out.println(testPermutation.naechstePermutation());
        System.out.println(testPermutation.gibAlsText());
        System.out.println(testPermutation.naechstePermutation());
        System.out.println(testPermutation.gibAlsText());
    }
}
