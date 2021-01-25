package strings;

public class IndexOfDemo {
    public static void main(String[] args) {
        String str="thingking in java";
        int in1 = str.indexOf("in");
        int in = str.indexOf("in");
        int in2 = str.indexOf("in", 3);
        int in3 = str.lastIndexOf("in");
       String a=str.toUpperCase();
        System.out.println(in3);
        String sub=str.substring(4);

        System.out.println(a);
        String b=str.toLowerCase();
        System.out.println(b);
        boolean c=str.startsWith("t");
        System.out.println(c);
        boolean d=str.endsWith("x");
        System.out.println(d);
        int f=250;
        String g=String.valueOf(f);
        System.out.println(f);
     int ac=-60;
        System.out.println(Integer.toBinaryString(ac));


    }
}
