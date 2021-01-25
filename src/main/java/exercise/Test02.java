package exercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username=scan.next();
        int l=username.length();
        if(l<1){
            System.out.println("用户名不能为空");
        }else if(l>20){
            System.out.println("用户名不能超过20个字");
        }

    }
}