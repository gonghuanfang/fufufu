package exercise;

import java.util.Random;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklnmopqrstuvwxyzABCDEFGHIJKLNMOPQRSTUVWXYZ";
        Random ran = new Random();
        int[] arr1 = new int[4];
        char[] c = new char[4];
        String[] arr=new String[4];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = ran.nextInt(10);
             arr[i]=String.valueOf(arr1[i]);
            c[i] = alphabet.charAt(ran.nextInt(52));
        }
        for (int i = 0; i < (ran.nextInt(3)+1) ; i++) {
            arr[ran.nextInt(4)] = String.valueOf(c[ran.nextInt(4)]);
        }
        System.out.print("验证码：");
       String code=arr[0]+arr[1]+arr[2]+arr[3];
        System.out.println(code);
        System.out.println("");
        System.out.println("请输入验证码:");
        Scanner scan=new Scanner(System.in );
        String ycode=code.toLowerCase();
        String userinput=scan.next();
        String input=userinput.toLowerCase();
        if(ycode.equals(input)){
            System.out.println("验证码正确");
        }else{
            System.out.println("验证码错误");
        }
    }
}

