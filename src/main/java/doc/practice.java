package doc;

import java.sql.SQLOutput;

public class practice {
    public static void main(String[] args) {
        String a="不足谋全局者，";
        StringBuilder builer=new StringBuilder(a);
        builer.append("不足谋一域");
        System.out.println(builer);
       builer.replace(3,5,"万世");
        builer.replace(11,12,"时");
        System.out.println(builer);
        builer.delete(0,6);
        System.out.println(builer);
        builer.insert(0,"知我者，谓我心忧，");
        builer.delete(9,15);
        builer.insert(9,"不知我者，谓我何求。");
        System.out.println(builer);
        builer.reverse();
        System.out.println(builer);
       String emill ="sjgfkjf@ljglfj.com";
       String regex="[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
       boolean match=emill.matches(regex);
       if(match){
           System.out.println("是邮箱");
       }else {
           System.out.println("不是邮箱");
       }
       String ac="jfud.shff414.8djn.hfjdh4f4.f74f.dkmf.lkdf.56sgu.nhh";
       String[] arr=ac.split("[0-9]+");
       String[]arr1=ac.split("\\.");
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            System.out.println(arr1[i]);

        }

    }
}
