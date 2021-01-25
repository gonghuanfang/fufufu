package exercise;

public class Test01 {
    public static void main(String[] args) {


        String fileName1 = "logo.png";//要png
        String fileName2 = "jquery.1.1.2.js";//要js

        String ext = getExtByName(fileName1);
        System.out.println(ext);//png
        ext = getExtByName(fileName2);
        System.out.println(ext);//js
    }
    public static String getExtByName(String name) {
        String n=name.substring((name.lastIndexOf(".")+1));
        return n;
    }
}