package string;
import java.util.Random;
public class stu {
    public static void main(String[] args) {
    Random ran=new Random();
        String[] str=new String[20];
        int sum=0;
        for(int i=0;i<str.length;i++){
        str[i]= Integer.toBinaryString(ran.nextInt(201));
        int a=str[i].length();
        while(a<=16){
          str[i]="0"+str[i];
          a++;
        }
        for(int j=0;j<16;j++){
        char n2=str[i].charAt(j);
        int n3=(int)n2;
         int n4=(int)Math.pow(n3,j);
         sum+=n4;
         }
            System.out.println(sum);
        }

    }}


