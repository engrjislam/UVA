package vol001;


public class uva102 {

    public static void main(String[] args) {

        long[] bin = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        char[] pack = {'B', 'G', 'C'};
        long[] max = new long[3];
        int[] maxPosition = new int[3];
        int maxIndex = 0;

        for (int i = 0; i < bin.length / 3; i++) {
            max[maxIndex++] = findMax(bin[i], bin[i + 3], bin[i + 6]);
        }

        for (int i = 0; i < max.length; i++) {
            System.out.println(pack[i] + " > " + max[i]);
        }
    }

    public static long findMax(long a, long b, long c) {
        return Math.max(a, Math.max(b, c));
    }

}
