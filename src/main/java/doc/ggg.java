package doc;

public class ggg {
    public static void main(String[] args) {


        long max = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;
        //System.out.println(min-1);
        int a = 4;
        int b = ~a + 1;
        // System.out.println(b);
        int sum = 0;
        int c = 0b00011000_01001111_10110001_01101011;
        for (int i = 0; i < 4; i++) {
            int d = (c >>> (8 * i)) & 0xff;
            int f = (d << (8 * i));
            sum = sum | f;
        }
        System.out.println(Integer.toBinaryString(sum));
    }}
